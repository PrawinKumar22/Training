package com.example.utils;

import java.sql.*;

import java.util.ResourceBundle;

import javax.annotation.Resources;

public class ConnectionFactory {

	public static Connection getOracleConnection() {
		
		Connection con = null;
		
		ResourceBundle labels = ResourceBundle.getBundle("application");
		
		try {
			con = DriverManager.getConnection(labels.getString("datasource.oracle.url"),
					
					labels.getString("datasource.oracle.username"),
					
					labels.getString("datasource.oracle.password"));
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		return con;
		
		
	}
	
	public static Connection getPostgressConnection() {
		
         Connection con = null;
		
		ResourceBundle labels = ResourceBundle.getBundle("application");
		
		try {
			con = DriverManager.getConnection(labels.getString("datasource.postgres.url"),
					
					labels.getString("datasource.postgres.username"),
					
					labels.getString("datasource.postgres.password"));
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		return con;
		
	}
}
