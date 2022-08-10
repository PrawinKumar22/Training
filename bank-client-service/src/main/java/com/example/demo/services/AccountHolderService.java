package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.AccountHolder;

import com.example.demo.ifaces.AccountHolderRepository;

@Service
public class AccountHolderService {

	private AccountHolderRepository repo;

	@Autowired
	public AccountHolderService(AccountHolderRepository repo) {
		super();
		this.repo = repo;
	}
	
	public AccountHolder save(AccountHolder entity) {
		
		return repo.save(entity);
	}
	
	public List<AccountHolder> findAll() {
		
		return repo.findAll();
	}
	
	public AccountHolder findByAccountNumber(long accountNumber) {
		
		return repo.findByAccountNumber(accountNumber);
	}
	
	public double viewBalance(long accountNumber) {
		
		AccountHolder account = findByAccountNumber(accountNumber);
		
		double balance = account.getBalance();
		
		return balance;
		
	}
	
	public Object balanceAfterTransaction(double amount,
			
			long account1,long account2) {
		
		AccountHolder acc1= findByAccountNumber(account1);
		
		AccountHolder acc2= findByAccountNumber(account2);
		
		double amount1 = 0.0;
		
		double amount2=0.0;
		
		if(acc1.getBalance()>=amount) {
			
			amount2 = acc2.getBalance()+amount;
			
		     acc2.setBalance(amount2);
		     
		     repo.balanceAfterTransaction(amount2, account2);
		     
		     amount1 = acc1.getBalance()-amount;
		     
		     acc1.setBalance(amount1);
		     
		     repo.balanceAfterTransaction1(amount1, account1);
		}
		
		else {
		
			return "No available balance";
		}
		
	    return acc1.getBalance();
				
	}
}
