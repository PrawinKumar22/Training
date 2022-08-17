package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeDesignation;

import com.example.demo.services.EmployeeDesignationService;

@RestController

@RequestMapping(path = "/api/v1/employee/designation")
public class EmployeeDesignationController {

	private EmployeeDesignationService service;

	@Autowired
	public EmployeeDesignationController(EmployeeDesignationService service) {
		super();
		this.service = service;
	}


	@PostMapping(path = "/add")
	public EmployeeDesignation add(@RequestBody EmployeeDesignation entity) {
		
		return this.service.add(entity);
	}
}
