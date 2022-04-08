package com.task.training;

public abstract class BankAccount {
	
	public abstract double deposit(double amount);
	
	public abstract double withdraw(double amount);
	
	private double minimumBalance;
	
	private double deposit;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(double minimumBalance, double deposit) {
		super();
		this.minimumBalance = minimumBalance;
		this.deposit = deposit;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
		
}
