package com.training;

import java.util.*;

import java.util.function.*;

public class UsingPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<String>names = Arrays.asList("India","SriLanka","Indonesia","Bhutan");
	
	Predicate<String>containsChar = (country)->country.toUpperCase().startsWith("I");

	//Consumer<String>consumer = (value)->System.out.println(value);
	
	//names.forEach(consumer);
	
	names.forEach((value)->System.out.println(value));
	
	Predicate<String>containsChar1 = (country)->country.toUpperCase().startsWith("I");
	
	Consumer<String>consumer = (value)->
	{
		if(containsChar.test(value)) {
			
			System.out.println(value);
		}
	
	};
	
	names.forEach(consumer);
	
}
	
}
