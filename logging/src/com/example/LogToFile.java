package com.example;

import java.io.IOException;

import java.util.logging.*;

public class LogToFile {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Logger log =Logger.getLogger(LogToFile.class.getName());
		
		FileHandler handler;
		
		try {
			handler = new FileHandler("logs.log");
			
			log.addHandler(handler);
			
			//log.info("Try Block Called");
			
			
				throw new Exception("Hii");
				
			
		} catch (SecurityException e) {
			
			// TODO Auto-generated catch block
		
			log.warning(e.getMessage());
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			
			log.warning(e.getMessage());
			
			e.printStackTrace();
			
		}
		catch(Exception e) {
			
			log.warning(e.getMessage());
		}
	
		
	}

}
