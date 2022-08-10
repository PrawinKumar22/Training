package com.example;

import java.util.logging.*;

public class Application {
	
	public static  void main(String[]args) {
		
		Logger log = Logger.getLogger("com.example.Application");
		
		log.setLevel(Level.SEVERE);
			
		log.info("Info Message");
		
		//System.out.println("Info Message");
		
		log.warning("Warning Message");
		
		log.severe("Serve Message");
		
		log.fine("I am Fine Message");
	
		
	}

}
