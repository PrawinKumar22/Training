package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CreditCard;

import com.example.demo.services.CreditCardService;

@RestController
@RequestMapping("/api/v1")
public class CreditCardController {

	@Autowired
	private CreditCardService service;
	
	@GetMapping(path = "/srch/creditcards")
      public List<CreditCard>findAll(){
		
		return this.service.getAll();
		
	}
      
	@GetMapping(path = "/creditcards/{id}")
    public CreditCard findById(@PathVariable("id") long id){
		
		return this.service.getById(id);
		
	}
	
	@PostMapping(path = "/creditcards")
	public ResponseEntity<CreditCard> add(@RequestBody CreditCard entity){
		
		CreditCard card=this.service.addCard(entity);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(card);
	}
	
	@DeleteMapping(path = "/creditcards")
	public ResponseEntity<String> remove(@RequestBody CreditCard entity){
		
	  this.service.removeCard(entity);
		
		return ResponseEntity.status(HttpStatus.OK).body("One Row Deleted");
	}
}
