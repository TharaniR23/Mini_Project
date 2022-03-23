package com.Logger_Concept;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logger_Basic_Config {
	
	public static Logger log = Logger.getLogger(Logger_Basic_Config.class);
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		log.debug("Debug");
		log.info("Info");
		log.warn("Warning");
		log.error("Error");
		log.fatal("Fatal");
		
	}

}
