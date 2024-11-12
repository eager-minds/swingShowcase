package tech.eagerminds;

import tech.eagerminds.configuration.AppConfiguration;

public class Application {

    public static void main(String[] args) {
        final AppConfiguration application = new AppConfiguration("Java SWING Examples");
        application.prepareGUI();
    }

}