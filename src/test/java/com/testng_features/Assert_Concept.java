package com.testng_features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {

	@Test
	private void usernames() {
		String exp_username = "Jack";
		String actual_username = "John";
		Assert.assertEquals(exp_username, actual_username);  // Assert Equals
		System.out.println("Assert Validation");
	}
	
	@Test
	private void username() {
		String exp_username = "Jack";
		String actual_username = "John";
		Assert.assertNotEquals(exp_username, actual_username);  // Assert Not Equals
		System.out.println("Username - Assert Validation");
	}
	
	@Test
	private void soft_Username() {
		String exp_username = "Peter";
		String actual_username = "Jacob";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual_username, actual_username);  // Soft Assert
		System.out.println("Assert Verification");
	}
	
}
