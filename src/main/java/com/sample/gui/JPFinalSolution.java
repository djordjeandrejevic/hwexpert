package com.sample.gui;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import com.sample.Hardware;
import com.sample.Solution;

import java.awt.BorderLayout;
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
				Hardware.getInstance().setToNull();
				GUIUtil.changePanel(panel, new JPTroubleshootUpgrade());
			}
		});
		btnStartOver.setBounds(141, 117, 154, 23);
		panel.add(btnStartOver);

			JButton btnDetailedSolution = new JButton("Create detailed solution");
			btnDetailedSolution.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Solution.savePDF();
					JDSavePDF jd = new JDSavePDF();
					jd.setLocationRelativeTo(null);
					jd.setModal(true);
					jd.setVisible(true);
				}
			});
			btnDetailedSolution.setBounds(142, 220, 154, 23);
			panel.add(btnDetailedSolution);
//		}
	}
}
