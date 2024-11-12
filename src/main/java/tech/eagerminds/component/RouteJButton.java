package tech.eagerminds.component;

import tech.eagerminds.listener.SwitchWindowPanelListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class RouteJButton extends JButton {
    public RouteJButton(String text, JPanel currentPanel, Class<? extends JPanel> nextPanel) {
        super(text);
        this.addActionListener(new SwitchWindowPanelListener(currentPanel, nextPanel));
    }
}
