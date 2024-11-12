package tech.eagerminds.window_panel;

import tech.eagerminds.component.RouteJButton;
import tech.eagerminds.constants.LITERAL;

import javax.swing.JPanel;
import java.awt.GridLayout;

public class MainScreenPanel extends JPanel {

    public MainScreenPanel() {
        this.setLayout(new GridLayout(5, 1));
        this.add(new RouteJButton(LITERAL.GO_TO_LIST_BUTTON, this, ListScreenPanel.class));
        this.add(new RouteJButton(LITERAL.GO_TO_CREATE_BUTTON, this, CreateScreenPanel.class));
        this.add(new RouteJButton(LITERAL.GO_TO_LIST_BUTTON, this, ListScreenPanel.class));
        this.add(new RouteJButton(LITERAL.GO_TO_LIST_BUTTON, this, ListScreenPanel.class));
        this.add(new RouteJButton(LITERAL.GO_TO_LIST_BUTTON, this, ListScreenPanel.class));
    }

}
