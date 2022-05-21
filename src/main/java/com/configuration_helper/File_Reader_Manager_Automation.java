package com.configuration_helper;

public class File_Reader_Manager_Automation {
	
	// Singleton Design Pattern (SDP)
	
	private File_Reader_Manager_Automation() {
		// Empty constructor
	}
	public static File_Reader_Manager_Automation get_Instance_FRM() {
		File_Reader_Manager_Automation helper = new File_Reader_Manager_Automation();
		return helper;
	}
	public Configuration_Reader_Automation get_Instance_CR() throws Throwable {
		Configuration_Reader_Automation reader = new Configuration_Reader_Automation();
		return reader;
		}
}