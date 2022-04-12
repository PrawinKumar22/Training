package com.training.services;

public class ExceptionHandling {
	
	public void usingArrayIndexException(String[] args) {
		
		try 
		
		{
			
			
			System.out.println(args[2]);
		} 
		
		catch (Exception e) 
		
		{
			// TODO Auto-generated catch block
			
			System.out.println("Methods required three values to be passed [a,b,c]");
			
			e.printStackTrace();
		}
		
	}
	
	public void usingNumberFormatException(String value) {
		
		int age = 0;
		
		try 
		
		{
		   age = Integer.parseInt(value);
		   
		   System.out.println(age);
		
		} 
	
		catch (NumberFormatException e) 
		
		{
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
		
	}
	public void usingFinallyBlock() {
		
		int denominator = 4;
		
		try {
			System.out.println(4/denominator);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Denominator Should not be zero");
		}
		
	
	finally {
		System.out.println("Inside Finally ");
	}
	System.out.println("Thanks,bye bye!!");
	
	}
public String underStandFinallyBlock() {
		
		int denominator = 0;
		
		try {
			System.out.println(4/denominator);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Denominator Should not be zero");
			
			//return "Welcome";
			
			try {
				
				throw new Exception();
				
			} 
			catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				
				e1.printStackTrace();
			}
		}
		
	
	finally {
		System.out.println("Inside Finally ");
	}
	System.out.println("Thanks,bye bye!!");
	
	return "thanks";
	
	}
}
