package com.sample;

public class Validation {
	
	public static int validateIntegerField(String fieldContent) {
		try {
			int number = Integer.parseInt(fieldContent);
			return number;
		}
		catch(Exception ex) {
			System.out.println(ex);
			return -1;
		}
	}

}
