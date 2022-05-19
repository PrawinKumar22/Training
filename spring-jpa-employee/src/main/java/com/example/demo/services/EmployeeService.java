package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Employee add(Employee emp) {
		
		return this.repo.save(emp);
		
	}
	public List<Employee>findAll(){
		
		return this.repo.findAll();
		
	}
	
	public List<Employee>findByDateOfBirth(LocalDate date){
		
		return this.repo.findByDateOfBirth(date);
		
	}
	
   public List<Employee>findByLocationAndSkillSet(String location, String skillSet){
		
		return this.repo.findByLocationAndSkillSet(location,skillSet);
	}
	
	public List<Employee>findBySkillSet(String skillSet){
		
		return this.repo.findBySkillSet(skillSet);
		
	}
	
	public List<Employee>getByEmployeesLocationAndSkill(String location,String skillSet){
		
		return this.repo.getByEmployeesLocationAndSkill(location, skillSet);
	}
}
