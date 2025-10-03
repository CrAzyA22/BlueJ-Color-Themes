package themes;

public class StandartDarkMode implements ITheme{

    @Override
    public String getName() {
        return "Standart Darkmode";
    }

    @Override
    public String getCSS() {
        return """
            /* ===== GLOBAL ===== */
            .root {
                -fx-background-color: #1e1e1e;
            }

            /* ===== CODE EDITOR SYNTAX HIGHLIGHTING ===== */
            .token-keyword1 { -fx-fill: #569cd6; }
            .token-keyword2 { -fx-fill: #c586c0; }
            .token-keyword3 { -fx-fill: #4fc1ff; }
            .token-comment-normal { -fx-fill: #6a9955; }
            .token-comment-javadoc { -fx-fill: #608b4e; }
            .token-comment-special { -fx-fill: #d16969; }
            .token-string-literal { -fx-fill: #ce9178; }
            .token-char-literal { -fx-fill: #d7ba7d; }
            .token-primitive { -fx-fill: #4ec9b0; }
            .token-label { -fx-fill: #dcdcaa; }
            .token-invalid { -fx-fill: #f44747; }
            .token-default { -fx-fill: #d4d4d4; }

            /* ===== EDITOR PANE ===== */
            .moe-editor-pane {
                -fx-background-color: #1e1e1e;
                -fx-highlight-fill: #264f78;
            }
            .moe-editor-pane .caret {
                -fx-stroke: #aeafad;
            }
            .moe-find-result {
                -rtfx-background-color: #515c6a;
            }
            .moe-bracket-highlight {
                -rtfx-background-color: #3d3d3d;
            }
            
            /* ===== TEXT SELECTION IN CODE EDITOR (HIGHLY VISIBLE!) ===== */
            .moe-editor-pane .selection {
                -rtfx-background-color: rgba(0, 122, 204, 0.6) !important;
            }
            .text-input .selection {
                -fx-background-color: rgba(0, 122, 204, 0.6) !important;
                -fx-fill: #ffffff !important;
            }
            .text-area .selection {
                -fx-background-color: rgba(0, 122, 204, 0.6) !important;
                -fx-text-fill: #ffffff !important;
            }
            .code-area .selection {
                -rtfx-background-color: rgba(0, 122, 204, 0.7) !important;
            }
            .styled-text-area .selection {
                -rtfx-background-color: rgba(0, 122, 204, 0.7) !important;
            }
            .text-input:focused .selection {
                -fx-background-color: rgba(0, 122, 204, 0.8) !important;
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
                -bj-background-color: #1e1e1e;
                -bj-class-color: #252526;
                -bj-class-outer-color: #2d2d30;
                -bj-class-inner-color: #252526;
                -bj-method-color: #2d2d30;
                -bj-method-outer-color: #323233;
                -bj-selection-color: #0066cc;
                -bj-selection-outer-color: #0066cc;
                -bj-iteration-color: #3b3b4f;
                -bj-iteration-outer-color: #3b3b4f;
            }

            /* ===== EDITOR TOP/BOTTOM BARS ===== */
            .moe-top-bar, .moe-bottom-bar {
                -fx-background-color: #2d2d30;
            }
            .moe-line-label {
                -fx-background-color: #1e1e1e;
                -fx-text-fill: #858585;
            }

            /* ===== EDITOR TABS ===== */
            .tabbed-editor > .tab-header-area {
                -fx-background-color: #2d2d30;
            }
            .tabbed-editor > .tab-header-area .tab {
                -fx-background-color: #2d2d30;
                -fx-text-fill: #969696;
                -fx-border-color: #3d3d3d;
            }
            .tabbed-editor > .tab-header-area .tab:selected {
                -fx-background-color: #1e1e1e;
                -fx-text-fill: #ffffff;
            }

            /* ===== TERMINAL ===== */
            .terminal, .terminal-output {
                -fx-background-color: #1e1e1e;
                -fx-fill: #cccccc;
            }
            .terminal-input {
                -fx-fill: #4fc1ff;
            }
            .terminal-error {
                -fx-fill: #f48771;
            }

            /* ===== BUTTONS ===== */
            .button {
                -fx-background-color: #0e639c;
                -fx-text-fill: white;
                -fx-background-radius: 3;
            }
            .button:hover {
                -fx-background-color: #1177bb;
            }
            .button:pressed {
                -fx-background-color: #0d5689;
            }

            /* ===== TEXT FIELDS ===== */
            .text-field, .text-area {
                -fx-control-inner-background: #3c3c3c;
                -fx-text-fill: #cccccc;
                -fx-background-color: #3c3c3c;
                -fx-border-color: #3d3d3d;
            }
            .text-field:focused, .text-area:focused {
                -fx-border-color: #007acc;
                -fx-border-width: 1px;
            }

            /* ===== COMBO BOX ===== */
            .combo-box {
                -fx-background-color: #3c3c3c;
                -fx-text-fill: #cccccc;
            }
            .combo-box .list-cell {
                -fx-background-color: #252526;
                -fx-text-fill: #cccccc;
            }
            .combo-box .list-cell:hover {
                -fx-background-color: #2a2d2e;
            }

            /* ===== LABELS ===== */
            .label {
                -fx-text-fill: #cccccc;
            }

            /* ===== MENU BAR - MODERN CLEAN (NO SEPARATORS!) ===== */
            .menu-bar {
                -fx-background-color: linear-gradient(to bottom, #3e3e42, #2d2d30);
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
                -fx-padding: 5;
            }
            .menu-bar .menu {
                -fx-background-color: transparent;
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
                -fx-background-insets: 0 !important;
                -fx-background-radius: 5;
                -fx-padding: 5 15 5 15;
            }
            .menu-bar .menu-button {
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
                -fx-background-insets: 0 !important;
            }
            .menu-bar .menu .label {
                -fx-text-fill: #cccccc !important;
            }
            .menu-bar .menu:hover {
                -fx-background-color: #3e3e42;
            }
            .menu-bar .menu:showing {
                -fx-background-color: linear-gradient(to bottom, #007acc, #005a9e);
                -fx-font-weight: bold;
            }
            .menu-bar .menu:showing .label {
                -fx-text-fill: #ffffff !important;
                -fx-font-weight: bold;
            }
            .menu-bar .container {
                -fx-background-color: transparent;
                -fx-border-color: transparent !important;
            }
            .menu-bar > * {
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
            }
            .menu-bar .label {
                -fx-text-fill: #cccccc;
            }
            
            /* ===== MENU ITEMS - MODERN STYLE ===== */
            .menu-item {
                -fx-background-color: transparent;
                -fx-text-fill: #cccccc;
                -fx-padding: 8 20 8 20;
                -fx-background-radius: 5;
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
            }
            .menu-item:hover {
                -fx-background-color: linear-gradient(to right, #3e3e42, #2d2d30);
                -fx-text-fill: #ffffff;
            }
            .menu-item:focused {
                -fx-background-color: linear-gradient(to right, #007acc, #005a9e);
                -fx-text-fill: #ffffff;
            }
            .menu-item .label {
                -fx-text-fill: #cccccc;
            }
            .context-menu {
                -fx-background-color: #252526;
                -fx-border-color: #007acc;
                -fx-border-width: 2;
                -fx-border-radius: 8;
                -fx-background-radius: 8;
                -fx-padding: 5;
            }
            .context-menu .separator {
                -fx-background-color: transparent !important;
                -fx-border-color: transparent !important;
                -fx-padding: 0 !important;
                -fx-pref-height: 0 !important;
            }
            .context-menu .separator .line {
                -fx-background-color: transparent !important;
                -fx-border-color: transparent !important;
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
            
            /* ===== MENU BUTTON (Tools, etc.) - Remove pane effect ===== */
            .menu-button {
                -fx-background-color: transparent;
                -fx-text-fill: #cccccc;
                -fx-border-color: transparent;
                -fx-border-width: 0;
                -fx-background-insets: 0;
                -fx-padding: 0;
            }
            .menu-button .label {
                -fx-text-fill: #cccccc;
            }
            .menu-button:hover {
                -fx-background-color: #2d2d30;
            }
            .menu-button:showing {
                -fx-background-color: #094771;
            }
            .menu-button .arrow-button {
                -fx-background-color: transparent;
                -fx-border-color: transparent;
                -fx-padding: 0;
            }

            /* ===== SCROLL BARS ===== */
            .scroll-bar {
                -fx-background-color: #1e1e1e;
            }
            .scroll-bar .thumb {
                -fx-background-color: #424242;
                -fx-background-radius: 5px;
            }
            .scroll-bar .thumb:hover {
                -fx-background-color: #4e4e4e;
            }
            .scroll-bar .track {
                -fx-background-color: #1e1e1e;
            }
            .scroll-bar .increment-button, .scroll-bar .decrement-button {
                -fx-background-color: transparent;
            }

            /* ===== DIALOGS ===== */
            .dialog-pane {
                -fx-background-color: #252526;
            }
            .dialog-pane .label {
                -fx-text-fill: #cccccc;
            }

            /* ===== TAB PANE (Preferences Tabs) - ULTRA AGGRESSIVE STYLING ===== */
            .tab-pane {
                -fx-background-color: #1e1e1e;
                -fx-border-color: transparent;
            }
            .tab-pane > .tab-header-area {
                -fx-background-color: #2d2d30;
                -fx-border-color: transparent;
            }
            .tab-pane > .tab-header-area > .headers-region {
                -fx-background-color: #2d2d30;
                -fx-border-color: transparent;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab {
                -fx-background-color: #3e3e42 !important;
                -fx-background-insets: 0 !important;
                -fx-background-radius: 0 !important;
                -fx-padding: 10 20 10 20 !important;
                -fx-text-fill: #ffffff !important;
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
                -fx-focus-color: transparent !important;
                -fx-faint-focus-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:focused {
                -fx-background-color: #3e3e42 !important;
                -fx-border-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab > .tab-container {
                -fx-background-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab > .tab-container > .tab-label {
                -fx-text-fill: #ffffff !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab .label {
                -fx-text-fill: #ffffff !important;
                -fx-text-base-color: #ffffff !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab Text {
                -fx-fill: #ffffff !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected {
                -fx-background-color: #007acc !important;
                -fx-background-insets: 0 !important;
                -fx-background-radius: 0 !important;
                -fx-padding: 10 20 10 20 !important;
                -fx-text-fill: #ffffff !important;
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
                -fx-focus-color: transparent !important;
                -fx-faint-focus-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected:focused {
                -fx-background-color: #007acc !important;
                -fx-border-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected > .tab-container {
                -fx-background-color: transparent !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected > .tab-container > .tab-label {
                -fx-text-fill: #ffffff !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected .label {
                -fx-text-fill: #ffffff !important;
                -fx-text-base-color: #ffffff !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected Text {
                -fx-fill: #ffffff !important;
            }
            .tab-pane > .tab-header-area > .tab-header-background {
                -fx-background-color: #2d2d30;
            }
            .tab {
                -fx-background-color: #3e3e42 !important;
                -fx-text-fill: #ffffff !important;
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
            }
            .tab .label {
                -fx-text-fill: #ffffff !important;
                -fx-text-base-color: #ffffff !important;
            }
            .tab Text {
                -fx-fill: #ffffff !important;
            }
            .tab .label {
                -fx-text-fill: #ffffff !important;
            }
            .tab:selected {
                -fx-background-color: #007acc !important;
                -fx-text-fill: #ffffff !important;
            }
            .tab:selected .label {
                -fx-text-fill: #ffffff !important;
            }
            .tab-header-background {
                -fx-background-color: #2d2d30;
            }
            
            /* ===== REMOVE ALL CONTAINER BORDERS & WHITE STRIPS ===== */
            .titled-pane, .split-pane, .scroll-pane, .list-view, .table-view,
            .combo-box, .text-field, .text-area, .button, .label {
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
            }
            .split-pane-divider {
                -fx-background-color: #2d2d30 !important;
                -fx-border-color: transparent !important;
            }
            .split-pane {
                -fx-background-color: #1e1e1e !important;
                -fx-box-border: transparent !important;
            }
            .root {
                -fx-background-color: #1e1e1e !important;
                -fx-border-color: transparent !important;
            }
            .pane, .region, .container {
                -fx-border-color: transparent !important;
                -fx-background-insets: 0 !important;
            }
            /* Remove white content area borders */
            .tab-pane > .tab-content-area {
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
                -fx-background-color: #1e1e1e !important;
                -fx-background-insets: 0 !important;
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

            /* ===== TOOLTIPS ===== */
            .tooltip {
                -fx-background-color: #2d2d30;
                -fx-text-fill: #cccccc;
                -fx-background-radius: 4;
            }

            /* ===== PACKAGE MANAGER ===== */
            .class-target {
                -fx-background-color: #ffaa3b;
            }
            .class-target:hover {
                -fx-background-color: #ffbb5c;
            }
            
            /* ===== FIX WHITE BORDERS & LINES ===== */
            .split-pane {
                -fx-background-color: #1e1e1e;
                -fx-border-color: #1e1e1e;
            }
            .split-pane > .split-pane-divider {
                -fx-background-color: #2d2d30;
                -fx-border-color: #2d2d30;
                -fx-padding: 0 1 0 1;
            }
            
            /* ===== PREFERENCES MENU ===== */
            .titled-pane {
                -fx-background-color: #252526;
                -fx-text-fill: #ffffff;
            }
            .titled-pane > .title {
                -fx-background-color: #2d2d30;
                -fx-text-fill: #ffffff;
            }
            .titled-pane > .title .label {
                -fx-text-fill: #ffffff;
            }
            .titled-pane > .content {
                -fx-background-color: #1e1e1e;
                -fx-border-color: #2d2d30;
            }
            
            /* ===== TABLE VIEW ===== */
            .table-view {
                -fx-background-color: #1e1e1e;
                -fx-border-color: #2d2d30;
            }
            .table-view .column-header {
                -fx-background-color: #2d2d30;
                -fx-text-fill: #cccccc;
            }
            .table-view .table-cell {
                -fx-background-color: #1e1e1e;
                -fx-text-fill: #cccccc;
                -fx-border-color: #2d2d30;
            }
            .table-row-cell:selected {
                -fx-background-color: #264f78;
            }
            
            /* ===== LIST VIEW ===== */
            .list-view {
                -fx-background-color: #1e1e1e;
                -fx-border-color: #2d2d30;
            }
            .list-cell {
                -fx-background-color: #1e1e1e;
                -fx-text-fill: #cccccc;
            }
            .list-cell:selected {
                -fx-background-color: #264f78;
            }
            .list-cell:hover {
                -fx-background-color: #2d2d30;
            }
            
            /* ===== REMOVE BORDERS FROM CONTAINERS ===== */
            .pane {
                -fx-border-color: transparent;
                -fx-background-color: #1e1e1e;
            }
            
            /* ===== CHECK BOXES & RADIO BUTTONS ===== */
            .check-box, .radio-button {
                -fx-text-fill: #cccccc;
            }
            .check-box .box, .radio-button .radio {
                -fx-background-color: #3c3c3c;
                -fx-border-color: #3d3d3d;
            }
            
            /* ===== SLIDER ===== */
            .slider .track {
                -fx-background-color: #3c3c3c;
            }
            .slider .thumb {
                -fx-background-color: #007acc;
            }
            
            /* ===== PROGRESS BAR ===== */
            .progress-bar .track {
                -fx-background-color: #3c3c3c;
            }
            .progress-bar .bar {
                -fx-background-color: #007acc;
            }
            
            /* ===== ADDITIONAL BORDER FIXES ===== */
            .split-pane-divider {
                -fx-background-color: #2b2b2b;
                -fx-border-color: #2b2b2b;
            }
            .combo-box-popup .list-view {
                -fx-background-color: #1e1e1e;
                -fx-border-color: #3e3e42;
            }
            .combo-box-popup .list-cell {
                -fx-border-color: transparent;
            }
            .combo-box .list-cell {
                -fx-border-color: transparent;
                -fx-background-color: #1e1e1e;
            }
            .choice-box .list-view {
                -fx-border-color: #3e3e42;
            }
            .text-field, .text-area {
                -fx-border-color: #3e3e42;
                -fx-border-width: 1px;
            }
            .separator {
                -fx-background-color: #2b2b2b;
            }
            .scroll-pane {
                -fx-background-color: #2b2b2b;
                -fx-border-color: transparent;
            }
            .scroll-pane > .viewport {
                -fx-background-color: #2b2b2b;
            }
            .titled-pane .title {
                -fx-border-color: transparent;
            }
            .titled-pane .content {
                -fx-border-color: #3e3e42;
                -fx-border-width: 1px;
            }
            .grid-pane {
                -fx-border-color: transparent;
                -fx-background-color: #2b2b2b;
            }
            .v-box, .h-box {
                -fx-border-color: transparent;
                -fx-background-color: #2b2b2b;
            }
            .anchor-pane {
                -fx-border-color: transparent;
                -fx-background-color: #2b2b2b;
            }
            .border-pane {
                -fx-border-color: transparent;
                -fx-background-color: #2b2b2b;
            }
            """;
    }
}
