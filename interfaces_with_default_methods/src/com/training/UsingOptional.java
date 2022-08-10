package com.training;

import java.util.Optional;

public class UsingOptional {
	
	public static Optional<String> getValue(int key){
		
		Optional<String>response = Optional.empty();
		
		if(key==1)
		{
			response = Optional.of("Hii");
		}
		return response;
	}

		public static Object getString(int key) {
			
			switch (key) {
			
			case 1:
				
				return new String("chocobar");
				
			case 2:
				
				return new StringBuffer("cassatta");
				
			default:
				
				return null;
			}
		}
		public static void main(String [] args) {
			
			//will throw null pointer exception for values 3 and above
			
			//System.out.println(getString(3).toString());
			
			//to avoid null pointer exception and return a default value
			
			//new feature of java 8 Optional is used
			
			Optional<Object>optional = Optional.ofNullable(getString(3));
			
			System.out.println(optional.orElse("Vennila").toString());
			
			//Another method
			
			Optional<Object> opt2 = Optional.ofNullable(getString(3));
			
			if(opt2.isPresent()) {
				
				System.out.println("Value is present:"+ opt2.get());
				
			}
			
			else 
			{	
				System.out.println("Value is not present");	
			}
			
			//Another Method
			
//			Optional<Object> opt3 = Optional.ofNullable(getString(3));
//			
//			opt3.orElseThrow(()-> new RuntimeException("No Object For Value 3 try again"));
			
			Optional<String> response = getValue(2);
					
			if(response.isPresent())
			
			{
				System.out.println(response.get());//toString());
				
			}
			
			else {
				System.out.println("Invalid Choice Enter 1");
				
			}
			
			//use same method but throw exception
			
			Optional<String> opt4 = getValue(2);
			
			try {
				opt4.orElseThrow(() -> new Exception("Invalid Choice Enter 1"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			}
	}


