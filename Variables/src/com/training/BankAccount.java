package com.training;

public class BankAccount {
	private static int count;
	private String accountHolderName;//instance variable
	private double balance;//instance variable
	private int accountNumber;
	public int getAccountNumber() {
		
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public static int getCount() { //static method
		
		return ++count;
		
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankAccount(String accountHolderName, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountNumber=getCount();
	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getUpdatedBalance(double amount) {//parameter variable
		
		double updatedBalance;//local variable
		double currentBalance=0;
		
		//System.out.println(updatedBalance);
		
		this.balance=this.balance+amount;
		
		//this.balance=currentBalance;
		
		return this.balance;
		//return currentBalance;
		
	}

}
