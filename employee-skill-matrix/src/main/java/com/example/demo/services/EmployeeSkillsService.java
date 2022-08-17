package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDetails;

import com.example.demo.entity.EmployeeSkills;

import com.example.demo.ifaces.EmployeeSkillsRepository;

@Service
public class EmployeeSkillsService {

	private EmployeeSkillsRepository repo;

	@Autowired
	public EmployeeSkillsService(EmployeeSkillsRepository repo) {
		super();
		this.repo = repo;
	}
	
    @Autowired
    public EmployeeDetailsService service;

    public EmployeeSkills add(EmployeeSkills entity) {
		
		return this.repo.save(entity);
		
	}
   
	public List<EmployeeSkills>findAll(){
		
		return this.repo.findAll();
		
	}
	
	public List<EmployeeSkills>findBySkillName(String skillName){
		
		return this.repo.findBySkillName(skillName);
	}
	
	public List<EmployeeSkills>findBySkillExperience(int skillExp){
		
		return this.repo.findBySkillExperience(skillExp);
		
	}
	
    public List<EmployeeSkills>findByApprover(String approver){
		
		return this.repo.findByApprovedBy(approver);
		
	}

	public List<EmployeeSkills> findByStatus(String status) {
		
		return this.repo.findByStatus(status);
		
	}
	
    public EmployeeSkills findByEmpName(String name){
		
		List<EmployeeSkills> empSkill= repo.findAll();
		
	EmployeeDetails details =  service.findByEmpName(name);
	
	for (EmployeeSkills employeeSkill : empSkill) {
		
		if(employeeSkill.getEmpId()== details.getEmpId()) {
			
			return employeeSkill;
		}
	
	}
	
	return null;
	
	}
	
//    public EmployeeSkills addSkill(String addSkill) {
//		
//		return this.repo.addSkill(addSkill);
//		
//	}
}
