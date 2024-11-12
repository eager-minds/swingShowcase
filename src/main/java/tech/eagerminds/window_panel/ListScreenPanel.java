package tech.eagerminds.window_panel;

import tech.eagerminds.component.RouteJButton;

import javax.swing.JPanel;
import java.awt.BorderLayout;

public class ListScreenPanel extends JPanel {

    public ListScreenPanel() {
        this.setLayout(new BorderLayout());
        this.add(new RouteJButton("Go to Main", this, MainScreenPanel.class), BorderLayout.SOUTH);
    }

}
