package com.testng_features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test(enabled = false) // Default value if True
	private void books() {
		System.out.println("Books");
	}

	@Ignore
	@Test(priority = 1)
	private void whatsapp() {
		System.out.println("WhatsApp");
	}

	@Test(priority = 2)
	private void instagram() {
		System.out.println("Instagram");
	}

	@Test(priority = -1)
	private void spotify() {
		System.out.println("Spotify");
	}
	@Test    // Default priority Zero here
	private void wynkMusic() {
		System.out.println("WynkMusic");
	}
}
