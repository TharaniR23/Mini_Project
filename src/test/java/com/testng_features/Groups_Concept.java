package com.testng_features;

import org.testng.annotations.Test;

public class Groups_Concept {
	
	@Test(groups = "Books") // Default value if True
	private void books() {
		System.out.println("Books");
	}

	@Test(groups = "Social Media")
	private void whatsapp() {
		System.out.println("WhatsApp");
	}

	@Test(groups = "Social Media")
	private void instagram() {
		System.out.println("Instagram");
	}

	@Test(groups = "Music")
	private void spotify() {
		System.out.println("Spotify");
	}
	@Test(groups = "Music")   // Default priority Zero here
	private void wynkMusic() {
		System.out.println("WynkMusic");
	}
}
