package com.kamesh.KameshPractice;

public class StringHelper {

	
	public String reverseLastTwoCharacter(String accept) {
		int length = accept.length();
		String str = accept.substring(0, length -2);
		
		char secondLastCharacter = accept.charAt(length-2);
		char lastCharacter = accept.charAt(length-1);
		
		
		return str+lastCharacter+secondLastCharacter;
	}
	
}
