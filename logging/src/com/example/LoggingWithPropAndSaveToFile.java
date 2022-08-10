package com.example;

import java.util.logging.FileHandler;

import com.training.model.Book;

//public class LoggingWithPropAndSaveToFile {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		String file = LoggingWithPropFile.class.getClassLoader()
//	    		 .getResource("logging.properties").getFile();
//
//	     System.setProperty("java.util.logging.config.file",file);
//	     
//	     Book.log.info("Logging Properties Done Right");
//	     
//	     FileHandler handler;
//			
//		try {
//				
//				handler = new FileHandler("logs2.log");
//				
//				Book.log.addHandler(handler);
//				
//				Book.log.info("Logging Properties Done Right");
//				
//			    Book java = new Book();
//			     
//			    Book.log.info(java.toString());
//			     
//			}
//			catch(SecurityException e) {
//				
//				// TODO Auto-generated catch block
//			
//				Book.log.warning(e.getMessage());
//				
//				e.printStackTrace();
//	   }
//	}
//
//}
