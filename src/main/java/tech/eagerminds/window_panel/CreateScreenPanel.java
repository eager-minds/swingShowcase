package tech.eagerminds.window_panel;

import tech.eagerminds.component.RouteJButton;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

public class CreateScreenPanel extends JPanel {

	public CreateScreenPanel() {
		this.setLayout(new BorderLayout());

		final JLabel statusLabel = new JLabel("", JLabel.CENTER);
		final JPanel loginPanel = this.createLoginGridBagPanel(statusLabel::setText);
		final JButton goListButton = new RouteJButton("Go to Main", this, MainScreenPanel.class);

		this.add(loginPanel, BorderLayout.NORTH);
		this.add(statusLabel, BorderLayout.CENTER);
		this.add(goListButton, BorderLayout.SOUTH);
	}

	private JPanel createLoginGroupPanel(Consumer<String> onSubmit) {
		final JPanel loginPanel = new JPanel();
		final FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 0, 0);
		loginPanel.setLayout(flowLayout);

		final JPanel namePanel = new JPanel();
		loginPanel.add(namePanel);
		namePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		final JLabel nameLabel = new JLabel("User name: ", JLabel.RIGHT);
		final JTextField userText = new JTextField(6);
		namePanel.add(nameLabel);
		namePanel.add(userText);

		final JPanel passwordPanel = new JPanel();
		loginPanel.add(passwordPanel);
		passwordPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		final JLabel passwordLabel = new JLabel("Password: ", JLabel.RIGHT);
		final JPasswordField passwordText = new JPasswordField(6);
		passwordPanel.add(passwordLabel);
		passwordPanel.add(passwordText);

		final JButton loginButton = new JButton("Login");
		loginButton.addActionListener(e -> {
			String data = "Username " + userText.getText();
			data += ", Password: " + new String(passwordText.getPassword());
			onSubmit.accept(data);
		});
		final Box verticalBox = Box.createVerticalBox();
		loginPanel.add(verticalBox);
		verticalBox.add(namePanel);
		verticalBox.add(passwordPanel);
		verticalBox.add(loginButton);

		return loginPanel;
	}

	private JPanel createLoginGridPanel(Consumer<String> onSubmit) {
		final JPanel loginPanel = new JPanel();
		loginPanel.setLayout(new GridLayout(3, 1));
		final JLabel nameLabel = new JLabel("User name: ", JLabel.RIGHT);
		loginPanel.add(nameLabel);
		final JTextField userText = new JTextField(6);
		loginPanel.add(userText);
		final JLabel passwordLabel = new JLabel("Password: ", JLabel.RIGHT);
		loginPanel.add(passwordLabel);
		final JPasswordField passwordText = new JPasswordField(6);
		loginPanel.add(passwordText);
		final JButton loginButton = new JButton("Login");
		loginButton.addActionListener(e -> {
			String data = "Username " + userText.getText();
			data += ", Password: " + new String(passwordText.getPassword());
			onSubmit.accept(data);
		});
		loginPanel.add(loginButton);
		return loginPanel;
	}

	private JPanel createLoginGridBagPanel(Consumer<String> onSubmit) {
		final JPanel loginPanel = new JPanel();
		loginPanel.setLayout(new GridBagLayout());
		final GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;

		gbc.gridx = 0;
		gbc.gridy = 0;
		final JLabel nameLabel = new JLabel("User name: ", JLabel.RIGHT);
		loginPanel.add(nameLabel, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		final JTextField userText = new JTextField(20);
		loginPanel.add(userText, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		final JLabel passwordLabel = new JLabel("Password: ", JLabel.RIGHT);
		loginPanel.add(passwordLabel, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		final JPasswordField passwordText = new JPasswordField(20);
		loginPanel.add(passwordText, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		final JButton loginButton = new JButton("Login");
		loginButton.addActionListener(e -> {
			String data = "Username " + userText.getText();
			data += ", Password: " + new String(passwordText.getPassword());
			onSubmit.accept(data);
		});
		loginPanel.add(loginButton, gbc);
		return loginPanel;
	}

}
