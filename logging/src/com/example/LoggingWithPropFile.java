package com.example;

import com.training.model.Book;

public class LoggingWithPropFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     String file = LoggingWithPropFile.class.getClassLoader()
    		 .getResource("logging.properties").getFile();

     System.setProperty("java.util.logging.config.file",file);
     
     Book.log.info("Logging Properties Done Right");
     
     Book java = new Book();
     
    
     
	}

}
