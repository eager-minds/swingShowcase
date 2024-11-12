package tech.eagerminds.listener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppWindowAdapter extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Hasta pronto");
		System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Bienvenido");
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		System.out.println("Tengo foco");
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		System.out.println("He perdido el foco");
	}
}
