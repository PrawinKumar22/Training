package com.removingduplicates;

import java.util.Set;

import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
	   
		Set<String> set = new TreeSet<>();
		
		set.add("apple");
		
		set.add("orange");
		
		set.add("apple");
		
		set.add("pineapple");
		
		set.add("orange");
		
		set.add("bananna");
		
		for(String string: set) {
			
			System.out.println(string +"\nPosition:"+ count);
			
			count++;
			
		}
		
	}

}
