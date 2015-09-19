package com.sample.gui.upgrade.multimedia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import com.sample.Hardware;
import com.sample.gui.GUIUtil;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

public class JPSpeakers extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPSpeakers() {
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel(
				"How much VRAM does your graphic card have?");
		lblNewLabel.setBounds(68, 61, 332, 14);
		panel.add(lblNewLabel);

		final JRadioButton rdbtnNewRadioButton = new JRadioButton("2.0");
		rdbtnNewRadioButton.setActionCommand("2.0");
		rdbtnNewRadioButton.setBounds(146, 94, 109, 23);
		panel.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2.1");
		rdbtnNewRadioButton_1.setActionCommand("2.1");
		rdbtnNewRadioButton_1.setBounds(146, 120, 109, 23);
		panel.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("5.1");
		rdbtnNewRadioButton_2.setActionCommand("5.1");
		rdbtnNewRadioButton_2.setBounds(146, 146, 109, 23);
		panel.add(rdbtnNewRadioButton_2);

		final ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnNewRadioButton);
		btnGroup.add(rdbtnNewRadioButton_1);
		btnGroup.add(rdbtnNewRadioButton_2);

		final ArrayList<JRadioButton> radioButtonList = new ArrayList<JRadioButton>();
		radioButtonList.add(rdbtnNewRadioButton);
		radioButtonList.add(rdbtnNewRadioButton_1);
		radioButtonList.add(rdbtnNewRadioButton_2);

		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JRadioButton selectedBtn = null;
				for (JRadioButton btn : radioButtonList) {
					if (btn.isSelected()) {
						selectedBtn = btn;
						break;
					}
				}
				if (selectedBtn == null) {
					JOptionPane.showMessageDialog(null,
							"You must select one radio button!", "Warning",
							JOptionPane.ERROR_MESSAGE);
				} else {
					Hardware.getInstance().setSpeakers(selectedBtn.getActionCommand());;
					GUIUtil.changePanel(panel, new JPDedicatedSoundcard());
				}

			}
		});
		btnNext.setBounds(146, 217, 89, 23);
		panel.add(btnNext);

	}
}
