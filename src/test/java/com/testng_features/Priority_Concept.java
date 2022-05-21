package com.testng_features;

import org.testng.annotations.Test;

public class Priority_Concept {

	@Test(priority = -1)
	private void username() {
		System.out.println("Username");
	}

	@Test // priority Zero here
	private void password() {
		System.out.println("Password");
	}

	@Test(priority = 1)
	private void login() {
		System.out.println("Login");

	}

}

// Order is Negative to Zero to Positive