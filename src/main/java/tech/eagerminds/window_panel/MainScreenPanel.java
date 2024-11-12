package tech.eagerminds.window_panel;

import tech.eagerminds.component.RouteJButton;

import javax.swing.JPanel;
import java.awt.GridLayout;

public class MainScreenPanel extends JPanel {

    public MainScreenPanel() {
        this.setLayout(new GridLayout(5, 1));
        this.add(new RouteJButton("Go to List", this, ListScreenPanel.class));
        this.add(new RouteJButton("Go to Create", this, CreateScreenPanel.class));
        this.add(new RouteJButton("Go to List", this, ListScreenPanel.class));
        this.add(new RouteJButton("Go to List", this, ListScreenPanel.class));
        this.add(new RouteJButton("Go to List", this, ListScreenPanel.class));
    }

}
