package com.task.training;

public class BusinessAccount extends BankAccount {

	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		
		if(amount>1000000) {
			System.out.println("You can deposit upto 1000000");
		}
		else {
			double currentBalance = this.getMinimumBalance()+amount;
			setMinimumBalance(currentBalance);
		}
		
		return amount;
	}

	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		
		if(amount<25000) {
			System.out.println("You are required to maintain a minimum balance of 25000");
		}
		return amount;
	}

}
