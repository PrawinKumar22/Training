package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.EmployeeDesignation;

import com.example.demo.ifaces.EmployeeDesignationRepository;

@Service
public class EmployeeDesignationService {

	private EmployeeDesignationRepository repo;

	@Autowired
	public EmployeeDesignationService(EmployeeDesignationRepository repo) {
		super();
		this.repo = repo;
	}
	

	public EmployeeDesignation add(EmployeeDesignation entity) {
		
		return this.repo.save(entity);
	}
	
	
}
