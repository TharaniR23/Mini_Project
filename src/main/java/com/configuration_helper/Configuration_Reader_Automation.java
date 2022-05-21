package com.configuration_helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader_Automation { // Constructor
	public static Properties p;

	public Configuration_Reader_Automation() throws IOException {
		File f = new File(
				"C:\\Users\\ELCOT\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\test_data\\Configuration_properties_Automation");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties(); // Creating empty property list
		p.load(fis); // Loading the list with fis
	}
	
	public String url() {
		String value = p.getProperty("URL"); // Getting the property
		return value;
	}

	public String email() {
		String value = p.getProperty("EmailId"); // Getting the property
		return value;
	}
	
	public String password() {
		String value = p.getProperty("Password"); // Getting the property
		return value;
	}
}
