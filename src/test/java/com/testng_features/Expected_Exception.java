package com.testng_features;

import org.testng.annotations.Test;

public class Expected_Exception {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void calculator() {
		
		int a = 5;
		System.out.println(a / 0);
		System.out.println("Display the output");
	}
}
