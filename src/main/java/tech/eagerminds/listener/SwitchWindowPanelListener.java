package tech.eagerminds.listener;

import tech.eagerminds.exception.ConstructorException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class SwitchWindowPanelListener implements ActionListener {
    private final JPanel currentPanel;
    private final Class<? extends JPanel> nextPanelClass;

    public SwitchWindowPanelListener(JPanel currentPanel, Class<? extends JPanel> nextPanelClass) {
        this.currentPanel = currentPanel;
        this.nextPanelClass = nextPanelClass;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
        mainFrame.remove(this.currentPanel);
        try {
            mainFrame.add(this.nextPanelClass.getDeclaredConstructor().newInstance());
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException ex) {
            throw new ConstructorException(ex);
        }
        mainFrame.revalidate();
        mainFrame.repaint();
    }
}
