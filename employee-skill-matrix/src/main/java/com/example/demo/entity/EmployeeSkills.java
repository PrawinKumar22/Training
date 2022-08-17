package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "prawin_employee_skills")
public class EmployeeSkills {

	@Id
	@Column(name = "emp_skills_id")
	int empSkillsId;
	
	@Column(name = "emp_id")
	int empId;
	
	@Column(name = "skill_id")
	int skillId;
	
	@Column(name = "skill_name")
	String skillName;
	
	@Column(name = "skill_experience")
	int skillExperience;
	
	@Column(name = "status")
	String status;
	
	@Column(name = "approved_by")
	String approvedBy;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "approved_date")
	LocalDate approvedDate;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "created_date")
	LocalDate createdDate;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "modified_date")
	LocalDate modifiedDate;
	
}
