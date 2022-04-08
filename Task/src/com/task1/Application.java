package com.task1;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		Customer customer = new Customer();
		
		System.out.println("Enter Customer Name:");
		
		String customerName = sc.next();
		
		System.out.println("Enter Customer Id:");
		
		int customerId= sc.nextInt();
		
		System.out.println("Enter Customer Age:");
		
		int customerAge = sc.nextInt();
		
		customer.setCustomerName(customerName);
		
		System.out.println("Customer Name:"+customer.getCustomerName());
		
		customer.setCustomerId(customerId);
		
		System.out.println("Customer Id:"+customer.getCustomerId());
		
		customer.setCustomerAge(customerAge);
		
		System.out.println("Customer Age:"+customer.getCustomerAge());
		
		sc.close();
	}

}
