package com.seleniumtestngtest;

import org.testng.annotations.Test;

public class seleniumtest {

	@Test(priority = 1)
	public void test() {
		System.out.println("Test");
	}
	
	@Test(priority = 2)
	public void tests() {
		System.out.println("Test2");
	}
	
	@Test
	public void testss() {
		System.out.println("Test5");
	}
}
