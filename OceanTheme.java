package themes;

public class OceanTheme implements ITheme{

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
            
            /* ===== SMOOTH TRANSITIONS FOR ALL ELEMENTS ===== */
            * {
                -fx-transition: all 0.3s ease;
            }

            /* ===== CODE EDITOR SYNTAX HIGHLIGHTING ===== */
            .token-keyword1 { -fx-fill: #00aaff; }
            .token-keyword2 { -fx-fill: #33bbff; }
            .token-keyword3 { -fx-fill: #00a0e0; }
            .token-comment-normal { -fx-fill: #4d9999; }
            .token-comment-javadoc { -fx-fill: #5daaaa; }
            .token-comment-special { -fx-fill: #66ddaa; }
            .token-string-literal { -fx-fill: #66ddaa; }
            .token-char-literal { -fx-fill: #c5e8ff; }
            .token-primitive { -fx-fill: #00b8ff; }
            .token-label { -fx-fill: #d0f0ff; }
            .token-invalid { -fx-fill: #ff0000; }
            .token-default { -fx-fill: #b0d8ee; }

            /* ===== EDITOR PANE ===== */
            .moe-editor-pane {
                -fx-background-color: #001f33;
                -fx-highlight-fill: #004455;
            }
            .moe-editor-pane .caret {
                -fx-stroke: #33bbff;
            }
            .moe-find-result {
                -rtfx-background-color: #003d66;
            }
            .moe-bracket-highlight {
                -rtfx-background-color: #003344;
            }
            
            /* ===== TEXT SELECTION IN CODE EDITOR (VISIBLE!) ===== */
            .moe-editor-pane .selection {
                -rtfx-background-color: #66ddaa;
            }
            .text-input .selection {
                -fx-background-color: #66ddaa;
            }
            .text-area .selection {
                -fx-background-color: #66ddaa;
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
                -bj-background-color: #001f33;
                -bj-class-color: #002233;
                -bj-class-outer-color: #003344;
                -bj-class-inner-color: #002233;
                -bj-method-color: #002a44;
                -bj-method-outer-color: #003344;
                -bj-selection-color: #cc3344;
                -bj-selection-outer-color: #cc3344;
                -bj-iteration-color: #3d1515;
                -bj-iteration-outer-color: #4d1a1a;
            }

            /* ===== EDITOR TOP/BOTTOM BARS - MODERN GRADIENT ===== */
            .moe-top-bar, .moe-bottom-bar {
                -fx-background-color: linear-gradient(to right, #002233, #003344);
                -fx-border-color: #004455;
                -fx-border-width: 0 0 2 0;
                -fx-padding: 5;
            }
            .moe-line-label {
                -fx-background-color: #002233;
                -fx-text-fill: #33bbff;
                -fx-border-color: #004455;
                -fx-border-width: 0 2 0 0;
                -fx-padding: 2 8 2 8;
                -fx-font-family: "Consolas", "Monaco", monospace;
            }

            /* ===== EDITOR TABS - MODERN ROUNDED STYLE ===== */
            .tabbed-editor > .tab-header-area {
                -fx-background-color: linear-gradient(to bottom, #002233, #001f33);
            }
            .tabbed-editor > .tab-header-area .tab {
                -fx-background-color: #002233;
                -fx-text-fill: #8dc5dd;
                -fx-border-color: transparent;
                -fx-background-radius: 8 8 0 0;
                -fx-padding: 8 16 8 16;
            }
            .tabbed-editor > .tab-header-area .tab:hover {
                -fx-background-color: #003344;
                -fx-text-fill: #66ddaa;
                -fx-scale-y: 1.05;
                -fx-effect: dropshadow(gaussian, rgba(0, 170, 255, 0.4), 8, 0, 0, 2);
            }
            .tabbed-editor > .tab-header-area .tab:selected {
                -fx-background-color: linear-gradient(to bottom, #003344, #001f33);
                -fx-text-fill: #33bbff;
                -fx-font-weight: bold;
                -fx-border-color: #00aaff;
                -fx-border-width: 2 2 0 2;
                -fx-scale-y: 1.08;
                -fx-effect: dropshadow(gaussian, rgba(0, 170, 255, 0.7), 12, 0, 0, 3);
            }

            /* ===== TERMINAL ===== */
            .terminal, .terminal-output {
                -fx-background-color: #001f33;
                -fx-fill: #c5e8ff;
            }
            .terminal-input {
                -fx-fill: #ff5588;
            }
            .terminal-error {
                -fx-fill: #66ddaa;
            }

            /* ===== BUTTONS - MODERN GRADIENT STYLE WITH GLOW ANIMATIONS ===== */
            .button {
                -fx-background-color: linear-gradient(to bottom, #0099dd, #0088cc);
                -fx-text-fill: white;
                -fx-background-radius: 6;
                -fx-font-weight: bold;
                -fx-padding: 8 16 8 16;
                -fx-border-color: #00aaff;
                -fx-border-width: 1;
                -fx-border-radius: 6;
                -fx-effect: dropshadow(gaussian, rgba(0, 170, 255, 0.4), 8, 0, 0, 2);
            }
            .button:hover {
                -fx-background-color: linear-gradient(to bottom, #00aaff, #0099dd);
                -fx-border-color: #33bbff;
                -fx-cursor: hand;
                -fx-scale-x: 1.05;
                -fx-scale-y: 1.05;
                -fx-effect: dropshadow(gaussian, rgba(51, 187, 255, 0.8), 15, 0, 0, 3);
            }
            .button:pressed {
                -fx-background-color: linear-gradient(to bottom, #0077bb, #0066aa);
                -fx-border-color: #0077bb;
                -fx-scale-x: 0.98;
                -fx-scale-y: 0.98;
                -fx-effect: innershadow(gaussian, rgba(0, 0, 0, 0.5), 5, 0, 0, 2);
            }

            /* ===== TEXT FIELDS - MODERN ROUNDED STYLE ===== */
            .text-field, .text-area {
                -fx-control-inner-background: #002233;
                -fx-text-fill: #c5e8ff;
                -fx-background-color: #002233;
                -fx-prompt-text-fill: #4d9999;
                -fx-border-color: #004455;
                -fx-border-width: 2;
                -fx-border-radius: 8;
                -fx-background-radius: 8;
                -fx-padding: 8;
                -fx-font-size: 13px;
            }
            .text-field:focused, .text-area:focused {
                -fx-border-color: #00aaff;
                -fx-background-color: #003344;
                -fx-border-width: 2;
                -fx-effect: dropshadow(gaussian, rgba(0, 170, 255, 0.6), 10, 0, 0, 0);
            }
            .text-field:hover, .text-area:hover {
                -fx-border-color: #0088cc;
                -fx-effect: dropshadow(gaussian, rgba(0, 153, 221, 0.3), 6, 0, 0, 0);
            }

            /* ===== LABELS - MODERN STYLE ===== */
            .label {
                -fx-text-fill: #c5e8ff;
                -fx-font-smoothing-type: lcd;
            }
            .label.title {
                -fx-font-size: 14px;
                -fx-font-weight: bold;
                -fx-text-fill: #33bbff;
            }

            /* ===== COMBO BOX - MODERN GRADIENT STYLE ===== */
            .combo-box {
                -fx-background-color: linear-gradient(to bottom, #003344, #002233);
                -fx-border-color: #00aaff;
                -fx-border-width: 1;
                -fx-border-radius: 5;
                -fx-background-radius: 5;
            }
            .combo-box:hover {
                -fx-border-color: #33bbff;
                -fx-background-color: linear-gradient(to bottom, #004455, #003344);
            }
            .combo-box .list-cell {
                -fx-background-color: #002233;
                -fx-text-fill: #c5e8ff;
            }
            .combo-box .list-cell:hover {
                -fx-background-color: #003344;
                -fx-text-fill: #33bbff;
            }
            .combo-box-popup .list-view {
                -fx-background-color: #002233;
                -fx-border-color: #00aaff;
                -fx-border-width: 2;
            }

            /* ===== LIST VIEW - MODERN ROUNDED STYLE ===== */
            .list-view {
                -fx-background-color: #002233;
                -fx-border-color: #004455;
                -fx-border-width: 2;
                -fx-border-radius: 10;
                -fx-background-radius: 10;
            }
            .list-cell {
                -fx-background-color: transparent;
                -fx-text-fill: #c5e8ff;
                -fx-border-color: transparent;
                -fx-padding: 8;
                -fx-background-radius: 5;
            }
            .list-cell:hover {
                -fx-background-color: #003344;
                -fx-text-fill: #66ddaa;
            }
            .list-cell:selected {
                -fx-background-color: linear-gradient(to right, #0088cc, #0077bb);
                -fx-text-fill: #ffffff;
                -fx-font-weight: bold;
            }
            .list-cell:selected:hover {
                -fx-background-color: linear-gradient(to right, #0099dd, #0088cc);
            }

            /* ===== TABLE VIEW - MODERN ROUNDED STYLE ===== */
            .table-view {
                -fx-background-color: #002233;
                -fx-border-color: #004455;
                -fx-border-width: 2;
                -fx-border-radius: 10;
                -fx-background-radius: 10;
            }
            .table-view .column-header {
                -fx-background-color: linear-gradient(to bottom, #003344, #002233);
                -fx-text-fill: #33bbff;
                -fx-font-weight: bold;
                -fx-border-color: #004455;
                -fx-padding: 10;
            }
            .table-view .column-header:hover {
                -fx-background-color: linear-gradient(to bottom, #004455, #003344);
            }
            .table-view .table-cell {
                -fx-background-color: transparent;
                -fx-text-fill: #c5e8ff;
                -fx-border-color: transparent;
                -fx-padding: 8;
            }
            .table-row-cell {
                -fx-background-color: transparent;
            }
            .table-row-cell:hover {
                -fx-background-color: #003344;
            }
            .table-row-cell:selected {
                -fx-background-color: linear-gradient(to right, #0088cc, #0077bb);
            }
            .table-row-cell:selected:hover {
                -fx-background-color: linear-gradient(to right, #0099dd, #0088cc);
            }

            /* ===== MENU BAR - MODERN GRADIENT (NO SEPARATORS!) ===== */
            .menu-bar {
                -fx-background-color: linear-gradient(to bottom, #003344, #002233);
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
                -fx-background-color: #004455;
                -fx-effect: dropshadow(gaussian, rgba(0, 170, 255, 0.3), 8, 0, 0, 2);
            }
            .menu-bar .menu:showing {
                -fx-background-color: linear-gradient(to bottom, #0088cc, #0077bb);
                -fx-effect: dropshadow(gaussian, rgba(0, 170, 255, 0.9), 12, 0, 0, 3);
                -fx-scale-y: 1.02;
            }
            .menu-bar .label {
                -fx-text-fill: #c5e8ff !important;
            }
            .menu-bar .menu:showing .label {
                -fx-text-fill: #ffffff !important;
                -fx-font-weight: bold;
                -fx-effect: dropshadow(gaussian, rgba(255, 255, 255, 0.6), 4, 0, 0, 0);
            }

            /* ===== MENU ITEMS - MODERN STYLE (NO SEPARATORS!) ===== */
            .menu-item {
                -fx-background-color: transparent;
                -fx-text-fill: #c5e8ff;
                -fx-padding: 8 20 8 20;
                -fx-background-radius: 5;
                -fx-border-color: transparent;
                -fx-border-width: 0;
            }
            .menu-item:hover {
                -fx-background-color: linear-gradient(to right, #004455, #003344);
                -fx-text-fill: #66ddaa;
                -fx-scale-x: 1.02;
                -fx-effect: dropshadow(gaussian, rgba(0, 170, 255, 0.4), 8, 0, 0, 0);
            }
            .menu-item:focused {
                -fx-background-color: linear-gradient(to right, #0088cc, #0077bb);
                -fx-text-fill: #ffffff;
                -fx-font-weight: bold;
                -fx-effect: dropshadow(gaussian, rgba(0, 170, 255, 0.7), 10, 0, 0, 2);
            }
            .menu-item .label {
                -fx-text-fill: #c5e8ff;
            }
            .context-menu {
                -fx-background-color: #002233;
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
            
            /* ===== CHECKBOX - MODERN ROUNDED STYLE ===== */
            .check-box {
                -fx-text-fill: #c5e8ff;
            }
            .check-box > .box {
                -fx-background-color: #002233;
                -fx-border-color: #00aaff;
                -fx-border-width: 2;
                -fx-border-radius: 5;
                -fx-background-radius: 5;
                -fx-padding: 3;
            }
            .check-box:hover > .box {
                -fx-background-color: #003344;
                -fx-border-color: #33bbff;
            }
            .check-box:selected > .box {
                -fx-background-color: linear-gradient(to bottom right, #0099dd, #0088cc);
                -fx-border-color: #33bbff;
            }
            .check-box > .box > .mark {
                -fx-background-color: #ffffff;
                -fx-shape: "M 0 4 L 3 7 L 8 0";
            }

            /* ===== RADIO BUTTON - MODERN STYLE ===== */
            .radio-button {
                -fx-text-fill: #c5e8ff;
            }
            .radio-button > .radio {
                -fx-background-color: #002233;
                -fx-border-color: #00aaff;
                -fx-border-width: 2;
                -fx-background-radius: 12;
                -fx-border-radius: 12;
                -fx-padding: 5;
            }
            .radio-button:hover > .radio {
                -fx-background-color: #003344;
                -fx-border-color: #33bbff;
            }
            .radio-button:selected > .radio {
                -fx-background-color: linear-gradient(to bottom right, #0099dd, #0088cc);
                -fx-border-color: #33bbff;
            }
            .radio-button > .radio > .dot {
                -fx-background-color: #ffffff;
                -fx-background-radius: 6;
            }

            /* ===== PROGRESS BAR - MODERN ANIMATED STYLE ===== */
            .progress-bar {
                -fx-background-color: #002233;
                -fx-border-color: #004455;
                -fx-border-width: 2;
                -fx-border-radius: 10;
                -fx-background-radius: 10;
            }
            .progress-bar > .track {
                -fx-background-color: #002233;
                -fx-background-radius: 10;
            }
            .progress-bar > .bar {
                -fx-background-color: linear-gradient(to right, #0099dd, #33bbff, #0099dd);
                -fx-background-radius: 10;
                -fx-padding: 4;
                -fx-background-insets: 0;
            }

            /* ===== PROGRESS INDICATOR - MODERN SPINNER ===== */
            .progress-indicator {
                -fx-progress-color: #00aaff;
            }
            .progress-indicator > .spinner {
                -fx-border-color: #00aaff;
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
                -fx-background-color: #001f33;
            }
            .scroll-bar .thumb {
                -fx-background-color: linear-gradient(to right, #0099dd, #0088cc);
                -fx-background-radius: 8px;
                -fx-border-color: #00aaff;
                -fx-border-width: 1;
                -fx-border-radius: 8px;
            }
            .scroll-bar .thumb:hover {
                -fx-background-color: linear-gradient(to right, #00aaff, #0099dd);
                -fx-border-color: #33bbff;
                -fx-effect: dropshadow(gaussian, rgba(0, 170, 255, 0.8), 10, 0, 0, 0);
            }
            .scroll-bar .track {
                -fx-background-color: #002233;
                -fx-background-radius: 8px;
                -fx-border-color: #003344;
                -fx-border-width: 1;
                -fx-border-radius: 8px;
                -fx-effect: innershadow(gaussian, rgba(0, 0, 0, 0.5), 5, 0, 0, 0);
            }
            .scroll-bar .increment-button, .scroll-bar .decrement-button {
                -fx-background-color: transparent;
            }

            /* ===== DIALOGS - MODERN STYLE ===== */
            .dialog-pane {
                -fx-background-color: #001f33;
                -fx-border-color: #00aaff;
                -fx-border-width: 3;
                -fx-border-radius: 15;
                -fx-background-radius: 15;
                -fx-padding: 20;
            }
            .dialog-pane > .header-panel {
                -fx-background-color: linear-gradient(to right, #003344, #002233);
                -fx-padding: 15;
                -fx-background-radius: 15 15 0 0;
            }
            .dialog-pane > .content {
                -fx-padding: 20;
            }
            .dialog-pane .label {
                -fx-text-fill: #c5e8ff;
                -fx-font-size: 13px;
            }
            .dialog-pane > .header-panel .label {
                -fx-text-fill: #33bbff;
                -fx-font-size: 16px;
                -fx-font-weight: bold;
            }
            .dialog-pane > .button-bar > .container > .button {
                -fx-min-width: 80px;
            }

            /* ===== TOOLTIP - MODERN STYLE ===== */
            .tooltip {
                -fx-background-color: linear-gradient(to bottom, #003344, #002233);
                -fx-text-fill: #c5e8ff;
                -fx-border-color: #00aaff;
                -fx-border-width: 2;
                -fx-border-radius: 8;
                -fx-background-radius: 8;
                -fx-padding: 8 12 8 12;
                -fx-font-size: 12px;
            }

            /* ===== REMOVE ALL WHITE STRIPS & BORDERS ===== */
            .split-pane-divider {
                -fx-background-color: #002233 !important;
                -fx-border-color: transparent !important;
            }
            .split-pane {
                -fx-background-color: #001f33 !important;
                -fx-box-border: transparent !important;
            }
            .root {
                -fx-background-color: #001f33 !important;
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
                -fx-background-color: #001f33 !important;
                -fx-background-insets: 0 !important;
            }
            .tab-pane .content {
                -fx-border-color: transparent !important;
                -fx-background-color: #001f33 !important;
                -fx-background-insets: 0 !important;
            }
            .titled-pane > .title {
                -fx-background-color: linear-gradient(to right, #002233, #003344) !important;
                -fx-text-fill: #33bbff !important;
                -fx-border-color: transparent !important;
                -fx-font-weight: bold;
            }
            .titled-pane > .content {
                -fx-background-color: #001f33 !important;
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
                -fx-background-color: #001f33 !important;
                -fx-border-color: transparent !important;
            }
            .scroll-pane > .viewport {
                -fx-background-color: #001f33 !important;
            }
            .scroll-pane > .corner {
                -fx-background-color: #001f33 !important;
            }

            /* ===== TAB PANE (Preferences Tabs) - ULTRA AGGRESSIVE STYLING ===== */
            .tab-pane {
                -fx-background-color: #001f33;
                -fx-border-color: transparent;
            }
            .tab-pane > .tab-header-area {
                -fx-background-color: #002233;
                -fx-border-color: transparent;
            }
            .tab-pane > .tab-header-area > .headers-region {
                -fx-background-color: #002233;
                -fx-border-color: transparent;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab {
                -fx-background-color: linear-gradient(to bottom, #003344, #002233) !important;
                -fx-text-fill: #c5e8ff !important;
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
                -fx-background-insets: 0 !important;
                -fx-background-radius: 5 5 0 0 !important;
                -fx-padding: 10 20 10 20 !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:hover {
                -fx-background-color: linear-gradient(to bottom, #004455, #003344) !important;
                -fx-text-fill: #66ddaa !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:focused {
                -fx-background-color: linear-gradient(to bottom, #003344, #002233) !important;
                -fx-border-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab > .tab-container {
                -fx-background-color: transparent !important;
                -fx-border-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab > .tab-container > .tab-label {
                -fx-text-fill: #c5e8ff !important;
                -fx-background-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab .label {
                -fx-text-fill: #c5e8ff !important;
                -fx-text-base-color: #c5e8ff !important;
                -fx-background-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab Text {
                -fx-fill: #c5e8ff !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected {
                -fx-background-color: linear-gradient(to bottom, #0099dd, #0088cc) !important;
                -fx-text-fill: #ffffff !important;
                -fx-background-insets: 0 !important;
                -fx-background-radius: 5 5 0 0 !important;
                -fx-border-color: transparent !important;
                -fx-font-weight: bold;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected:hover {
                -fx-background-color: linear-gradient(to bottom, #00aaff, #0099dd) !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected:focused {
                -fx-background-color: linear-gradient(to bottom, #0099dd, #0088cc) !important;
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
                -fx-background-color: #002233;
            }
            .tab {
                -fx-background-color: #003344 !important;
                -fx-text-fill: #c5e8ff !important;
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
            }
            .tab .label {
                -fx-text-fill: #c5e8ff !important;
                -fx-text-base-color: #c5e8ff !important;
            }
            .tab Text {
                -fx-fill: #c5e8ff !important;
            }
            .tab:selected {
                -fx-background-color: #0088cc !important;
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
                -fx-background-color: #002233;
            }
            
            /* ===== REMOVE ALL CONTAINER BORDERS ===== */
            .titled-pane, .split-pane, .scroll-pane, .list-view, .table-view,
            .combo-box, .text-field, .text-area, .button, .label {
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
            }

            /* ===== TOOLTIPS ===== */
            .tooltip {
                -fx-background-color: #003344;
                -fx-text-fill: #c5e8ff;
                -fx-background-radius: 4;
                -fx-border-color: #0088cc;
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
