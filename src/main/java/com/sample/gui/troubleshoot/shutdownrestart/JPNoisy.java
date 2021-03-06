package com.sample.gui.troubleshoot.shutdownrestart;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import com.sample.Hardware;
import com.sample.gui.GUIUtil;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPNoisy extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPNoisy() {
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Is your PC noisy?");
		lblNewLabel.setBounds(168, 97, 132, 14);
		panel.add(lblNewLabel);

		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setNoisy(true);
				GUIUtil.changePanel(panel, new JPCleaned());
			}
		});
		btnYes.setBounds(82, 162, 89, 23);
		panel.add(btnYes);

		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setNoisy(false);
				GUIUtil.changePanel(panel, new JPShutdownDemandingOps());
			}
		});
		btnNo.setBounds(257, 162, 89, 23);
		panel.add(btnNo);

	}

}
