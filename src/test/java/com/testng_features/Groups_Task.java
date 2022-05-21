package com.testng_features;

import org.testng.annotations.Test;

public class Groups_Task {

	@Test(priority = 0, groups = "Books") 
	private void books() {
		System.out.println("Books");
	}

	
	@Test(priority = 1, groups = "Social Media")
	private void whatsapp() {
		System.out.println("WhatsApp");
	}

	@Test(priority = -1, groups = "Social Media")
	private void instagram() {
		System.out.println("Instagram");
	}

	@Test(priority = 2, groups = "Music")
	private void spotify() {
		System.out.println("Spotify");
	}

	@Test(priority = -2, groups = "Music") 
	private void wynkMusic() {
		System.out.println("WynkMusic");
	}
}
