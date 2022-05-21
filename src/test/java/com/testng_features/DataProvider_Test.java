package com.testng_features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test {
	@Test(dataProvider = "test_Data")
	private void adactin_Runner(String username, int password) {
		System.out.println("Username:" + username);
		System.out.println("Password:" + password);
	}

	@DataProvider
	private Object[][] test_Data() {
		return new Object[][] { { "Peter", 123 }, { "John", 456 }, { "Jack", 789 } };
	}
	
	@Test(priority = -1, dataProvider = "test_Datas")
	private void automation_Runner(String username, int password) {
		System.out.println("Username:" + username);
		System.out.println("Password:" + password);
	}

	@DataProvider
	private Object[][] test_Datas() {
		return new Object[][] { { "Jason", 567 }, { "Joseph", 234 }, { "Alex", 678 } };
	}
}
