package com.configuration_helper;

import java.io.IOException;

public class File_Reader_Manager_Adactin {
	
	// Singleton Design Pattern (SDP)
	
	private File_Reader_Manager_Adactin() {
		// Empty constructor
	}
	public static File_Reader_Manager_Adactin get_Instance_FRM() {
		File_Reader_Manager_Adactin helper = new File_Reader_Manager_Adactin();
		return helper;
	}
	public Configuration_Reader_Adactin get_Instance_CR() throws Throwable {
		Configuration_Reader_Adactin reader = new Configuration_Reader_Adactin();
		return reader;
		}
}
