package com.sample.gui.troubleshoot.shutdownrestart;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import com.sample.Hardware;
import com.sample.Solution;
import com.sample.gui.GUIUtil;
import com.sample.gui.JPFinal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPCleaned extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPCleaned() {
		setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Have you cleaned your PC recently?");
		lblNewLabel.setBounds(120, 104, 218, 14);
		panel.add(lblNewLabel);
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setCleaned(true);
				GUIUtil.changePanel(panel, new JPFinal(Solution.createSolution()));
				
			}
		});
		btnYes.setBounds(96, 162, 89, 23);
		panel.add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setCleaned(false);
				GUIUtil.changePanel(panel, new JPFinal(Solution.createSolution()));
			}
		});
		btnNo.setBounds(249, 162, 89, 23);
		panel.add(btnNo);

	}

}
