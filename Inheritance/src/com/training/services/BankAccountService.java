package com.training.services;

import com.training.model.BankAccount;

public class BankAccountService {
	
	public double calculateInterest(BankAccount account) {
		
		double simpleInterest = 0.05;
		
		if(account.getAccountNumber()<5000) {
			 
			simpleInterest = 0.06;
		}
		return account.getBalance()*1*simpleInterest;
	}
	
	//Overloaded Method//A method can be called directly in another method because which is in the same class//
	public void calculateInterest(BankAccount[]accounts) {
		
		for(BankAccount eachAccount: accounts) {
			
			System.out.println(calculateInterest(eachAccount));
			
			}
	}
	
	public double[]findInterest(BankAccount[] accounts){
		 
		int i=0;
		
		double[] values =new double[2];
		
		for(BankAccount eachAccount:accounts) {
		
			values[i]= calculateInterest(eachAccount);
			i++;
		}
		return values;
	}
	
	private double calculateByAccountType(BankAccount account,double rateOfInterest) {
		
		//String type =account.getAccountType();

		//if(type.equals("savings")){
			
			//rateOfInterest=0.5;
		//}
		//if(type.equals("fixed")|| type.equals("recurring")) {
			//rateOfInterest = 0.06;
		//}
		return account.getBalance()*1*rateOfInterest;
	}
	
	public double[] findInterestByAccountType(BankAccount[]accounts) {
		
		double[] values= new double[accounts.length];
		
		int i=0;
		
		for(BankAccount eachAccount : accounts) {
			
			String key = eachAccount.getAccountType();
			
			switch(key) {
			
			case "savings":
				
				values[i]=calculateByAccountType(eachAccount,0.5);
			
			break;
			
			case "fixed":
				
				values[i]=calculateByAccountType(eachAccount,0.7);
			
			break;
			
			case "recurring":
			
				values[i]=calculateByAccountType(eachAccount,0.7);
			break;
			
			default:
			
			break;	
			}
              i++;
		}
		return values;

	}
	
}

