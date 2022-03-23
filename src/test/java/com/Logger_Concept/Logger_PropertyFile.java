package com.Logger_Concept;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logger_PropertyFile {
	
	public static Logger log = Logger.getLogger(Logger_PropertyFile.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.debug("Debug");
		log.info("Info");
		log.warn("Warning");
		log.error("Error");
		log.fatal("Fatal");
		
	}

}
