package com.testng_features;

import org.testng.annotations.Test;

public class TimeOut_Test {
	@Test(timeOut = 8000)
	private void browser_Configuration() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("Browser Launch");
		
		Thread.sleep(1000);
		System.out.println("URL Launch");
		
		Thread.sleep(3000);
		System.out.println("Credentials Entered");
		
		Thread.sleep(1000);
		System.out.println("Next page");
	}

}
