package themes;

public class StandartLightMode implements ITheme {
    @Override
    public String getName() {
        return "Standart Lightmode";
    }

    @Override
    public String getCSS() {
        return """
            /* ===== GLOBAL ===== */
            .root {
                -fx-background-color: #f5f5f5;
            }

            /* ===== CODE EDITOR SYNTAX HIGHLIGHTING ===== */
            .token-keyword1 { -fx-fill: #0000ff; }
            .token-keyword2 { -fx-fill: #af00db; }
            .token-keyword3 { -fx-fill: #0070c1; }
            .token-comment-normal { -fx-fill: #008000; }
            .token-comment-javadoc { -fx-fill: #3f7f5f; }
            .token-comment-special { -fx-fill: #c41a16; }
            .token-string-literal { -fx-fill: #a31515; }
            .token-char-literal { -fx-fill: #795e26; }
            .token-primitive { -fx-fill: #0070c1; }
            .token-label { -fx-fill: #795e26; }
            .token-invalid { -fx-fill: #cd3131; }
            .token-default { -fx-fill: #000000; }

            /* ===== EDITOR PANE ===== */
            .moe-editor-pane {
                -fx-background-color: #ffffff;
                -fx-highlight-fill: #add6ff;
            }
            .moe-editor-pane .caret {
                -fx-stroke: #000000;
            }
            .moe-find-result {
                -rtfx-background-color: #ffff00;
            }
            .moe-bracket-highlight {
                -rtfx-background-color: #e3f2fd;
            }
            
            /* ===== TEXT SELECTION IN CODE EDITOR ===== */
            .moe-editor-pane .selection {
                -rtfx-background-color: #add6ff;
            }

            /* ===== SCOPE COLORS ===== */
            .scope-colors {
                -bj-background-color: #ffffff;
                -bj-class-color: #f8f8f8;
                -bj-class-outer-color: #f0f0f0;
                -bj-class-inner-color: #f8f8f8;
                -bj-method-color: #f0f0f0;
                -bj-method-outer-color: #e8e8e8;
                -bj-selection-color: #add6ff;
                -bj-selection-outer-color: #add6ff;
                -bj-iteration-color: #e8e8ff;
                -bj-iteration-outer-color: #e8e8ff;
            }

            /* ===== EDITOR TOP/BOTTOM BARS ===== */
            .moe-top-bar, .moe-bottom-bar {
                -fx-background-color: #f3f3f3;
            }
            .moe-line-label {
                -fx-background-color: #ffffff;
                -fx-text-fill: #237893;
            }

            /* ===== EDITOR TABS ===== */
            .tabbed-editor > .tab-header-area {
                -fx-background-color: #ececec;
            }
            .tabbed-editor > .tab-header-area .tab {
                -fx-background-color: #ececec;
                -fx-text-fill: #333333;
                -fx-border-color: #cccccc;
            }
            .tabbed-editor > .tab-header-area .tab:selected {
                -fx-background-color: #ffffff;
                -fx-text-fill: #000000;
            }

            /* ===== TERMINAL ===== */
            .terminal, .terminal-output {
                -fx-background-color: #ffffff;
                -fx-fill: #000000;
            }
            .terminal-input {
                -fx-fill: #0070c1;
            }
            .terminal-error {
                -fx-fill: #cd3131;
            }

            /* ===== BUTTONS ===== */
            .button {
                -fx-background-color: linear-gradient(to bottom, #f0f0f0, #e5e5e5);
                -fx-text-fill: #000000;
                -fx-background-radius: 3;
                -fx-border-color: #adadad;
                -fx-border-width: 1;
            }
            .button:hover {
                -fx-background-color: linear-gradient(to bottom, #e3f2fd, #bbdefb);
            }
            .button:pressed {
                -fx-background-color: #c5e1a5;
            }

            /* ===== TEXT FIELDS ===== */
            .text-field, .text-area {
                -fx-control-inner-background: #ffffff;
                -fx-text-fill: #000000;
                -fx-background-color: #ffffff;
                -fx-border-color: #cccccc;
            }
            .text-field:focused, .text-area:focused {
                -fx-border-color: #0078d4;
                -fx-border-width: 2px;
            }

            /* ===== COMBO BOX ===== */
            .combo-box {
                -fx-background-color: #ffffff;
                -fx-text-fill: #000000;
                -fx-border-color: #cccccc;
            }
            .combo-box .list-cell {
                -fx-background-color: #ffffff;
                -fx-text-fill: #000000;
            }
            .combo-box .list-cell:hover {
                -fx-background-color: #e5f3ff;
            }

            /* ===== LABELS ===== */
            .label {
                -fx-text-fill: #000000;
            }

            /* ===== MENU BAR ===== */
            .menu-bar {
                -fx-background-color: #f0f0f0;
            }
            .menu-bar .label {
                -fx-text-fill: #000000;
            }
            .menu-item {
                -fx-background-color: #ffffff;
            }
            .menu-item:hover {
                -fx-background-color: #e5f3ff;
            }
            .context-menu {
                -fx-background-color: #f9f9f9;
                -fx-border-color: #cccccc;
            }
            
            /* ===== REMOVE ALL SEPARATORS AND BORDERS ===== */
            .separator {
                -fx-background-color: transparent;
                -fx-border-color: transparent;
                -fx-padding: 0;
            }
            .separator .line {
                -fx-background-color: transparent;
                -fx-border-color: transparent;
            }

            /* ===== SCROLL BARS ===== */
            .scroll-bar {
                -fx-background-color: #f5f5f5;
            }
            .scroll-bar .thumb {
                -fx-background-color: #c1c1c1;
                -fx-background-radius: 5px;
            }
            .scroll-bar .thumb:hover {
                -fx-background-color: #a8a8a8;
            }
            .scroll-bar .track {
                -fx-background-color: #f5f5f5;
            }
            .scroll-bar .increment-button, .scroll-bar .decrement-button {
                -fx-background-color: transparent;
            }

            /* ===== DIALOGS ===== */
            .dialog-pane {
                -fx-background-color: #ffffff;
            }
            .dialog-pane .label {
                -fx-text-fill: #000000;
            }

            /* ===== TAB PANE (Preferences Tabs) - ULTRA AGGRESSIVE STYLING ===== */
            .tab-pane {
                -fx-background-color: #ffffff;
                -fx-border-color: transparent;
            }
            .tab-pane > .tab-header-area {
                -fx-background-color: #ececec;
                -fx-border-color: transparent;
            }
            .tab-pane > .tab-header-area > .headers-region {
                -fx-background-color: #ececec;
                -fx-border-color: transparent;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab {
                -fx-background-color: #d0d0d0 !important;
                -fx-text-fill: #000000 !important;
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab > .tab-container > .tab-label {
                -fx-text-fill: #000000 !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab .label {
                -fx-text-fill: #000000 !important;
                -fx-text-base-color: #000000 !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab Text {
                -fx-fill: #000000 !important;
            }
            .tab-pane > .tab-header-area > .headers-region > .tab:selected {
                -fx-background-color: #0078d7 !important;
                -fx-text-fill: #ffffff !important;
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
                -fx-background-color: #ececec;
            }
            .tab {
                -fx-background-color: #d0d0d0 !important;
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
                -fx-background-color: #0078d7 !important;
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
                -fx-background-color: #ececec;
            }
            
            /* ===== REMOVE ALL CONTAINER BORDERS ===== */
            .titled-pane, .split-pane, .scroll-pane, .list-view, .table-view,
            .combo-box, .text-field, .text-area, .button, .label {
                -fx-border-color: transparent !important;
                -fx-border-width: 0 !important;
            }

            /* ===== TOOLTIPS ===== */
            .tooltip {
                -fx-background-color: #ffffcc;
                -fx-text-fill: #000000;
                -fx-background-radius: 4;
                -fx-border-color: #c0c0c0;
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
                -fx-background-color: #f5f5f5;
                -fx-border-color: #f5f5f5;
            }
            .split-pane > .split-pane-divider {
                -fx-background-color: #e0e0e0;
                -fx-border-color: #e0e0e0;
                -fx-padding: 0 1 0 1;
            }
            
            /* ===== PREFERENCES MENU ===== */
            .titled-pane {
                -fx-background-color: #ffffff;
                -fx-text-fill: #000000;
            }
            .titled-pane > .title {
                -fx-background-color: #f0f0f0;
                -fx-text-fill: #000000;
            }
            .titled-pane > .title .label {
                -fx-text-fill: #000000;
            }
            .titled-pane > .content {
                -fx-background-color: #ffffff;
                -fx-border-color: #c0c0c0;
            }
            
            /* ===== FIX MENU BAR BUTTONS (Project, Edit, Tools, etc.) ===== */
            .menu-bar .menu {
                -fx-background-color: transparent;
                -fx-border-color: transparent;
                -fx-border-width: 0;
                -fx-background-insets: 0;
                -fx-background-radius: 0;
                -fx-padding: 0;
            }
            .menu-bar .menu .label {
                -fx-text-fill: #000000;
                -fx-padding: 5 10 5 10;
            }
            .menu-bar .menu:hover {
                -fx-background-color: #e3f2fd;
            }
            .menu-bar .menu:showing {
                -fx-background-color: #bbdefb;
            }
            .menu-bar .container {
                -fx-background-color: transparent;
                -fx-border-color: transparent;
            }
            
            /* ===== MENU BUTTON (Tools, etc.) ===== */
            .menu-button {
                -fx-background-color: transparent;
                -fx-text-fill: #000000;
                -fx-border-color: transparent;
                -fx-border-width: 0;
                -fx-background-insets: 0;
                -fx-padding: 0;
            }
            .menu-button .label {
                -fx-text-fill: #000000;
            }
            .menu-button:hover {
                -fx-background-color: #e3f2fd;
            }
            .menu-button:showing {
                -fx-background-color: #bbdefb;
            }
            .menu-button .arrow-button {
                -fx-background-color: transparent;
                -fx-border-color: transparent;
                -fx-padding: 0;
            }
            
            /* ===== TABLE VIEW ===== */
            .table-view {
                -fx-background-color: #ffffff;
                -fx-border-color: #c0c0c0;
            }
            .table-view .column-header {
                -fx-background-color: #f0f0f0;
                -fx-text-fill: #000000;
            }
            .table-view .table-cell {
                -fx-background-color: #ffffff;
                -fx-text-fill: #000000;
                -fx-border-color: #e0e0e0;
            }
            .table-row-cell:selected {
                -fx-background-color: #bbdefb;
            }
            
            /* ===== LIST VIEW ===== */
            .list-view {
                -fx-background-color: #ffffff;
                -fx-border-color: #c0c0c0;
            }
            .list-cell {
                -fx-background-color: #ffffff;
                -fx-text-fill: #000000;
            }
            .list-cell:selected {
                -fx-background-color: #bbdefb;
            }
            .list-cell:hover {
                -fx-background-color: #e3f2fd;
            }
            
            /* ===== REMOVE BORDERS ===== */
            .pane {
                -fx-border-color: transparent;
                -fx-background-color: #ffffff;
            }
            
            /* ===== CHECK BOXES & RADIO BUTTONS ===== */
            .check-box, .radio-button {
                -fx-text-fill: #000000;
            }
            .check-box .box, .radio-button .radio {
                -fx-background-color: #ffffff;
                -fx-border-color: #adadad;
            }
            
            /* ===== SLIDER ===== */
            .slider .track {
                -fx-background-color: #e0e0e0;
            }
            .slider .thumb {
                -fx-background-color: #0070c1;
            }
            
            /* ===== PROGRESS BAR ===== */
            .progress-bar .track {
                -fx-background-color: #e0e0e0;
            }
            .progress-bar .bar {
                -fx-background-color: #0070c1;
            }
            
            /* ===== ADDITIONAL BORDER FIXES ===== */
            .split-pane-divider {
                -fx-background-color: #f5f5f5;
                -fx-border-color: #f5f5f5;
            }
            .combo-box-popup .list-view {
                -fx-background-color: #ffffff;
                -fx-border-color: #c0c0c0;
            }
            .combo-box-popup .list-cell {
                -fx-border-color: transparent;
            }
            .combo-box .list-cell {
                -fx-border-color: transparent;
                -fx-background-color: #ffffff;
            }
            .choice-box .list-view {
                -fx-border-color: #c0c0c0;
            }
            .text-field, .text-area {
                -fx-border-color: #c0c0c0;
                -fx-border-width: 1px;
            }
            .separator {
                -fx-background-color: #e0e0e0;
            }
            .scroll-pane {
                -fx-background-color: #ffffff;
                -fx-border-color: transparent;
            }
            .scroll-pane > .viewport {
                -fx-background-color: #ffffff;
            }
            .titled-pane .title {
                -fx-border-color: transparent;
            }
            .titled-pane .content {
                -fx-border-color: #c0c0c0;
                -fx-border-width: 1px;
            }
            .grid-pane {
                -fx-border-color: transparent;
                -fx-background-color: #ffffff;
            }
            .v-box, .h-box {
                -fx-border-color: transparent;
                -fx-background-color: #ffffff;
            }
            .anchor-pane {
                -fx-border-color: transparent;
                -fx-background-color: #ffffff;
            }
            .border-pane {
                -fx-border-color: transparent;
                -fx-background-color: #ffffff;
            }
            """;
    }
}
