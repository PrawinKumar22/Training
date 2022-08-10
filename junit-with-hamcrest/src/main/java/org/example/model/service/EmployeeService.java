package org.example.model.service;

import org.example.model.Employee;

import org.example.model.ifaces.EmployeeRepository;

public class EmployeeService {

	private EmployeeRepository repo;

	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
		
	public Employee getById(int id) {
		
		return this.repo.getById(id).get();
		
	}
	
	public Employee deleteById(int id) {
		
		return this.repo.deleteById(id).get();
	}
}
