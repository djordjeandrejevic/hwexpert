package com.sample.gui.upgrade.gaming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sample.Hardware;
import com.sample.Solution;
import com.sample.gui.GUIUtil;
import com.sample.gui.JPFinalSolution;
import com.sample.gui.JPFinalRecommendations;

public class JPFpsGames extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPFpsGames() {
		setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Do you play FPS (first person shooter) games?");
		lblNewLabel.setBounds(96, 103, 272, 14);
		panel.add(lblNewLabel);
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setFpsGames(true);
				GUIUtil.changePanel(panel, new JPFinalRecommendations((ArrayList<String>) Solution.createRecommendations()));			
			}
		});
		btnYes.setBounds(96, 162, 89, 23);
		panel.add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setFpsGames(false);
				GUIUtil.changePanel(panel, new JPFinalRecommendations((ArrayList<String>) Solution.createRecommendations()));				
			}
		});
		btnNo.setBounds(249, 162, 89, 23);
		panel.add(btnNo);

	}

}
