package com.sample.gui.troubleshoot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sample.Hardware;
import com.sample.gui.GUIUtil;
import com.sample.gui.troubleshoot.shutdownrestart.JPNoisy;

public class JPTypeOfProblem extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPTypeOfProblem() {
		setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblWhatTypeOf = new JLabel("What type of hardware issue are you facing?");
		lblWhatTypeOf.setBounds(104, 71, 273, 14);
		panel.add(lblWhatTypeOf);
		
		JButton btnShutdownrestartProblem = new JButton("Shutdown/restart problem");
		btnShutdownrestartProblem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setProblemToFix("shutdown/restart");;
				GUIUtil.changePanel(panel, new JPNoisy());
			}
		});
		btnShutdownrestartProblem.setBounds(120, 104, 200, 23);
		panel.add(btnShutdownrestartProblem);
		
		JButton btnStutteringProblem = new JButton("Stuttering problem");
		btnStutteringProblem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnStutteringProblem.setBounds(120, 138, 200, 23);
		panel.add(btnStutteringProblem);
		
		JButton btnAudioProblem = new JButton("Audio problem");
		btnAudioProblem.setBounds(120, 172, 200, 23);
		panel.add(btnAudioProblem);
		
		JButton btnVideoProblem = new JButton("Video problem");
		btnVideoProblem.setBounds(120, 206, 200, 23);
		panel.add(btnVideoProblem);

	}
}
