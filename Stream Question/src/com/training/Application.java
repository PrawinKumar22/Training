package com.training;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.List;

import com.example.Services;

import com.example.Streams;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		

		
       try
		
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			
			System.out.println(con);
			
		    Services service = new Services(con);

			 Streams stream = new Streams("USA","Los Angeles",3970000);
             
		       service.findAll().forEach(System.out::println);
		        
			
			List<Streams> list= service.findAll(); 
			
			 service.findByplace("USA");	   
			    
			  service.findPopulation("USA",list);
			  
		       service.findByCity("Los Angeles",list);
			  
	}
       catch(SQLException e) {
    	   
    	   e.printStackTrace();
       }
       
}
}
