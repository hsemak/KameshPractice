package com.kamesh.KameshPractice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import CustomCollection.CustomList;
import junit.framework.TestCase;

public class CustomListTest  {
	
	@Test
	public void IsListEmpty() {
	  CustomList custom = new CustomList();
	  assertTrue(custom.isEmpty());
	}
	
}
