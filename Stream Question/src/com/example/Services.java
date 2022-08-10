package com.example;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;



public class Services {
	
	private Connection con;
	
	public Services(Connection con) {
		
		super();
		
		this.con = con;
		
	}
	
	public List<Streams>findAll(){
		
		List<Streams> stream = new ArrayList<Streams>();
			
			String sql = "select * from prawincountry";
			
	        try(PreparedStatement pstmt = con.prepareStatement(sql)){
				
				ResultSet rs =pstmt.executeQuery();
				
				while(rs.next()) {
					
					String country = rs.getString("country");
					
					String place = rs.getString("place");
															
					long population = rs.getLong("population");	
					
					
					Streams stream1 = new Streams(country, place, population);
					
					
					stream.add(stream1);
				}	
	        }
				
				catch(SQLException e) {
					
					e.printStackTrace();
				}
	
		return stream;
		
	        }
	
	public List<String> findByplace(String country){
		
		List<String> list = new ArrayList<>();
		
		List<Streams> service = findAll();
		
		list = service.stream().filter(e-> e.getCountry().equals(country)).
				
				map(e-> e.getPlace()).collect(toList());
		
		System.out.println(list);
		
				return list;
		
		
	}
	
	public void findPopulation(String population, List<Streams>list) {
		
		List<Long> pop = list.stream().filter(e-> e.getCountry().equals(population))
				
				.map(e-> e.getPopulation()).collect(toList());
		
		System.out.println(pop);
		
	}
	
	public void findByCity(String city, List<Streams>list) {
		
	long count	= list.stream().filter(e-> e.getCountry().equalsIgnoreCase(city)).count();
	
	System.out.println(count);
	}

}

