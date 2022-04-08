package com.task1;

public class Customer {
	private String customerName;
	public int customerId;
	private int customerAge;
	
	public Customer() {
		 super();
		 
	}
	

	public Customer(String customerName, int customerId, int customerAge) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerAge = customerAge;
	}
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

}
