package com.sample.gui.upgrade.multimedia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sample.Hardware;
import com.sample.gui.GUIUtil;

public class JPHtpcRegularPc extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPHtpcRegularPc() {
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel(
				"<html>Are you planning to use PC as HTPC (Home Theater PC) <br> or regular PC?</html>");
		lblNewLabel.setBounds(69, 93, 322, 35);
		panel.add(lblNewLabel);

		JButton btnHtpc = new JButton("HTPC");
		btnHtpc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setHtpcOrRegular("htpc");
				GUIUtil.changePanel(panel, new JPSpeakers());
			}
		});
		btnHtpc.setBounds(82, 162, 102, 23);
		panel.add(btnHtpc);

		JButton btnRegularPC = new JButton("Regular PC");
		btnRegularPC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setHtpcOrRegular("regular");
				GUIUtil.changePanel(panel, new JPMonitorSize());
			}
		});
		btnRegularPC.setBounds(252, 162, 102, 23);
		panel.add(btnRegularPC);

	}

}
