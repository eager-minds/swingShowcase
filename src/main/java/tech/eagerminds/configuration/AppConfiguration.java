package tech.eagerminds.configuration;

import tech.eagerminds.listener.AppWindowAdapter;
import tech.eagerminds.window_panel.MainScreenPanel;

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;

public class AppConfiguration {

    private final String applicationName;

    public AppConfiguration(final String applicationName) {
        this.applicationName = applicationName;
    }

    public void prepareGUI() {
        final JFrame mainFrame = new JFrame(this.applicationName);
        mainFrame.setSize(800, 800);

        final WindowAdapter windowAdapter = new AppWindowAdapter();
        mainFrame.addWindowListener(windowAdapter);
        mainFrame.addWindowFocusListener(windowAdapter);
        mainFrame.addWindowStateListener(windowAdapter);

        mainFrame.add(new MainScreenPanel());

        mainFrame.setVisible(true);
    }
}
