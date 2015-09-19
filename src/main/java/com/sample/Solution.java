package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Solution {
	
	public static String createSolution() {
		
		Hardware h = callDroolsMethods();
		String solution = h.getSolution();		
		
		if(solution.isEmpty()) {
			solution = "No solution for your problem, sorry :/";			
		}
		
		return solution;
	}
	
	public static List<String> createRecommendations() {
		Hardware h = callDroolsMethods();
		List<String> recommendations = h.getRecommendations();
		if(recommendations.isEmpty()) {
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
        kSession.fireAllRules();
        return h;
	}

}
