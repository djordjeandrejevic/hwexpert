package com.sample.gui.upgrade.officeinternet;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import com.sample.Hardware;
import com.sample.Solution;
import com.sample.Validation;
import com.sample.gui.GUIUtil;
import com.sample.gui.JPFinalRecommendations;
import com.sample.gui.JPFinalSolution;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JTextField;

public class JPCpuCoresOffice extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public JPCpuCoresOffice() {
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("How many cores does your CPU have?");
		lblNewLabel.setBounds(99, 86, 280, 14);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(159, 136, 86, 20);
		panel.add(textField);
		textField.setColumns(10);

		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int enteredNumber = Validation.validateIntegerField(textField
						.getText());
				if (enteredNumber == -1) {
					JOptionPane.showMessageDialog(null,
							"You must enter a number!");
				} else {
					Hardware.getInstance().setCpuCores(enteredNumber);
					GUIUtil.changePanel(panel, new JPFinalRecommendations((ArrayList<String>) Solution.createRecommendations()));
				}
			}
		});
		btnNext.setBounds(159, 195, 89, 23);
		panel.add(btnNext);

	}
}
