package com.task.training;

public class SavingsAccount extends BankAccount {
	
	

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(double minimumBalance, double deposit) {
		super(minimumBalance, deposit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>100000) {
			System.out.println("You can deposit upto 100000");
		}
		return amount;
	}

	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		
		if(amount<5000) {
			System.out.println("You are required to maintain a minimum balance of 5000");
		}
		return amount;
	}

}
