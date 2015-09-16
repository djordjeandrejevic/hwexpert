package com.sample.gui.troubleshoot.shutdownrestart;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JPNoisy extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPNoisy() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Is your PC noisy?");
		lblNewLabel.setBounds(168, 97, 132, 14);
		panel.add(lblNewLabel);
		
		JButton btnYes = new JButton("Yes");
		btnYes.setBounds(82, 162, 89, 23);
		panel.add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.setBounds(257, 162, 89, 23);
		panel.add(btnNo);

	}

}
