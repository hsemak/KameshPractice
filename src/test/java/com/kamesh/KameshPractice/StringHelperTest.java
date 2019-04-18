package com.kamesh.KameshPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Arrayss.StringHelper;

public class StringHelperTest {

	@Test
	public void StringTesterWith2Strings() {
		StringHelper helper = new StringHelper();
		String value = helper.reverseLastTwoCharacter("AB");
		assertEquals("BA", value);
		
	}
	@Test
	public void StringTesterWith4Strings() {
		StringHelper helper = new StringHelper();
		String value = helper.reverseLastTwoCharacter("ABCD");
		assertEquals("ABDC", value);
		
	}
	
}
