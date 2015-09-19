package com.sample.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sample.Hardware;

public class JPFinalRecommendations extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPFinalRecommendations(ArrayList<String> recommendations) {
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);

		JLabel jlblSlt = new JLabel("** RECOMMENDATIONS **");
		jlblSlt.setBounds(142, 11, 182, 14);
		panel.add(jlblSlt);

		int y = 39;
		for (String recommendation : recommendations) {
			JLabel jlblSolution = new JLabel(recommendation);
			jlblSolution.setFont(new Font("Tahoma", Font.PLAIN, 13));
			jlblSolution.setBounds(61, y, 359, 14);
			panel.add(jlblSolution);
			y = y+15;
			System.out.println(recommendation);
		}

		JButton btnStartOver = new JButton("Start over");
		btnStartOver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setToNull();
				GUIUtil.changePanel(panel, new JPTroubleshootUpgrade());
			}
		});
		btnStartOver.setBounds(141, 117, 154, 23);
		panel.add(btnStartOver);

//		if (!solution.startsWith("No solution")) {
			JButton btnCreatePdf = new JButton("Create PDF");
			btnCreatePdf.setBounds(142, 186, 154, 23);
			panel.add(btnCreatePdf);

			JButton btnDetailedSolution = new JButton("Detailed solution");
			btnDetailedSolution.setBounds(142, 220, 154, 23);
			panel.add(btnDetailedSolution);
//		}
	}
}
