package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.EmployeeDetails;

import com.example.demo.ifaces.EmployeeDetailsRepository;

@Service
public class EmployeeDetailsService {

	private EmployeeDetailsRepository repo;

	@Autowired
	public EmployeeDetailsService(EmployeeDetailsRepository repo) {
		super();
		this.repo = repo;
	}
	

	public EmployeeDetails add(@RequestBody EmployeeDetails entity) {
		
		return this.repo.save(entity);
	}


	public List<EmployeeDetails> findAll() {
		
		return this.repo.findAll();
	}
	
	public EmployeeDetails findByEmpName(String empName){
		
		return this.repo.findByEmpName(empName);
		
	}
	
}
