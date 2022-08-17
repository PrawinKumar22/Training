package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserDetails;

import com.example.demo.services.UserDetailsService;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserDetailsController {

	private UserDetailsService service;

	@Autowired
	public UserDetailsController(UserDetailsService service) {
		super();
		this.service = service;
	}
	
//	@PostMapping(path = "/add")
//	public UserDetails add(UserDetails entity) {
//		
//		return this.service.add(entity);
//	}
}
