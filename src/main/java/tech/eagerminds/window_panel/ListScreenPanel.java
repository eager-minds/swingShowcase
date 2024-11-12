package tech.eagerminds.window_panel;

import tech.eagerminds.listener.SwitchWindowPanelListener;

import javax.swing.*;
import java.awt.*;

public class ListScreenPanel extends JPanel {

	public ListScreenPanel() {
		this.setLayout(new BorderLayout());
		final JButton goListButton = new JButton("Go to Main");
		this.add(goListButton, BorderLayout.SOUTH);
		goListButton.addActionListener(new SwitchWindowPanelListener(this, MainScreenPanel.class));
	}

}
