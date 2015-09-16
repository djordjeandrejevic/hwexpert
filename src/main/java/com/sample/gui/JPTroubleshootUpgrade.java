package com.sample.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.sample.Hardware;
import com.sample.gui.troubleshoot.JPTypeOfProblem;

public class JPTroubleshootUpgrade extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPTroubleshootUpgrade() {
		
		final JPanel panel = new JPanel();
		add(panel);
		
		JButton jbtnTroubleshoot = new JButton("Troubleshoot");
		
		
		jbtnTroubleshoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hardware.getInstance().setFixOrUpgrade("fix");
				GUIUtil.changePanel(panel, new JPTypeOfProblem());
			}
		});
		
		JButton jbtnUpgrade = new JButton("Upgrade");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 434, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(58)
					.addComponent(jbtnTroubleshoot)
					.addPreferredGap(ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
					.addComponent(jbtnUpgrade)
					.addGap(46))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 262, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(115)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbtnTroubleshoot)
						.addComponent(jbtnUpgrade))
					.addContainerGap(124, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);

	}

}
