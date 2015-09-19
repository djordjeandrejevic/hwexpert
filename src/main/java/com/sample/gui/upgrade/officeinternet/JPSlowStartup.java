package com.sample.gui.upgrade.officeinternet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sample.Hardware;
import com.sample.gui.GUIUtil;

public class JPSlowStartup extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPSlowStartup() {
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel(
				"Are you facing a slow system or program startup?");
		lblNewLabel.setBounds(69, 105, 291, 14);
		panel.add(lblNewLabel);

		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setSlowStartup(true);
				GUIUtil.changePanel(panel, new JPMultitasking());
			}
		});
		btnYes.setBounds(96, 162, 89, 23);
		panel.add(btnYes);

		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setSlowStartup(false);
				GUIUtil.changePanel(panel, new JPMultitasking());
			}
		});
		btnNo.setBounds(249, 162, 89, 23);
		panel.add(btnNo);

	}

}
