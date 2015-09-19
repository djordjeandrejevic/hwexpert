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
import com.sample.gui.upgrade.gaming.JPSlowGameLoading;
import com.sample.gui.upgrade.multimedia.JPHtpcRegularPc;
import com.sample.gui.upgrade.officeinternet.JPSlowStartup;

public class JPUpgrade extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPUpgrade() {
		setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblWhatTypeOf = new JLabel("What is the primary purpose of your PC?");
		lblWhatTypeOf.setBounds(104, 71, 273, 14);
		panel.add(lblWhatTypeOf);
		
		JButton btnGaming = new JButton("Gaming");
		btnGaming.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setPrimaryUsage("gaming");
				GUIUtil.changePanel(panel, new JPSlowGameLoading());
			}
		});
		btnGaming.setBounds(120, 104, 200, 23);
		panel.add(btnGaming);
		
		JButton btnOfficeInternet = new JButton("Office / Internet");
		btnOfficeInternet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setPrimaryUsage("office/internet");
				GUIUtil.changePanel(panel, new JPSlowStartup());
			}
		});
		btnOfficeInternet.setBounds(120, 138, 200, 23);
		panel.add(btnOfficeInternet);
		
		JButton btnMultimedia = new JButton("Multimedia");
		btnMultimedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setPrimaryUsage("multimedia");
				GUIUtil.changePanel(panel, new JPHtpcRegularPc());
			}
		});
		btnMultimedia.setBounds(120, 172, 200, 23);
		panel.add(btnMultimedia);

	}
}
