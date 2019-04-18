package com.kamesh.KameshPractice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;

import CustomCollection.CustomSet;

public class CustomSetTest {
	
	
	@Test
	public void insertValues() {
	Set set = new CustomSet(3);
	set.add("Kamesh");
	set.add("Waran");
//	set.add("WARAN");
	assertEquals(2, set.size());
	
	}
	
	@Test
	public void testIsEmpty() {
	Set set = new CustomSet(3);
	
	assertTrue(set.isEmpty());
	
	}

}
