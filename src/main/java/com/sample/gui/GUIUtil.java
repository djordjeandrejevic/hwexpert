package com.sample.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GUIUtil {

	public static void changePanel(JPanel panelToRemove, JPanel panelToShow) {
		
		panelToRemove.removeAll();
		panelToRemove.revalidate();
		panelToRemove.repaint();		
		
		JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(panelToRemove);		
		topFrame.add(panelToShow);
		

	}
}
