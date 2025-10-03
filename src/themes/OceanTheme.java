package themes;

public class OceanTheme implements ITheme {
    @Override
    public String getName() {
        return "Deep Ocean";
    }

    @Override
    public String getCSS() {
        return """
                /* ===== GLOBAL ===== */
                .root {
                    -fx-background-color: #001f33;
                    -fx-font-smoothing-type: lcd;
                }
               \s
                /* ===== SMOOTH TRANSITIONS FOR ALL ELEMENTS ===== */
                * {
                    -fx-transition: all 0.3s ease;
                }
               \s
                /* ===== CODE EDITOR SYNTAX HIGHLIGHTING ===== */
                .token-keyword1 { -fx-fill: #00aaff; }
                .token-keyword2 { -fx-fill: #33ccff; }
                .token-keyword3 { -fx-fill: #0099cc; }
                .token-comment-normal { -fx-fill: #006680; }
                .token-comment-javadoc { -fx-fill: #0088aa; }
                .token-comment-special { -fx-fill: #005566; }
                .token-string-literal { -fx-fill: #33ccff; }
                .token-char-literal { -fx-fill: #66ddee; }
                .token-primitive { -fx-fill: #00bbcc; }
                .token-label { -fx-fill: #99eeff; }
                .token-invalid { -fx-fill: #ff0000; }
                .token-default { -fx-fill: #cceeff; }
               \s
                /* ===== EDITOR PANE ===== */
                .moe-editor-pane {
                    -fx-background-color: #001f33;
                    -fx-highlight-fill: #00334d;
                }
                .moe-editor-pane .caret {
                    -fx-stroke: #33ccff;
                }
                .moe-find-result {
                    -rtfx-background-color: #004d66;
                }
                .moe-bracket-highlight {
                    -rtfx-background-color: #00334d;
                }
               \s
                /* ===== TEXT SELECTION IN CODE EDITOR (VISIBLE!) ===== */
                .moe-editor-pane .selection {
                    -rtfx-background-color: #005580;
                }
                .text-input .selection {
                    -fx-background-color: #005580;
                }
                .text-area .selection {
                    -fx-background-color: #005580;
                }
               \s
                /* ===== TEXT CURSOR IN CODE EDITOR ===== */
                .moe-editor-pane {
                    -fx-cursor: text;
                }
                .moe-editor-pane .text {
                    -fx-cursor: text;
                }
                .moe-editor-pane .paragraph-box {
                    -fx-cursor: text;
                }
                .code-area, .styled-text-area {
                    -fx-cursor: text;
                }
                .code-area .text, .styled-text-area .text {
                    -fx-cursor: text;
                }
                .text-input, .text-input .text {
                    -fx-cursor: text;
                }
               \s
                /* ===== SCOPE COLORS (code blocks) ===== */
                .scope-colors {
                    -bj-background-color: #001f33;
                    -bj-class-color: #00334d;
                    -bj-class-outer-color: #004d66;
                    -bj-class-inner-color: #00334d;
                    -bj-method-color: #002940;
                    -bj-method-outer-color: #00334d;
                    -bj-selection-color: #007799;
                    -bj-selection-outer-color: #007799;
                    -bj-iteration-color: #003d4d;
                    -bj-iteration-outer-color: #004d66;
                }
               \s
                /* ===== EDITOR TOP/BOTTOM BARS - MODERN GRADIENT ===== */
                .moe-top-bar, .moe-bottom-bar {
                    -fx-background-color: linear-gradient(to right, #00334d, #004d66);
                    -fx-border-color: #005580;
                    -fx-border-width: 0 0 2 0;
                    -fx-padding: 5;
                }
                .moe-line-label {
                    -fx-background-color: #00334d;
                    -fx-text-fill: #33ccff;
                    -fx-border-color: #005580;
                    -fx-border-width: 0 2 0 0;
                    -fx-padding: 2 8 2 8;
                    -fx-font-family: "Consolas", "Monaco", monospace;
                }
               \s
                /* ===== EDITOR TABS - MODERN ROUNDED STYLE ===== */
                .tabbed-editor > .tab-header-area {
                    -fx-background-color: linear-gradient(to bottom, #00334d, #001f33);
                }
                .tabbed-editor > .tab-header-area .tab {
                    -fx-background-color: #00334d;
                    -fx-text-fill: #33aaff;
                    -fx-border-color: transparent;
                    -fx-background-radius: 8 8 0 0;
                    -fx-padding: 8 16 8 16;
                }
                .tabbed-editor > .tab-header-area .tab:hover {
                    -fx-background-color: #004d66;
                    -fx-text-fill: #66ddee;
                    -fx-scale-y: 1.05;
                    -fx-effect: dropshadow(gaussian, rgba(51, 204, 255, 0.4), 8, 0, 0, 2);
                }
                .tabbed-editor > .tab-header-area .tab:selected {
                    -fx-background-color: linear-gradient(to bottom, #004d66, #001f33);
                    -fx-text-fill: #33ccff;
                    -fx-font-weight: bold;
                    -fx-border-color: #00aaff;
                    -fx-border-width: 2 2 0 2;
                    -fx-scale-y: 1.08;
                    -fx-effect: dropshadow(gaussian, rgba(51, 204, 255, 0.7), 12, 0, 0, 3);
                }
               \s
                /* ===== TERMINAL ===== */
                .terminal, .terminal-output {
                    -fx-background-color: #001f33;
                    -fx-fill: #66ddee;
                }
                .terminal-input {
                    -fx-fill: #33ccff;
                }
                .terminal-error {
                    -fx-fill: #ff3355;
                }
               \s
                /* ===== BUTTONS - MODERN GRADIENT STYLE WITH GLOW ANIMATIONS ===== */
                .button {
                    -fx-background-color: linear-gradient(to bottom, #007799, #005580);
                    -fx-text-fill: white;
                    -fx-background-radius: 6;
                    -fx-font-weight: bold;
                    -fx-padding: 8 16 8 16;
                    -fx-border-color: #00aaff;
                    -fx-border-width: 1;
                    -fx-border-radius: 6;
                    -fx-effect: dropshadow(gaussian, rgba(51, 204, 255, 0.4), 8, 0, 0, 2);
                }
                .button:hover {
                    -fx-background-color: linear-gradient(to bottom, #00aaff, #007799);
                    -fx-border-color: #33ccff;
                    -fx-cursor: hand;
                    -fx-scale-x: 1.05;
                    -fx-scale-y: 1.05;
                    -fx-effect: dropshadow(gaussian, rgba(51, 204, 255, 0.8), 15, 0, 0, 3);
                }
                .button:pressed {
                    -fx-background-color: linear-gradient(to bottom, #004d66, #00334d);
                    -fx-border-color: #004d66;
                    -fx-scale-x: 0.98;
                    -fx-scale-y: 0.98;
                    -fx-effect: innershadow(gaussian, rgba(0, 0, 0, 0.5), 5, 0, 0, 2);
                }
               \s
                /* ===== TEXT FIELDS - MODERN ROUNDED STYLE ===== */
                .text-field, .text-area {
                    -fx-control-inner-background: #00334d;
                    -fx-text-fill: #66ddee;
                    -fx-background-color: #00334d;
                    -fx-prompt-text-fill: #005580;
                    -fx-border-color: #005580;
                    -fx-border-width: 2;
                    -fx-border-radius: 8;
                    -fx-background-radius: 8;
                    -fx-padding: 8;
                    -fx-font-size: 13px;
                }
                .text-field:focused, .text-area:focused {
                    -fx-border-color: #00aaff;
                    -fx-background-color: #004d66;
                    -fx-border-width: 2;
                    -fx-effect: dropshadow(gaussian, rgba(51, 204, 255, 0.6), 10, 0, 0, 0);
                }
                .text-field:hover, .text-area:hover {
                    -fx-border-color: #007799;
                    -fx-effect: dropshadow(gaussian, rgba(0, 119, 153, 0.3), 6, 0, 0, 0);
                }
               \s
                /* ===== LABELS - MODERN STYLE ===== */
                .label {
                    -fx-text-fill: #66ddee;
                    -fx-font-smoothing-type: lcd;
                }
                .label.title {
                    -fx-font-size: 14px;
                    -fx-font-weight: bold;
                    -fx-text-fill: #33ccff;
                }
               \s
                /* ===== COMBO BOX - MODERN GRADIENT STYLE ===== */
                .combo-box {
                    -fx-background-color: linear-gradient(to bottom, #004d66, #00334d);
                    -fx-border-color: #00aaff;
                    -fx-border-width: 1;
                    -fx-border-radius: 5;
                    -fx-background-radius: 5;
                }
                .combo-box:hover {
                    -fx-border-color: #33ccff;
                    -fx-background-color: linear-gradient(to bottom, #005580, #004d66);
                }
                .combo-box .list-cell {
                    -fx-background-color: #00334d;
                    -fx-text-fill: #66ddee;
                }
                .combo-box .list-cell:hover {
                    -fx-background-color: #004d66;
                    -fx-text-fill: #33ccff;
                }
                .combo-box-popup .list-view {
                    -fx-background-color: #00334d;
                    -fx-border-color: #00aaff;
                    -fx-border-width: 2;
                }
               \s
                /* ===== LIST VIEW - MODERN ROUNDED STYLE ===== */
                .list-view {
                    -fx-background-color: #00334d;
                    -fx-border-color: #005580;
                    -fx-border-width: 2;
                    -fx-border-radius: 10;
                    -fx-background-radius: 10;
                }
                .list-cell {
                    -fx-background-color: transparent;
                    -fx-text-fill: #66ddee;
                    -fx-border-color: transparent;
                    -fx-padding: 8;
                    -fx-background-radius: 5;
                }
                .list-cell:hover {
                    -fx-background-color: #004d66;
                    -fx-text-fill: #33ccff;
                }
                .list-cell:selected {
                    -fx-background-color: linear-gradient(to right, #007799, #005580);
                    -fx-text-fill: #ffffff;
                    -fx-font-weight: bold;
                }
                .list-cell:selected:hover {
                    -fx-background-color: linear-gradient(to right, #00aaff, #007799);
                }
               \s
                /* ===== TABLE VIEW - MODERN ROUNDED STYLE ===== */
                .table-view {
                    -fx-background-color: #00334d;
                    -fx-border-color: #005580;
                    -fx-border-width: 2;
                    -fx-border-radius: 10;
                    -fx-background-radius: 10;
                }
                .table-view .column-header {
                    -fx-background-color: linear-gradient(to bottom, #004d66, #00334d);
                    -fx-text-fill: #33ccff;
                    -fx-font-weight: bold;
                    -fx-border-color: #005580;
                    -fx-padding: 10;
                }
                .table-view .column-header:hover {
                    -fx-background-color: linear-gradient(to bottom, #005580, #004d66);
                }
                .table-view .table-cell {
                    -fx-background-color: transparent;
                    -fx-text-fill: #66ddee;
                    -fx-border-color: transparent;
                    -fx-padding: 8;
                }
                .table-row-cell {
                    -fx-background-color: transparent;
                }
                .table-row-cell:hover {
                    -fx-background-color: #004d66;
                }
                .table-row-cell:selected {
                    -fx-background-color: linear-gradient(to right, #007799, #005580);
                }
                .table-row-cell:selected:hover {
                    -fx-background-color: linear-gradient(to right, #00aaff, #007799);
                }
               \s
                /* ===== MENU BAR - MODERN GRADIENT (NO SEPARATORS!) ===== */
                .menu-bar {
                    -fx-background-color: linear-gradient(to bottom, #004d66, #00334d);
                    -fx-border-color: transparent;
                    -fx-border-width: 0;
                    -fx-padding: 5;
                }
                .menu-bar .menu {
                    -fx-background-color: transparent;
                    -fx-padding: 5 15 5 15;
                    -fx-background-radius: 5;
                }
                .menu-bar .menu:hover {
                    -fx-background-color: #005580;
                    -fx-effect: dropshadow(gaussian, rgba(51, 204, 255, 0.3), 8, 0, 0, 2);
                }
                .menu-bar .menu:showing {
                    -fx-background-color: linear-gradient(to bottom, #007799, #005580);
                    -fx-effect: dropshadow(gaussian, rgba(51, 204, 255, 0.9), 12, 0, 0, 3);
                    -fx-scale-y: 1.02;
                }
                .menu-bar .label {
                    -fx-text-fill: #66ddee !important;
                }
                .menu-bar .menu:showing .label {
                    -fx-text-fill: #ffffff !important;
                    -fx-font-weight: bold;
                    -fx-effect: dropshadow(gaussian, rgba(255, 255, 255, 0.6), 4, 0, 0, 0);
                }
               \s
                /* ===== MENU ITEMS - MODERN STYLE (NO SEPARATORS!) ===== */
                .menu-item {
                    -fx-background-color: transparent;
                    -fx-text-fill: #66ddee;
                    -fx-padding: 8 20 8 20;
                    -fx-background-radius: 5;
                    -fx-border-color: transparent;
                    -fx-border-width: 0;
                }
                .menu-item:hover {
                    -fx-background-color: linear-gradient(to right, #005580, #004d66);
                    -fx-text-fill: #33ccff;
                    -fx-scale-x: 1.02;
                    -fx-effect: dropshadow(gaussian, rgba(51, 204, 255, 0.4), 8, 0, 0, 0);
                }
                .menu-item:focused {
                    -fx-background-color: linear-gradient(to right, #007799, #005580);
                    -fx-text-fill: #ffffff;
                    -fx-font-weight: bold;
                    -fx-effect: dropshadow(gaussian, rgba(51, 204, 255, 0.7), 10, 0, 0, 2);
                }
                .menu-item .label {
                    -fx-text-fill: #66ddee;
                }
                .context-menu {
                    -fx-background-color: #00334d;
                    -fx-border-color: #00aaff;
                    -fx-border-width: 2;
                    -fx-border-radius: 8;
                    -fx-background-radius: 8;
                    -fx-padding: 5;
                }
                .context-menu .separator {
                    -fx-background-color: transparent;
                    -fx-border-color: transparent;
                    -fx-padding: 0;
                    -fx-pref-height: 0;
                }
                .context-menu .separator .line {
                    -fx-background-color: transparent;
                    -fx-border-color: transparent;
                }
               \s
                /* ===== CHECKBOX - MODERN ROUNDED STYLE ===== */
                .check-box {
                    -fx-text-fill: #66ddee;
                }
                .check-box > .box {
                    -fx-background-color: #00334d;
                    -fx-border-color: #00aaff;
                    -fx-border-width: 2;
                    -fx-border-radius: 5;
                    -fx-background-radius: 5;
                    -fx-padding: 3;
                }
                .check-box:hover > .box {
                    -fx-background-color: #004d66;
                    -fx-border-color: #33ccff;
                }
                .check-box:selected > .box {
                    -fx-background-color: linear-gradient(to bottom right, #007799, #005580);
                    -fx-border-color: #33ccff;
                }
                .check-box > .box > .mark {
                    -fx-background-color: #ffffff;
                    -fx-shape: "M 0 4 L 3 7 L 8 0";
                }
               \s
                /* ===== RADIO BUTTON - MODERN STYLE ===== */
                .radio-button {
                    -fx-text-fill: #66ddee;
                }
                .radio-button > .radio {
                    -fx-background-color: #00334d;
                    -fx-border-color: #00aaff;
                    -fx-border-width: 2;
                    -fx-background-radius: 12;
                    -fx-border-radius: 12;
                    -fx-padding: 5;
                }
                .radio-button:hover > .radio {
                    -fx-background-color: #004d66;
                    -fx-border-color: #33ccff;
                }
                .radio-button:selected > .radio {
                    -fx-background-color: linear-gradient(to bottom right, #007799, #005580);
                    -fx-border-color: #33ccff;
                }
                .radio-button > .radio > .dot {
                    -fx-background-color: #ffffff;
                    -fx-background-radius: 6;
                }
               \s
                /* ===== PROGRESS BAR - MODERN ANIMATED STYLE ===== */
                .progress-bar {
                    -fx-background-color: #00334d;
                    -fx-border-color: #005580;
                    -fx-border-width: 2;
                    -fx-border-radius: 10;
                    -fx-background-radius: 10;
                }
                .progress-bar > .track {
                    -fx-background-color: #00334d;
                    -fx-background-radius: 10;
                }
                .progress-bar > .bar {
                    -fx-background-color: linear-gradient(to right, #007799, #33ccff, #007799);
                    -fx-background-radius: 10;
                    -fx-padding: 4;
                    -fx-background-insets: 0;
                }
               \s
                /* ===== PROGRESS INDICATOR - MODERN SPINNER ===== */
                .progress-indicator {
                    -fx-progress-color: #00aaff;
                }
                .progress-indicator > .spinner {
                    -fx-border-color: #00aaff;
                    -fx-border-width: 3;
                }
               \s
                /* ===== REMOVE ALL SEPARATORS AND BORDERS (CRITICAL!) ===== */
                .separator {
                    -fx-background-color: transparent !important;
                    -fx-border-color: transparent !important;
                    -fx-padding: 0 !important;
                    -fx-pref-height: 0 !important;
                    -fx-pref-width: 0 !important;
                    -fx-max-height: 0 !important;
                    -fx-max-width: 0 !important;
                }
                .separator .line {
                    -fx-background-color: transparent !important;
                    -fx-border-color: transparent !important;
                    -fx-pref-height: 0 !important;
                    -fx-pref-width: 0 !important;
                }
                Here is a new CSS file starting from the `.menu .separator` line, modified to reflect a "deep ocean" theme. The colors have been adjusted to shades of blue, teal, and dark tones to match the theme.
               \s
                    ```css
                    /* ===== MENU ITEMS - DEEP OCEAN STYLE ===== */
                    .menu .separator {
                        -fx-background-color: transparent !important;
                        -fx-border-color: transparent !important;
                        -fx-padding: 0 !important;
                        -fx-pref-height: 0 !important;
                    }
                    .menu-item {
                        -fx-background-color: transparent;
                        -fx-text-fill: #a0d8ef; /* Light teal */
                        -fx-padding: 8 20 8 20;
                        -fx-background-radius: 5;
                        -fx-border-color: transparent;
                        -fx-border-width: 0;
                    }
                    .menu-item:hover {
                        -fx-background-color: linear-gradient(to right, #1b3b5f, #102a44); /* Deep blue gradient */
                        -fx-text-fill: #c0e8ff; /* Soft blue */
                        -fx-scale-x: 1.02;
                        -fx-effect: dropshadow(gaussian, rgba(64, 128, 192, 0.4), 8, 0, 0, 0);
                    }
                    .menu-item:focused {
                        -fx-background-color: linear-gradient(to right, #2a5673, #1b3b5f); /* Darker blue gradient */
                        -fx-text-fill: #ffffff;
                        -fx-font-weight: bold;
                        -fx-effect: dropshadow(gaussian, rgba(64, 128, 192, 0.7), 10, 0, 0, 2);
                    }
                    .menu-item .label {
                        -fx-text-fill: #a0d8ef;
                    }
                    .context-menu {
                        -fx-background-color: #102a44; /* Dark ocean blue */
                        -fx-border-color: #1b3b5f; /* Deep blue */
                        -fx-border-width: 2;
                        -fx-border-radius: 8;
                        -fx-background-radius: 8;
                        -fx-padding: 5;
                    }
                    .context-menu .separator {
                        -fx-background-color: transparent;
                        -fx-border-color: transparent;
                        -fx-padding: 0;
                        -fx-pref-height: 0;
                    }
                    .context-menu .separator .line {
                        -fx-background-color: transparent;
                        -fx-border-color: transparent;
                    }
               \s
                    /* ===== SCROLL BARS - DEEP OCEAN STYLE ===== */
                    .scroll-bar {
                        -fx-background-color: #0a1e2e; /* Very dark blue */
                    }
                    .scroll-bar .thumb {
                        -fx-background-color: linear-gradient(to right, #1b5673, #2a7a9c); /* Ocean gradient */
                        -fx-background-radius: 8px;
                        -fx-border-color: #1b3b5f;
                        -fx-border-width: 1;
                        -fx-border-radius: 8px;
                    }
                    .scroll-bar .thumb:hover {
                        -fx-background-color: linear-gradient(to right, #2a7a9c, #1b5673); /* Reversed gradient */
                        -fx-border-color: #2a7a9c;
                        -fx-effect: dropshadow(gaussian, rgba(42, 122, 156, 0.8), 10, 0, 0, 0);
                    }
                    .scroll-bar .track {
                        -fx-background-color: #102a44;
                        -fx-background-radius: 8px;
                        -fx-border-color: #1b3b5f;
                        -fx-border-width: 1;
                        -fx-border-radius: 8px;
                        -fx-effect: innershadow(gaussian, rgba(0, 0, 0, 0.5), 5, 0, 0, 0);
                    }
                    .scroll-bar .increment-button, .scroll-bar .decrement-button {
                        -fx-background-color: transparent;
                    }
               \s
                    /* ===== DIALOGS - DEEP OCEAN STYLE ===== */
                    .dialog-pane {
                        -fx-background-color: #0a1e2e;
                        -fx-border-color: #1b5673;
                        -fx-border-width: 3;
                        -fx-border-radius: 15;
                        -fx-background-radius: 15;
                        -fx-padding: 20;
                    }
                    .dialog-pane > .header-panel {
                        -fx-background-color: linear-gradient(to right, #1b3b5f, #102a44);
                        -fx-padding: 15;
                        -fx-background-radius: 15 15 0 0;
                    }
                    .dialog-pane > .content {
                        -fx-padding: 20;
                    }
                    .dialog-pane .label {
                        -fx-text-fill: #a0d8ef;
                        -fx-font-size: 13px;
                    }
                    .dialog-pane > .header-panel .label {
                        -fx-text-fill: #c0e8ff;
                        -fx-font-size: 16px;
                        -fx-font-weight: bold;
                    }
                    .dialog-pane > .button-bar > .container > .button {
                        -fx-min-width: 80px;
                    }
                   \s
                    /* ===== TOOLTIP - DEEP OCEAN STYLE ===== */
                    .tooltip {
                        -fx-background-color: linear-gradient(to bottom, #1b3b5f, #102a44);
                        -fx-text-fill: #a0d8ef;
                        -fx-border-color: #1b5673;
                        -fx-border-width: 2;
                        -fx-border-radius: 8;
                        -fx-background-radius: 8;
                        -fx-padding: 8 12 8 12;
                        -fx-font-size: 12px;
                    }

            /* ===== PACKAGE MANAGER ===== */
            .class-target {
                -fx-background-color: #ff6633;
            }
            .class-target:hover {
                -fx-background-color: #ff8855;
            }
              \s""";
    }
}
