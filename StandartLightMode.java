package themes;

public class StandartLightMode implements ITheme{

    @Override
    public String getName() {
        return "Standart Lightmode";
    }

    @Override
    public String getCSS() {
        return """

            /* ===== GLOBAL ===== */
            .root {
                -fx-background-color: #ffffff;
                -fx-font-smoothing-type: lcd;
            }
            
            /* ===== SMOOTH TRANSITIONS FOR ALL ELEMENTS ===== */
            * {
                -fx-transition: all 0.3s ease;
            }

            /* ===== CODE EDITOR SYNTAX HIGHLIGHTING ===== */
            .token-keyword1 { -fx-fill: #0078d4; }
            .token-keyword2 { -fx-fill: #1e90ff; }
            .token-keyword3 { -fx-fill: #0087d4; }
            .token-comment-normal { -fx-fill: #008000; }
            .token-comment-javadoc { -fx-fill: #008000; }
            .token-comment-special { -fx-fill: #a31515; }
            .token-string-literal { -fx-fill: #4da6ff; }
            .token-char-literal { -fx-fill: #000000; }
            .token-primitive { -fx-fill: #1a8cff; }
            .token-label { -fx-fill: #1a1a1a; }
            .token-invalid { -fx-fill: #ff0000; }
            .token-default { -fx-fill: #333333; }

            /* ===== EDITOR PANE ===== */
            .moe-editor-pane {
                -fx-background-color: #ffffff;
                -fx-highlight-fill: #d0d0d0;
            }
            .moe-editor-pane .caret {
                -fx-stroke: #1e90ff;
            }
            .moe-find-result {
                -rtfx-background-color: #add6ff;
            }
            .moe-bracket-highlight {
                -rtfx-background-color: #e8e8e8;
            }
            
            /* ===== TEXT SELECTION IN CODE EDITOR (VISIBLE!) ===== */
            .moe-editor-pane .selection {
                -rtfx-background-color: #a31515;
            }
            .text-input .selection {
                -fx-background-color: #a31515;
            }
            .text-area .selection {
                -fx-background-color: #a31515;
            }
            
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

            /* ===== SCOPE COLORS (code blocks) ===== */
            .scope-colors {
                -bj-background-color: #ffffff;
                -bj-class-color: #f3f3f3;
                -bj-class-outer-color: #e8e8e8;
                -bj-class-inner-color: #f3f3f3;
                -bj-method-color: #e0e0e0;
                -bj-method-outer-color: #e8e8e8;
                -bj-selection-color: #cc3344;
                -bj-selection-outer-color: #cc3344;
                -bj-iteration-color: #3d1515;
                -bj-iteration-outer-color: #4d1a1a;
            }

            /* ===== EDITOR TOP/BOTTOM BARS - MODERN GRADIENT ===== */
            .moe-top-bar, .moe-bottom-bar {
                -fx-background-color: linear-gradient(to right, #f3f3f3, #e8e8e8);
                -fx-border-color: #d0d0d0;
                -fx-border-width: 0 0 2 0;
                -fx-padding: 5;
            }
            .moe-line-label {
                -fx-background-color: #f3f3f3;
                -fx-text-fill: #1e90ff;
                -fx-border-color: #d0d0d0;
                -fx-border-width: 0 2 0 0;
                -fx-padding: 2 8 2 8;
                -fx-font-family: "Consolas", "Monaco", monospace;
            }

            /* ===== EDITOR TABS - MODERN ROUNDED STYLE ===== */
            .tabbed-editor > .tab-header-area {
                -fx-background-color: linear-gradient(to bottom, #f3f3f3, #ffffff);
            }
            .tabbed-editor > .tab-header-area .tab {
                -fx-background-color: #f3f3f3;
                -fx-text-fill: #666666;
                -fx-border-color: transparent;
                -fx-background-radius: 8 8 0 0;
                -fx-padding: 8 16 8 16;
            }
            .tabbed-editor > .tab-header-area .tab:hover {
                -fx-background-color: #e8e8e8;
                -fx-text-fill: #4da6ff;
                -fx-scale-y: 1.05;
                -fx-effect: dropshadow(gaussian, rgba(0, 120, 212, 0.4), 8, 0, 0, 2);
            }
            .tabbed-editor > .tab-header-area .tab:selected {
                -fx-background-color: linear-gradient(to bottom, #e8e8e8, #ffffff);
                -fx-text-fill: #1e90ff;
                -fx-font-weight: bold;
                -fx-border-color: #0078d4;
                -fx-border-width: 2 2 0 2;
                -fx-scale-y: 1.08;
                -fx-effect: dropshadow(gaussian, rgba(0, 120, 212, 0.7), 12, 0, 0, 3);
            }

            /* ===== TERMINAL ===== */
            .terminal, .terminal-output {
                -fx-background-color: #ffffff;
                -fx-fill: #000000;
            }
            .terminal-input {
                -fx-fill: #ff5588;
            }
            .terminal-error {
                -fx-fill: #a31515;
            }

            /* ===== BUTTONS - MODERN GRADIENT STYLE WITH GLOW ANIMATIONS ===== */
            .button {
                -fx-background-color: linear-gradient(to bottom, #006bb3, #005a9e);
                -fx-text-fill: white;
                -fx-background-radius: 6;
                -fx-font-weight: bold;
                -fx-padding: 8 16 8 16;
                -fx-border-color: #0078d4;
                -fx-border-width: 1;
                -fx-border-radius: 6;
                -fx-effect: dropshadow(gaussian, rgba(0, 120, 212, 0.4), 8, 0, 0, 2);
            }
            .button:hover {
                -fx-background-color: linear-gradient(to bottom, #0078d4, #006bb3);
                -fx-border-color: #1e90ff;
                -fx-cursor: hand;
                -fx-scale-x: 1.05;
                -fx-scale-y: 1.05;
                -fx-effect: dropshadow(gaussian, rgba(30, 144, 255, 0.8), 15, 0, 0, 3);
            }
            .button:pressed {
                -fx-background-color: linear-gradient(to bottom, #004880, #003d6b);
                -fx-border-color: #004880;
                -fx-scale-x: 0.98;
                -fx-scale-y: 0.98;
                -fx-effect: innershadow(gaussian, rgba(0, 0, 0, 0.5), 5, 0, 0, 2);
            }

            /* ===== TEXT FIELDS - MODERN ROUNDED STYLE ===== */
            .text-field, .text-area {
                -fx-control-inner-background: #f3f3f3;
                -fx-text-fill: #000000;
                -fx-background-color: #f3f3f3;
                -fx-prompt-text-fill: #008000;
                -fx-border-color: #d0d0d0;
                -fx-border-width: 2;
                -fx-border-radius: 8;
                -fx-background-radius: 8;
                -fx-padding: 8;
                -fx-font-size: 13px;
            }
            .text-field:focused, .text-area:focused {
                -fx-border-color: #0078d4;
                -fx-background-color: #e8e8e8;
                -fx-border-width: 2;
                -fx-effect: dropshadow(gaussian, rgba(0, 120, 212, 0.6), 10, 0, 0, 0);
            }
            .text-field:hover, .text-area:hover {
                -fx-border-color: #005a9e;
                -fx-effect: dropshadow(gaussian, rgba(0, 107, 179, 0.3), 6, 0, 0, 0);
            }

            /* ===== LABELS - MODERN STYLE ===== */
            .label {
                -fx-text-fill: #000000;
                -fx-font-smoothing-type: lcd;
            }
            .label.title {
                -fx-font-size: 14px;
                -fx-font-weight: bold;
                -fx-text-fill: #1e90ff;
            }

            /* ===== COMBO BOX - MODERN GRADIENT STYLE ===== */
            .combo-box {
                -fx-background-color: linear-gradient(to bottom, #e8e8e8, #f3f3f3);
                -fx-border-color: #0078d4;
                -fx-border-width: 1;
                -fx-border-radius: 5;
                -fx-background-radius: 5;
            }
            .combo-box:hover {
                -fx-border-color: #1e90ff;
                -fx-background-color: linear-gradient(to bottom, #d0d0d0, #e8e8e8);
            }
            .combo-box .list-cell {
                -fx-background-color: #f3f3f3;
                -fx-text-fill: #000000;
            }
            .combo-box .list-cell:hover {
                -fx-background-color: #e8e8e8;
                -fx-text-fill: #1e90ff;
            }
            .combo-box-popup .list-view {
                -fx-background-color: #f3f3f3;
                -fx-border-color: #0078d4;
                -fx-border-width: 2;
            }

            /* ===== LIST VIEW - MODERN ROUNDED STYLE ===== */
            .list-view {
                -fx-background-color: #f3f3f3;
                -fx-border-color: #d0d0d0;
                -fx-border-width: 2;
                -fx-border-radius: 10;
                -fx-background-radius: 10;
            }
            .list-cell {
                -fx-background-color: transparent;
                -fx-text-fill: #000000;
                -fx-border-color: transparent;
                -fx-padding: 8;
                -fx-background-radius: 5;
            }
            .list-cell:hover {
                -fx-background-color: #e8e8e8;
                -fx-text-fill: #4da6ff;
            }
            .list-cell:selected {
                -fx-background-color: linear-gradient(to right, #005a9e, #004880);
                -fx-text-fill: #ffffff;
                -fx-font-weight: bold;
            }
            .list-cell:selected:hover {
                -fx-background-color: linear-gradient(to right, #006bb3, #005a9e);
            }

            /* ===== TABLE VIEW - MODERN ROUNDED STYLE ===== */
            .table-view {
                -fx-background-color: #f3f3f3;
                -fx-border-color: #d0d0d0;
                -fx-border-width: 2;
                -fx-border-radius: 10;
                -fx-background-radius: 10;
            }
            .table-view .column-header {
                -fx-background-color: linear-gradient(to bottom, #e8e8e8, #f3f3f3);
                -fx-text-fill: #1e90ff;
                -fx-font-weight: bold;
                -fx-border-color: #d0d0d0;
                -fx-padding: 10;
            }
            .table-view .column-header:hover {
                -fx-background-color: linear-gradient(to bottom, #d0d0d0, #e8e8e8);
            }
            .table-view .table-cell {
                -fx-background-color: transparent;
                -fx-text-fill: #000000;
                -fx-border-color: transparent;
                -fx-padding: 8;
            }
            .table-row-cell {
                -fx-background-color: transparent;
            }
            .table-row-cell:hover {
                -fx-background-color: #e8e8e8;
            }
            .table-row-cell:selected {
                -fx-background-color: linear-gradient(to right, #005a9e, #004880);
            }
            .table-row-cell:selected:hover {
                -fx-background-color: linear-gradient(to right, #006bb3, #005a9e);
            }

            /* ===== MENU BAR - MODERN GRADIENT (NO SEPARATORS!) ===== */
            .menu-bar {
                -fx-background-color: linear-gradient(to bottom, #e8e8e8, #f3f3f3);
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
                -fx-background-color: #d0d0d0;
                -fx-effect: dropshadow(gaussian, rgba(0, 120, 212, 0.3), 8, 0, 0, 2);
            }
            .menu-bar .menu:showing {
                -fx-background-color: linear-gradient(to bottom, #005a9e, #004880);
                -fx-effect: dropshadow(gaussian, rgba(0, 120, 212, 0.9), 12, 0, 0, 3);
                -fx-scale-y: 1.02;
            }
            .menu-bar .label {
                -fx-text-fill: #000000 !important;
            }
            .menu-bar .menu:showing .label {
                -fx-text-fill: #ffffff !important;
                -fx-font-weight: bold;
                -fx-effect: dropshadow(gaussian, rgba(255, 255, 255, 0.6), 4, 0, 0, 0);
            }

            /* ===== MENU ITEMS - MODERN STYLE (NO SEPARATORS!) ===== */
            .menu-item {
                -fx-background-color: transparent;
                -fx-text-fill: #000000;
                -fx-padding: 8 20 8 20;
                -fx-background-radius: 5;
                -fx-border-color: transparent;
                -fx-border-width: 0;
            }
            .menu-item:hover {
                -fx-background-color: linear-gradient(to right, #d0d0d0, #e8e8e8);
                -fx-text-fill: #4da6ff;
                -fx-scale-x: 1.02;
                -fx-effect: dropshadow(gaussian, rgba(0, 120, 212, 0.4), 8, 0, 0, 0);
            }
            .menu-item:focused {
                -fx-background-color: linear-gradient(to right, #005a9e, #004880);
                -fx-text-fill: #ffffff;
                -fx-font-weight: bold;
                -fx-effect: dropshadow(gaussian, rgba(0, 120, 212, 0.7), 10, 0, 0, 2);
            }
            .menu-item .label {
                -fx-text-fill: #000000;
            }
            .context-menu {
                -fx-background-color: #f3f3f3;
                -fx-border-color: #0078d4;
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
            
            /* ===== CHECKBOX - MODERN ROUNDED STYLE ===== */
            .check-box {
                -fx-text-fill: #000000;
            }
            .check-box > .box {
                -fx-background-color: #f3f3f3;
                -fx-border-color: #0078d4;
                -fx-border-width: 2;
                -fx-border-radius: 5;
                -fx-background-radius: 5;
                -fx-padding: 3;
            }
            .check-box:hover > .box {
                -fx-background-color: #e8e8e8;
                -fx-border-color: #1e90ff;
            }
            .check-box:selected > .box {
                -fx-background-color: linear-gradient(to bottom right, #006bb3, #005a9e);
                -fx-border-color: #1e90ff;
            }
            .check-box > .box > .mark {
                -fx-background-color: #ffffff;
                -fx-shape: "M 0 4 L 3 7 L 8 0";
            }

            /* ===== RADIO BUTTON - MODERN STYLE ===== */
            .radio-button {
                -fx-text-fill: #000000;
            }
            .radio-button > .radio {
                -fx-background-color: #f3f3f3;
                -fx-border-color: #0078d4;
                -fx-border-width: 2;
                -fx-background-radius: 12;
                -fx-border-radius: 12;
                -fx-padding: 5;
            }
            .radio-button:hover > .radio {
                -fx-background-color: #e8e8e8;
                -fx-border-color: #1e90ff;
            }
            .radio-button:selected > .radio {
                -fx-background-color: linear-gradient(to bottom right, #006bb3, #005a9e);
                -fx-border-color: #1e90ff;
            }
            .radio-button > .radio > .dot {
                -fx-background-color: #ffffff;
                -fx-background-radius: 6;
            }

            /* ===== PROGRESS BAR - MODERN ANIMATED STYLE ===== */
            .progress-bar {
                -fx-background-color: #f3f3f3;
                -fx-border-color: #d0d0d0;
                -fx-border-width: 2;
                -fx-border-radius: 10;
                -fx-background-radius: 10;
            }
            .progress-bar > .track {
                -fx-background-color: #f3f3f3;
                -fx-background-radius: 10;
            }
            .progress-bar > .bar {
                -fx-background-color: linear-gradient(to right, #006bb3, #1e90ff, #006bb3);
                -fx-background-radius: 10;
                -fx-padding: 4;
                -fx-background-insets: 0;
            }

            /* ===== PROGRESS INDICATOR - MODERN SPINNER ===== */
            .progress-indicator {
                -fx-progress-color: #0078d4;
            }
            .progress-indicator > .spinner {
                -fx-border-color: #0078d4;
                -fx-border-width: 3;
            }

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
            .menu .separator {
                -fx-background-color: transparent !important;
                -fx-border-color: transparent !important;
                -fx-padding: 0 !important;
                -fx-pref-height: 0 !important;
            }
            .menu-item .separator {
                -fx-background-color: transparent !important;
                -fx-border-color: transparent !important;
            }

            /* ===== SCROLL BARS - MODERN GRADIENT STYLE ===== */
            .scroll-bar {
                -fx-background-color: #ffffff;
            }
            .scroll-bar .thumb {
                -fx-background-color: linear-gradient(to right, #006bb3, #005a9e);
                -fx-background-radius: 8px;
                -fx-border-color: #0078d4;
                -fx-border-width: 1;
                -fx-border-radius: 8px;
            }
            .scroll-bar .thumb:hover {
                -fx-background-color: linear-gradient(to right, #0078d4, #006bb3);
                -fx-border-color: #1e90ff;
                -fx-effect: dropshadow(gaussian, rgba(0, 120, 212, 0.8), 10, 0, 0, 0);
            }
            .scroll-bar .track {
                -fx-background-color: #f3f3f3;
                -fx-background-radius: 8px;
                -fx-border-color: #e8e8e8;
                -fx-border-width: 1;
                -fx-border-radius: 8px;
                -fx-effect: innershadow(gaussian, rgba(0, 0, 0, 0.5), 5, 0, 0, 0);
            }
            .scroll-bar .increment-button, .scroll-bar .decrement-button {
                -fx-background-color: transparent;
            }

            /* ===== DIALOGS - MODERN STYLE ===== */
            .dialog-pane {
                -fx-background-color: #ffffff;
                -fx-border-color: #0078d4;
                -fx-border-width: 3;
                -fx-border-radius: 15;
                -fx-background-radius: 15;
                -fx-padding: 20;
            }
            .dialog-pane > .header-panel {
                -fx-background-color: linear-gradient(to right, #e8e8e8, #f3f3f3);
                -fx-padding: 15;
                -fx-background-radius: 15 15 0 0;
            }
            .dialog-pane > .content {
                -fx-padding: 20;
            }
            .dialog-pane .label {
                -fx-text-fill: #000000;
                -fx-font-size: 13px;
            }
            .dialog-pane > .header-panel .label {
                -fx-text-fill: #1e90ff;
                -fx-font-size: 16px;
                -fx-font-weight: bold;
            }
            .dialog-pane > .button-bar > .container > .button {
                -fx-min-width: 80px;
            }

            /* ===== TOOLTIP - MODERN STYLE ===== */
            .tooltip {
                -fx-background-color: linear-gradient(to bottom, #e8e8e8, #f3f3f3);
                -fx-text-fill: #000000;
                -fx-border-color: #0078d4;
                -fx-border-width: 2;
                -fx-border-radius: 8;
                -fx-background-radius: 8;
                -fx-padding: 8 12 8 12;
                -fx-font-size: 12px;
            }

            /* ===== REMOVE ALL WHITE STRIPS & BORDERS ===== */
            .split-pane-divider {
                -fx-background-color: #f3f3f3 !important;
                -fx-border-color: transparent !important;
            }
            .split-pane {
                -fx-background-color: #ffffff !important;
                -fx-box-border: transparent !important;
            }
            .root {
                -fx-background-color: #ffffff !important;
                -fx-border-color: transparent !important;
            }
            .pane, .region, .container {
                -fx-border-color: transparent !important;
                -fx-background-insets: 0 !important;
            }
            /* Remove white content area borders - AGGRESSIVE */
            .tab-pane > .tab-content-area {
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
                -fx-background-color: #ffffff !important;
                -fx-background-insets: 0 !important;
            }
            .tab-pane .content {
                -fx-border-color: transparent !important;
                -fx-background-color: #ffffff !important;
                -fx-background-insets: 0 !important;
            }
            .titled-pane > .title {
                -fx-background-color: linear-gradient(to right, #f3f3f3, #e8e8e8) !important;
                -fx-text-fill: #1e90ff !important;
                -fx-border-color: transparent !important;
                -fx-font-weight: bold;
            }
            .titled-pane > .content {
                -fx-background-color: #ffffff !important;
                -fx-border-color: transparent !important;
                -fx-padding: 15;
            }
            /* Remove separator blocks next to menu buttons */
            .tool-bar .separator {
                -fx-background-color: transparent !important;
                -fx-border-color: transparent !important;
                -fx-padding: 0 !important;
                -fx-pref-width: 0 !important;
            }
            .tool-bar .separator .line {
                -fx-background-color: transparent !important;
                -fx-border-color: transparent !important;
            }
            /* Modern gradient backgrounds for panels */
            .scroll-pane {
                -fx-background-color: #ffffff !important;
                -fx-border-color: transparent !important;
            }
            .scroll-pane > .viewport {
                -fx-background-color: #ffffff !important;
            }
            .scroll-pane > .corner {
                -fx-background-color: #ffffff !important;
            }

            /* ===== TAB PANE (Preferences Tabs) - ULTRA AGGRESSIVE STYLING ===== */
            .tab-pane {
                -fx-background-color: #ffffff;
                -fx-border-color: transparent;
            }
            .tab-pane > .tab-header-area {
                -fx-background-color: #f3f3f3;
                -fx-border-color: transparent;
            }
            .tab-pane > .tab-header-area > .headers-region {
                -fx-background-color: #f3f3f3;
                -fx-border-color: transparent;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab {
                -fx-background-color: linear-gradient(to bottom, #e8e8e8, #f3f3f3) !important;
                -fx-text-fill: #000000 !important;
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
                -fx-background-insets: 0 !important;
                -fx-background-radius: 5 5 0 0 !important;
                -fx-padding: 10 20 10 20 !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:hover {
                -fx-background-color: linear-gradient(to bottom, #d0d0d0, #e8e8e8) !important;
                -fx-text-fill: #4da6ff !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:focused {
                -fx-background-color: linear-gradient(to bottom, #e8e8e8, #f3f3f3) !important;
                -fx-border-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab > .tab-container {
                -fx-background-color: transparent !important;
                -fx-border-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab > .tab-container > .tab-label {
                -fx-text-fill: #000000 !important;
                -fx-background-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab .label {
                -fx-text-fill: #000000 !important;
                -fx-text-base-color: #000000 !important;
                -fx-background-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab Text {
                -fx-fill: #000000 !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected {
                -fx-background-color: linear-gradient(to bottom, #006bb3, #005a9e) !important;
                -fx-text-fill: #ffffff !important;
                -fx-background-insets: 0 !important;
                -fx-background-radius: 5 5 0 0 !important;
                -fx-border-color: transparent !important;
                -fx-font-weight: bold;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected:hover {
                -fx-background-color: linear-gradient(to bottom, #0078d4, #006bb3) !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected:focused {
                -fx-background-color: linear-gradient(to bottom, #006bb3, #005a9e) !important;
                -fx-border-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected > .tab-container {
                -fx-background-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected > .tab-container > .tab-label {
                -fx-text-fill: #ffffff !important;
                -fx-background-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected .label {
                -fx-text-fill: #ffffff !important;
                -fx-text-base-color: #ffffff !important;
                -fx-background-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected Text {
                -fx-fill: #ffffff !important;
            }
            .tab-pane > .tab-header-area > .tab-header-background {
                -fx-background-color: #f3f3f3;
            }
            .tab {
                -fx-background-color: #e8e8e8 !important;
                -fx-text-fill: #000000 !important;
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
            }
            .tab .label {
                -fx-text-fill: #000000 !important;
                -fx-text-base-color: #000000 !important;
            }
            .tab Text {
                -fx-fill: #000000 !important;
            }
            .tab:selected {
                -fx-background-color: #005a9e !important;
                -fx-text-fill: #ffffff !important;
            }
            .tab:selected .label {
                -fx-text-fill: #ffffff !important;
                -fx-text-base-color: #ffffff !important;
            }
            .tab:selected Text {
                -fx-fill: #ffffff !important;
            }
            .tab-header-background {
                -fx-background-color: #f3f3f3;
            }
            
            /* ===== REMOVE ALL CONTAINER BORDERS ===== */
            .titled-pane, .split-pane, .scroll-pane, .list-view, .table-view,
            .combo-box, .text-field, .text-area, .button, .label {
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
            }

            /* ===== TOOLTIPS ===== */
            .tooltip {
                -fx-background-color: #e8e8e8;
                -fx-text-fill: #000000;
                -fx-background-radius: 4;
                -fx-border-color: #005a9e;
            }

            /* ===== PACKAGE MANAGER ===== */
            .class-target {
                -fx-background-color: #ff6633;
            }
            .class-target:hover {
                -fx-background-color: #ff8855;
            }
                        """;
    }
}
