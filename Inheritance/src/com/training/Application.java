package com.training;

import com.training.model.BankAccount;

import com.training.model.SavingsAccount;
import com.training.services.BankAccountService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount ramsAccount = new BankAccount(1010,"Ramesh",5000,"Savings");
		
		System.out.println(ramsAccount.toString());
		
		SavingsAccount account = new SavingsAccount(110,"Prawin",1000,"Savings","pkb");
		
		System.out.println(account.getAccountHolderName());
		
		System.out.println(account.getNominee());
		
		SavingsAccountService service = new SavingsAccountService();
		
		System.out.println(service.getCustomerInfo(account));
		
		System.out.println(service.calculateInterest(account));
		
		BankAccountService service2 = new SavingsAccountService();
		
		//cannot access the sub class method with super class reference//
		
		//service2.getCustomerInfo(account);
		
		SavingsAccountService savingsService2 = (SavingsAccountService)service2;
		
		System.out.println(savingsService2.getCustomerInfo(account));
		

	}

}
