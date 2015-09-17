package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Solution {
	
	public static String createSolution() {
		
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");
		Hardware h = Hardware.getInstance();
        kSession.insert(h);
        
        kSession.fireAllRules();
		String solution = h.getSolution();
		
		if(solution.isEmpty()) {
			solution = "No solution for your problem, sorry :/";			
		}
		
		return solution;
	}

}
