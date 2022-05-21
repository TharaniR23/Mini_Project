package com.testng_features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Demo {

	@Test
	private void women() {
		System.out.println("Women");
	}

	@Test
	private void children() {
		System.out.println("Children");
	}
	
	@BeforeSuite
	private void setProperty() {
		System.out.println("Set Property");
	}

	@BeforeTest
	private void browser_Launch() {
		System.out.println("Browser Launch");
	}

	@BeforeClass
	private void getUrl() {
		System.out.println("Get URL");
	}

	@BeforeMethod
	private void signIn() {
		System.out.println("Sign In");
	}

	@AfterMethod
	private void signOut() {
		System.out.println("Sign Out");
	}

	@AfterClass
	private void verify_HomePage() {
		System.out.println("Assert");
	}

	@AfterTest
	private void close() {
		System.out.println("Close");
	}

	@AfterSuite
	private void deleteAllCookies() {
		System.out.println("Delete all cookies");
	}
}
