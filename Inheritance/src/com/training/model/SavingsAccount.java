package com.training.model;

public class SavingsAccount extends BankAccount {
	
	private String nominee;
	
	//whenever sub class constructor is called its super class//
			//constructor is also called.Even super keyword is not used//
			
	
	//public SavingsAccount() {
		
		//super();
		
		//System.out.println("Constructor of Sub Class Called");
	//}
	
	public SavingsAccount() {
  	  
		super(101,"Prawin",88);
  	  
		System.out.println("Constructor of sub calss is called");
    }

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee = nominee;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}


}
     
