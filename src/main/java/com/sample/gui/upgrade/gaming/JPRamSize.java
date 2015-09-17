package com.sample.gui.upgrade.gaming;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import com.sample.Hardware;
import com.sample.Solution;
import com.sample.gui.GUIUtil;
import com.sample.gui.JPFinal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPRamSize extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPRamSize() {
		setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("How much RAM do you have? (in gigabytes - GB)");
		lblNewLabel.setBounds(75, 104, 280, 14);
		panel.add(lblNewLabel);

	}
}
