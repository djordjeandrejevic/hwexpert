package com.sample.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import com.sample.Hardware;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPFinalSolution extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPFinalSolution(String solution) {
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);

		JLabel jlblSlt = new JLabel("** SOLUTION **");
		jlblSlt.setBounds(164, 11, 108, 14);
		panel.add(jlblSlt);

		JLabel jlblSolution = new JLabel(solution);
		jlblSolution.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jlblSolution.setBounds(61, 49, 359, 14);
		panel.add(jlblSolution);

		JButton btnStartOver = new JButton("Start over");
		btnStartOver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().equals(null);
				GUIUtil.changePanel(panel, new JPTroubleshootUpgrade());
			}
		});
		btnStartOver.setBounds(141, 117, 154, 23);
		panel.add(btnStartOver);

		if (!solution.startsWith("No solution")) {
			JButton btnCreatePdf = new JButton("Create PDF");
			btnCreatePdf.setBounds(142, 186, 154, 23);
			panel.add(btnCreatePdf);

			JButton btnDetailedSolution = new JButton("Detailed solution");
			btnDetailedSolution.setBounds(142, 220, 154, 23);
			panel.add(btnDetailedSolution);
		}
	}
}
