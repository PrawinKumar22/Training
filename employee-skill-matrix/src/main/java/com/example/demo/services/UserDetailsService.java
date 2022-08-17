package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserDetails;

import com.example.demo.ifaces.UserDetailsRepository;

@Service
public class UserDetailsService {
	
	private UserDetailsRepository repo;

	@Autowired
	public UserDetailsService(UserDetailsRepository repo) {
		super();
		this.repo = repo;
	}
	
//	public UserDetails add(UserDetails entity) {
//		
//		return this.repo.save(entity);
//	}

}
