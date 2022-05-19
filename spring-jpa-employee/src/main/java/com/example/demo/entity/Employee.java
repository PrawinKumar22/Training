package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "prawin_employee")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	@Column(name= "employee_id")
	int employeeId;
	
	@Column(name="employee_name")
	String employeeName;
	
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	LocalDate dateOfBirth;
	
	@Column(name="location")
	String location;
	
	@Column(name="skillset")
	String skillSet;
	
	long phoneNumber;
	

}
