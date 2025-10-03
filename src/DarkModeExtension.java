import bluej.extensions2.*;
import bluej.extensions2.event.PackageEvent;
import bluej.extensions2.event.PackageListener;

public class DarkModeExtension extends Extension implements PackageListener{

    public static DarkModeExtension INSTANCE;

    public DarkModeExtension() {
        INSTANCE = this;
    }

    @Override
    public void startup(BlueJ bluej) {
        bluej.setPreferenceGenerator(new ThemeManager(bluej));
        bluej.addPackageListener(this);

        ThemeManager.applyTheme(ThemeManager.getCurrentTheme());
    }

    @Override
    public boolean isCompatible() {
        return true;
    }

    @Override
    public String getName() {
        return "Simple Color Themes";
    }

    @Override
    public String getVersion() {
        return "";
    }

    @Override
    public void packageOpened(PackageEvent packageEvent) {
        ThemeManager.applyTheme(ThemeManager.getCurrentTheme());
    }

    @Override
    public void packageClosing(PackageEvent packageEvent) {}
}