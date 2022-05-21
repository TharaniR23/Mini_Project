package com.testng_features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test_Task {
	
		@Test
		@Parameters({"username" , "password"})
		private void credentials(String username , String password) {
			System.out.println("Username:" + username);
			System.out.println("Password:" + password);
		}
		
		@Test
		@Parameters({"username" , "password"})
		private void login(String username , String password) {
			System.out.println("Username:" + username);
			System.out.println("Password:" + password);
		}

	}

