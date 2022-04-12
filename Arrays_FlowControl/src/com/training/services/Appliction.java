package com.training.services;

import com.training.model.BankAccount;

public class Appliction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccountService service = new BankAccountService();
		
		BankAccount ram = new BankAccount(1200,"Ramesh",5000);
		
		 double simpleInterest =service.calculateInterest(ram);
		 
		// System.out.println("Simple Interest:"+simpleInterest);
		 
		 BankAccount shyam = new BankAccount(6200,"Rajesh",5000);
			
		 double simpleInterest2 =service.calculateInterest(shyam);
		 
		 //System.out.println("Simple Interest:"+simpleInterest2);
		 
		 //BankAccount[] accounts = new BankAccount[2];
		 
		// accounts[0] =ram;
		 
		// accounts[1] = shyam;
		 
		//service.calculateInterest(accounts);
		 
		BankAccount[] accounts = {ram,shyam};
		 
		 service.calculateInterest(accounts);
		 
		 System.out.println("\n");
		 
		 double[] values =service.findInterest(accounts);
		 
		 for(double eachValue:values) {
			 
			 System.out.println(eachValue);
		 }
		 BankAccount[]accountList= {
				 
				 new BankAccount(800,"jay",5000,"savings"),
				 
				 new BankAccount(801,"jay",6000,"fixed"),
				 
				 new BankAccount(802,"jay",7000,"recurring"),
		 };
		 
		 System.out.println("\n\n");
		 
		 double[] insertValues = service.findInterestByAccountType(accountList);
		 
		 for(double eachvalue:insertValues) {
			
			 System.out.println(eachvalue);
		 }		 
	}

}
