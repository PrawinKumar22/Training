package com.training;

public class Customer {

	private int customerId;
	
	private String customerName;
	
	private int phoneNumber;
	
	private String email;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName, int phoneNumber, String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		this.email = email;
	}
	
	public void checkEmailId() throws Exception{
		
		if(email.contains("@") || email.contains(".com")||email.contains(".org")) {
			
			System.out.println("Valid EmailId");
			
		}
		else {
		         throw new InvalidEmailException("Invalid EmailId");
		}
	}
}
