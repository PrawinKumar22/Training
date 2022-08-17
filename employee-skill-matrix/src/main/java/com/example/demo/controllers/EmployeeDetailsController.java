package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeDetails;

import com.example.demo.services.EmployeeDetailsService;

@RestController

@RequestMapping(path = "/api/v1/employee/details")
public class EmployeeDetailsController {

	private EmployeeDetailsService service;

	@Autowired
	public EmployeeDetailsController(EmployeeDetailsService service) {
		super();
		this.service = service;
	}

	@PostMapping(path = "/add")
	public EmployeeDetails add(@RequestBody EmployeeDetails entity) {
		
		return this.service.add(entity);
	}
	
	@GetMapping(path = "/findAll")
	public List<EmployeeDetails>findAll(){
		
		return this.service.findAll();
	}
	
	@GetMapping(path = "/empName/{byEmpName}")
	public EmployeeDetails findByEmpName(@PathVariable("byEmpName")String empName){
		
		return this.service.findByEmpName(empName);

	}
	
}