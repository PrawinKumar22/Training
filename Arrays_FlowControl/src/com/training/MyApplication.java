package com.training;
 
import com.training.services.BankAccountService;

import com.training.model.BankAccount;

import java.util.*;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		BankAccountService service= new BankAccountService();
		
		int limit;

		System.out.println("Enter the limit:");
		
	    limit= sc.nextInt();
		
	    BankAccount[] list = new BankAccount[limit ];
		int num ;
	    int i=0;
		
		do {
			
			//BankAccount account = new BankAccount();
			
			
			System.out.println("Enter Account Number:");
			
			int accountNumber = sc.nextInt();
			
			System.out.println("Enter Holder Name:");
			
			String accountHolderName = sc.next();
			
			System.out.println("Enter Account Type:");
			
			String accountType = sc.next();
			
			System.out.println("Enter Balance:");
			
			double balance = sc.nextDouble();
			
			BankAccount account = new BankAccount(accountNumber,accountHolderName,balance,accountType);
			
			list[i] = account;
			i++;
			System.out.println("Enter 1 to continue or 0 to exit" );
			num = sc.nextInt();
			
		}while(num==1);
		
		double[] values = service.findInterestByAccountType(list);
		
		for(double eachValue:values) {
			System.out.println(eachValue);
			
		}
              sc.close();
	}

}

