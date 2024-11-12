package tech.eagerminds.window_panel;

import tech.eagerminds.component.RouteJButton;
import tech.eagerminds.constants.LITERAL;

import javax.swing.JPanel;
import java.awt.BorderLayout;

public class ListScreenPanel extends JPanel {

    public ListScreenPanel() {
        this.setLayout(new BorderLayout());
        this.add(new RouteJButton(LITERAL.GO_TO_MAIN_BUTTON, this, MainScreenPanel.class), BorderLayout.SOUTH);
    }

}
