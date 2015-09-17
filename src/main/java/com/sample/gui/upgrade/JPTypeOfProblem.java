package com.sample.gui.upgrade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sample.Hardware;
import com.sample.gui.GUIUtil;
import com.sample.gui.troubleshoot.audio.JPNoSoundClipping;
import com.sample.gui.troubleshoot.shutdownrestart.JPNoisy;
import com.sample.gui.troubleshoot.stuttering.JPDifferentRAMSticks;
import com.sample.gui.troubleshoot.video.JPCheckedCable;

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
		
		JButton btnShutdownrestartProblem = new JButton("Gaming");
		btnShutdownrestartProblem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setPrimaryUsage("gaming");
				GUIUtil.changePanel(panel, new JPNoisy());
			}
		});
		btnShutdownrestartProblem.setBounds(120, 104, 200, 23);
		panel.add(btnShutdownrestartProblem);
		
		JButton btnStutteringProblem = new JButton("office/internet");
		btnStutteringProblem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setPrimaryUsage("office/internet");
				GUIUtil.changePanel(panel, new JPDifferentRAMSticks());
			}
		});
		btnStutteringProblem.setBounds(120, 138, 200, 23);
		panel.add(btnStutteringProblem);
		
		JButton btnAudioProblem = new JButton("Multimedia");
		btnAudioProblem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setPrimaryUsage("multimedia");
				GUIUtil.changePanel(panel, new JPNoSoundClipping());
			}
		});
		btnAudioProblem.setBounds(120, 172, 200, 23);
		panel.add(btnAudioProblem);

	}
}
