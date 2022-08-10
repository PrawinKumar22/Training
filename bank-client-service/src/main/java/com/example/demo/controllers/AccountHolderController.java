package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AccountHolder;

import com.example.demo.services.AccountHolderService;

@RestController
@RequestMapping(path = "/api/v1/accounts")
public class AccountHolderController {
	
	private AccountHolderService service;

	@Autowired
	public AccountHolderController(AccountHolderService service) {
		super();
		this.service = service;
	}
	
	@PostMapping(path = "/add")
	public AccountHolder add(@RequestBody AccountHolder entity) {
		
		return this.service.save(entity);
	}
	
	@GetMapping
	public List<AccountHolder> findAll() {
		
		return this.service.findAll();
	}
	
	@GetMapping(path = "/srch/{accountNumber}")
	public AccountHolder findByAccountNumber(@PathVariable("accountNumber")long id) {
		
		return this.service.findByAccountNumber(id);
	}
	
	@GetMapping(path = "/balance/{accountNumber}")
	public double viewBalance(@PathVariable("accountNumber")long accountNumber) {
		
		return this.service.viewBalance(accountNumber);
	}
	
	@PutMapping(path = "/transfer/{accountNumber1}/{accountNumber2}/{amount}")
	public Object transferAmount(@PathVariable("accountNumber1")long accountNumber1,
			@PathVariable("accountNumber2")long accountNumber2,@PathVariable("amount")double amount) {
		
		return this.service.balanceAfterTransaction(amount, accountNumber1, accountNumber2);
	}
	
	
}
