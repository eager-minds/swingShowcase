package tech.eagerminds;

import tech.eagerminds.configuration.AppConfiguration;
import tech.eagerminds.listener.AppWindowAdapter;
import tech.eagerminds.window_panel.MainScreenPanel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.WindowAdapter;

public class Application {

    public static void main(String[] args) {
        final AppConfiguration application = new AppConfiguration("Java SWING Examples");
        application.prepareGUI();
    }

}