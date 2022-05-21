package com.testng_features;

import org.testng.annotations.Test;

public class Invocation_Count {
	@Test(priority = -1)
	private void browser_Launch() {
		System.out.println("Browser Launch");
	}

	@Test
	private void launch_Url() {
		System.out.println("Launch URL");

	}

	@Test(priority = 0, invocationCount = 3)
	private void refresh() {
		System.out.println("Refresh");
	}

	@Test(priority = 2)
	private void Credentials() {
		System.out.println("Credentials");
	}
}
