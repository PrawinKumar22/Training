package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;

import com.example.demo.repos.AddressRepository;

@Service
public class AddressServices {

	@Autowired
	private AddressRepository repo;
	
	public void task1() {
		
		List<Address> addressList = repo.findAll();
		
		for(Address eachAddress: addressList) {
			
			System.out.println(eachAddress.getTitle());
			
			System.out.println(eachAddress.getUser());
			
			System.out.println(eachAddress.getCity());
		}
			
	}
	
     public void task2() {
		
		List<Address> addressList = repo.findAll();
		
		for(Address eachAddress: addressList) {
			
			System.out.println(eachAddress.getTitle());
			
			System.out.println(eachAddress.getUser());
			
			System.out.println(eachAddress.getCity());
		}
			
	}
     
     public void task4() {
 		
 		List<Address> addressList = repo.findAll();
 		
 		for(Address eachAddress: addressList) {
 			
 			System.out.println(eachAddress.getTitle());
 			
 			System.out.println(eachAddress.getUser());
 			
 		}
 			
 	}
}
