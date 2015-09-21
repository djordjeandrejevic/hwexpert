package com.sample;

import java.awt.Desktop;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.goodoldai.jeff.wizard.JEFFWizard;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Solution {

	private static JEFFWizard ef;
	private static String explanation;

	public static String createSolution() {

		Hardware h = callDroolsMethods();
		String solution = h.getSolution();

		if (solution.isEmpty()) {
			solution = "No solution for your problem, sorry :/";
		}

		return solution;
	}

	public static List<String> createRecommendations() {
		Hardware h = callDroolsMethods();
		List<String> recommendations = h.getRecommendations();
		if (recommendations.isEmpty()) {
			recommendations.add("Sorry, no recommendations :/");
		}
		return (ArrayList<String>) recommendations;
	}

	private static Hardware callDroolsMethods() {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");
		Hardware h = Hardware.getInstance();
		kSession.insert(h);
		initializeJEFF(kSession);
		kSession.fireAllRules();
		return h;
	}

	private static void initializeJEFF(KieSession kSession) {
		ef = new JEFFWizard();
//		ef.setInternationalization(false);
		
		ef.setInternationalization(true);
		ef.setLanguage("en");
		ef.setCountry("US");		
		
		ef.setTitle("HWExpert explanation");
		ef.createExplanation();
		kSession.setGlobal("ef", ef);
	}

//	public static String readExplanationFromProperties(String ruleName) {
//		Properties props = new Properties();
//		InputStream input = null;
//		try {
//			input = new FileInputStream("troubleshoot-explanation.properties");
//			props.load(input);
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		}
//		return props.getProperty(ruleName);
//	}

	public static void savePDF() {
		ef.generatePDFReport("Explanation.pdf", false);
		if (Desktop.isDesktopSupported())
			try {
				java.awt.Desktop.getDesktop().browse(
						java.net.URI
								.create((new java.io.File("Explanation.pdf")
										.toURI().toString())));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
