import bluej.debugmgr.codepad.CodePad;
import bluej.editor.base.LineContainer;
import bluej.editor.flow.FlowEditor;
import bluej.extensions2.BlueJ;
import bluej.extensions2.PreferenceGenerator;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Window;
import themes.ITheme;

import java.util.HashMap;
import java.util.Map;
import java.util.prefs.Preferences;
import java.util.stream.Collectors;

public class ThemeManager implements PreferenceGenerator {
    private static final Preferences prefs = Preferences.userRoot().node("ThemeSwitcher");
    private static final String PREF_KEY = "theme";
    private static String currentTheme = prefs.get(PREF_KEY, "Normal");
    private static String cachedCss = null;
    private static boolean listenerAdded = false;

    private Pane myPane;
    private BlueJ bluej;

    public static HashMap<String, Class<? extends ITheme>> availableThemes = new HashMap<>(Map.ofEntries(
            Map.entry("Standart Lightmode", themes.StandartLightMode.class),
            Map.entry("Standart Darkmode", themes.StandartDarkMode.class),
            Map.entry("Deep Ocean", themes.OceanTheme.class),
            Map.entry("Neon Wave", themes.NeonWaveTheme.class)
    ));

    public ThemeManager(BlueJ bluej) {
        this.bluej = bluej;
        myPane = new Pane();

        Label label = new Label("Theme:");
        ComboBox<String> themeSelector = new ComboBox<>(availableThemes.keySet().stream().sorted().collect(Collectors.toCollection(FXCollections::observableArrayList)));
        themeSelector.setValue(currentTheme);

        themeSelector.setOnAction(e -> {
            currentTheme = themeSelector.getValue();
            prefs.put(PREF_KEY, currentTheme);
            applyTheme(currentTheme);
        });

        HBox container = new HBox(10, label, themeSelector);
        container.setStyle("-fx-padding: 10;");
        myPane.getChildren().add(container);

        // Auto-apply saved theme and set up listener for new windows
        if (!listenerAdded) {
            setupWindowListener();
            listenerAdded = true;
        }
        applyTheme(currentTheme);
    }

    private static void setupWindowListener() {
        // Monitor for new windows and auto-apply theme
        javafx.application.Platform.runLater(() -> {
            javafx.collections.ObservableList<Window> windows = Window.getWindows();
            windows.addListener((javafx.collections.ListChangeListener<Window>) change -> {
                while (change.next()) {
                    if (change.wasAdded()) {
                        for (Window window : change.getAddedSubList()) {
                            javafx.application.Platform.runLater(() -> {
                                if (window.getScene() != null && cachedCss != null) {
                                    applyThemeToWindow(window);
                                }
                            });
                        }
                    }
                }
            });
        });
    }

    private static void applyThemeToWindow(Window window) {
        Scene scene = window.getScene();
        if (scene != null && cachedCss != null) {
            scene.getStylesheets().clear();
            scene.getStylesheets().add(cachedCss);
        }
    }

    public static void applyTheme(String theme) {
        String css;

        try {
            Class<? extends ITheme> themeClass = availableThemes.get(theme);
            ITheme themeInstance = themeClass != null ? themeClass.getDeclaredConstructor().newInstance() : null;
            css = themeInstance != null ? themeInstance.getCSS() : "";
        }catch(Exception e) {
            css = "";
        }

        String encodedCss = "data:text/css," + css.replace("\n", "%0A").replace(" ", "%20");
        cachedCss = encodedCss;

        for (Window window : Window.getWindows()) {
            Scene scene = window.getScene();
            if (scene != null) {
                scene.getStylesheets().clear();
                scene.getStylesheets().add(encodedCss);
            }
        }
    }

    public static String getCurrentTheme() {
        return currentTheme;
    }

    @Override
    public Pane getWindow() {
        return myPane;
    }

    @Override
    public void loadValues() {
    }

    @Override
    public void saveValues() {
    }
}
