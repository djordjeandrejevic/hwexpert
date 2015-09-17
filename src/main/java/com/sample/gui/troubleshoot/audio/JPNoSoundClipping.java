package com.sample.gui.troubleshoot.audio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sample.Hardware;
import com.sample.Solution;
import com.sample.gui.GUIUtil;
import com.sample.gui.JPFinal;

public class JPNoSoundClipping extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPNoSoundClipping() {
		setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("What type of audio problem are you facing?");
		lblNewLabel.setBounds(120, 104, 218, 14);
		panel.add(lblNewLabel);
		
		JButton btnYes = new JButton("No sound");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setTypeOfSoundProblem("no sound");
				GUIUtil.changePanel(panel, new JPNoSound());
				
			}
		});
		btnYes.setBounds(96, 162, 89, 23);
		panel.add(btnYes);
		
		JButton btnNo = new JButton("Clipping");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setTypeOfSoundProblem("clipping sound");
				GUIUtil.changePanel(panel, new JPFinal(Solution.createSolution()));
			}
		});
		btnNo.setBounds(249, 162, 89, 23);
		panel.add(btnNo);

	}

}
