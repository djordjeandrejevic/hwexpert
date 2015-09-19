package com.sample.gui.upgrade.officeinternet;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import com.sample.Hardware;
import com.sample.Solution;
import com.sample.gui.GUIUtil;
import com.sample.gui.JPFinalSolution;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPMultitasking extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPMultitasking() {
		setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>Do you have problems when multitasking<br>(i.e. too many opened tabs in browser etc.)?</html>");
		lblNewLabel.setBounds(96, 84, 299, 45);
		panel.add(lblNewLabel);
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setMultitask(true);
				GUIUtil.changePanel(panel, new JPCpuCoresOffice());
				
			}
		});
		btnYes.setBounds(96, 162, 89, 23);
		panel.add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setMultitask(false);
				GUIUtil.changePanel(panel, new JPCpuCoresOffice());
			}
		});
		btnNo.setBounds(249, 162, 89, 23);
		panel.add(btnNo);

	}

}
