package com.configuration_helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader_Adactin { //Constructor
	public static Properties p;
	
	public Configuration_Reader_Adactin() throws IOException{
	File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\test_data\\Configuration_properties");
	FileInputStream fis = new FileInputStream(f);
	p = new Properties(); // Creating empty property list
	p.load(fis); // Loading the list with fis
	}
	
public String get_config_url() {
	String value = p.getProperty("URL"); // Getting the property
	return value;	
}
public String get_config_username() {
	String value = p.getProperty("user_Name");
	return value;	
}
public String get_config_password() {
	String value = p.getProperty("password");
	return value;	
}


}
