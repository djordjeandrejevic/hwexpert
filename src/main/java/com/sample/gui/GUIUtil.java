package com.sample.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GUIUtil {

	public static void changePanel(JPanel panelToRemove, JPanel panelToShow) {
		
//		panelToRemove.hide();
//		panelToRemove.removeAll();
//		panelToRemove.revalidate();
//		panelToRemove.repaint();		
		
		JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(panelToRemove);		
//		topFrame.getContentPane().remove(panelToRemove);
		topFrame.getContentPane().removeAll();
		topFrame.getContentPane().revalidate();
		topFrame.getContentPane().repaint();
		topFrame.getContentPane().add(panelToShow);		
		

	}
}
