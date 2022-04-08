package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer(101,"Prawin",95986,"pkb2123");
		
		try {
			customer.checkEmailId();
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		

	}

}
