package tech.eagerminds.window_panel;

import tech.eagerminds.component.RouteJButton;
import tech.eagerminds.listener.SwitchWindowPanelListener;

import javax.swing.*;
import java.awt.*;

public class ListScreenPanel extends JPanel {

	public ListScreenPanel() {
		this.setLayout(new BorderLayout());
		this.add(new RouteJButton("Go to Main", this, MainScreenPanel.class), BorderLayout.SOUTH);
	}

}
