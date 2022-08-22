package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmployeeSkills;

public interface EmployeeSkillsRepository extends JpaRepository<EmployeeSkills,Integer> {

	List<EmployeeSkills> findBySkillName(String skillName);

	List<EmployeeSkills> findBySkillExperience(int skillExp);
	
	List<EmployeeSkills> findByApprovedBy(String approver);
	
	List<EmployeeSkills> findByStatus(String status);
	
//	EmployeeSkills addSkill(String skill); 
	
	
}
