package com.training;

import java.util.Arrays;

import java.util.List;


public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>names = Arrays.asList("India","SriLanka","Indonesia","Bhutan");

		for(String eachName:names) {
			
			System.out.println(eachName);
			
		}
		
		//names.forEach(value-> System.out.println(value));
		
		//Method Reference
		
		names.forEach(System.out::println);
		
	}

}
