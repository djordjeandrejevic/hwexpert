package com.sample.gui.upgrade.multimedia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sample.Hardware;
import com.sample.gui.GUIUtil;

public class JPDedicatedSoundcard extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPDedicatedSoundcard() {
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel(
				"Do you have a dedicated sound card?");
		lblNewLabel.setBounds(69, 105, 291, 14);
		panel.add(lblNewLabel);

		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setDedicatedSoundCard(true);
				GUIUtil.changePanel(panel, new JPStorage());
			}
		});
		btnYes.setBounds(96, 162, 89, 23);
		panel.add(btnYes);

		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setDedicatedSoundCard(false);
				GUIUtil.changePanel(panel, new JPStorage());
			}
		});
		btnNo.setBounds(249, 162, 89, 23);
		panel.add(btnNo);

	}

}
