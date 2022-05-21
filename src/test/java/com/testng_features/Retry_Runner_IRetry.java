package com.testng_features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Runner_IRetry {

	@Test(retryAnalyzer = Retry_Class.class)
	private void username() {
		String expected_Username = "Peter";  // John changed to Peter
		String actual_Username = "Peter";
		Assert.assertEquals(actual_Username, expected_Username);
	}

	@Test(priority = 1)
	private void password() {
		String expected_Password = "Peter123"; // John123 changed to Peter123
		String actual_Password = "Peter123";
		Assert.assertEquals(actual_Password, expected_Password);

	}
}

