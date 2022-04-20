package com.example;

import java.util.*;

import java.sql.*;

import java.sql.Date;

import java.time.*;

public class WorkingWithDifferenceDateClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating UTIL Date
		
		java.util.Date  date1 = new java.util.Date();
		
		//java.sql.Date date2 = new java.sql.Date(1020303);
		
		System.out.println(date1);
		
		System.out.println(date1.getTime());
		
		//UTIL Date to SQL Date
		
		java.sql.Date date2 = new java.sql.Date(date1.getTime());
		
		System.out.println(date2);

		//SQL Date to LocalDate
		
		LocalDate localDate = date2.toLocalDate();
		
		System.out.println(localDate.getDayOfWeek());
		
		System.out.println(localDate.getMonthValue());
		
		//Local Date to SQL Date
		
		java.sql.Date sqlDate2 = java.sql.Date.valueOf(localDate);
		
		System.out.println("Sql date2:"+sqlDate2);
		
	}

}
