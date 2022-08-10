package com.example;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import com.example.entity.Customer;

import com.example.entity.LoanApplication;

import com.example.services.Services;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Connection con;
    	
		try
		
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			
			Services service = new Services(con);
			
			service.findAll().forEach(System.out::println);
			 
//			Customer customer = new Customer(200, "Rocky", 657641,500.0);
//			
//			LoanApplication obj = new LoanApplication(1010,customer, 5000.0);
//			
//			int rowAdded = service.add(obj);
//			
			//System.out.println("RowAdded:"+ rowAdded);
			
			System.out.println("FoundId:"+service.findById(200));
			
		}
		
		catch (SQLException e) 
		
		{
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
    	
    	
    	
   
    }
}
