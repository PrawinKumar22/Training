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
import com.example.demo.entity.EmployeeSkills;
import com.example.demo.services.EmployeeDetailsService;
import com.example.demo.services.EmployeeSkillsService;

@RestController
@RequestMapping(path = "/api/v1/employee/skills")
public class EmployeeSkillsController {

	private EmployeeSkillsService service;

	@Autowired
	public EmployeeSkillsController(EmployeeSkillsService service) {
		super();
		this.service = service;
	}
	
	@PostMapping(path = "/add")
	public EmployeeSkills add(@RequestBody EmployeeSkills entity) {
		
		return this.service.add(entity);
	}
	
	@GetMapping(path = "/findAll")
	public List<EmployeeSkills>findAll(){
		
		return this.service.findAll();
	}
	
	@GetMapping(path = "/skillName/{bySkillName}")
	public List<EmployeeSkills>findBySkillName(@PathVariable("bySkillName")String skillName){
		
		return this.service.findBySkillName(skillName);
	}
	
	@GetMapping(path = "/skillExp/{bySkillExp}")
	public List<EmployeeSkills>findBySkillExperience(@PathVariable("bySkillExp")int skillExp){
		
		return this.service.findBySkillExperience(skillExp);
	}
	
	@GetMapping(path = "/approvedBy/{approver}")
	public List<EmployeeSkills>findByApprover(@PathVariable("approver")String approver){
		
		return this.service.findByApprover(approver);
	}
	
	@GetMapping(path = "/status/{status}")
	public List<EmployeeSkills>findByStatus(@PathVariable("status")String status){
		
		return this.service.findByStatus(status);
	}
	
	@GetMapping(path = "/empName/{byEmpName}")
	public EmployeeSkills findByEmpName(@PathVariable("byEmpName")String empName){
		
		return this.service.findByEmpName(empName);
	}
}
