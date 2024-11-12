package tech.eagerminds;

import tech.eagerminds.listener.AppWindowAdapter;
import tech.eagerminds.window_panel.MainScreenPanel;

import javax.swing.*;
import java.awt.event.WindowAdapter;

public class Application {

	public Application() {
		this.prepareGUI();
	}

	public static void main(String[] args) {
		final Application application = new Application();
		application.prepareGUI();
	}

	private void prepareGUI() {
		final JFrame mainFrame = new JFrame("Java SWING Examples");
		mainFrame.setSize(800, 800);

		final WindowAdapter windowAdapter = new AppWindowAdapter();
		mainFrame.addWindowListener(windowAdapter);
		mainFrame.addWindowFocusListener(windowAdapter);
		mainFrame.addWindowStateListener(windowAdapter);

		mainFrame.add(new MainScreenPanel());

		mainFrame.setVisible(true);
	}

}