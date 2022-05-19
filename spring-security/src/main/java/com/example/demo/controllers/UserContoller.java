package com.example.demo.controllers;

import java.security.Principal;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class UserContoller {
	
//	@GetMapping(path="/user")
//	public String getUser(Principal principal) {
//		
//		System.out.println("USer :" + principal.getName());
//		System.out.println(principal.toString());
//		
//		return "User Umamaheswari";
//	}

	@GetMapping(path = "/user")
	@RolesAllowed(value = {"ROLE_ADMIN"})
	public String getUser() {
		
		return "User Umamaheswari";
		
	}
	
	@GetMapping(path = "/user/{id}")
	@RolesAllowed(value = {"ROLE_ADMIN","ROLE_GUEST"})
	public String getUserById(@PathVariable int id) {
		
		if(id==1) {
			
			return "User Umamaheshwari";
			
		}else {
		
			return "Manager Magesh";
			
		}
		
	}
}
