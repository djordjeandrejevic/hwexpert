package com.sample.gui.upgrade.multimedia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sample.Hardware;
import com.sample.Solution;
import com.sample.gui.GUIUtil;
import com.sample.gui.JPFinalRecommendations;

public class JPStorage extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPStorage() {
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel(
				"<html>Do you have enough storage for<br>high definition movies / lossless audio?</html>");
		lblNewLabel.setBounds(129, 81, 280, 38);
		panel.add(lblNewLabel);

		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setEnoughStorage(true);
				GUIUtil.changePanel(panel, new JPFinalRecommendations((ArrayList<String>) Solution.createRecommendations()));
			}
		});
		btnYes.setBounds(96, 162, 89, 23);
		panel.add(btnYes);

		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setEnoughStorage(false);
				GUIUtil.changePanel(panel, new JPFinalRecommendations((ArrayList<String>) Solution.createRecommendations()));
			}
		});
		btnNo.setBounds(249, 162, 89, 23);
		panel.add(btnNo);

	}

}
