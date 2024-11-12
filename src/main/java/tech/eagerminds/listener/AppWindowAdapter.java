package tech.eagerminds.listener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Logger;

public class AppWindowAdapter extends WindowAdapter {
    private final Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public void windowClosing(WindowEvent e) {
        logger.info("Hasta pronto");
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        logger.info("Bienvenido");
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        logger.info("Tengo foco");
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        logger.warning("He perdido el foco");
    }
}
