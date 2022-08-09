package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;

import com.example.demo.entity.Patient;

import com.example.demo.utils.DoctorUtils;

@SpringBootApplication
public class SpringJpaOne2MannyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringJpaOne2MannyApplication.class, args);
		
		DoctorUtils util = ctx.getBean(DoctorUtils.class);
		
		//util.create();
		
		util.findAll();
		
		ctx.close();
	}

	@Bean
	public Doctor munna() {
		
		Doctor doctor = new Doctor();
		
		doctor.setDoctorId(101);
		
		doctor.setDoctorName("Munna");
		
		doctor.setPhoneNumber(985956321);
		
		doctor.setDepartment("ENT");
		
		return doctor;
	}
	
	@Bean
	public Patient ram() {
		
		return new Patient(201,"Ram",98665654);
	}
	
	@Bean
	public Patient ravi() {
		
		return new Patient(202,"Ravi",95451651);
		
	}
	
	@Bean
	public Patient rocky() {
		
		return new Patient(203,"Rocky",97894051);
	}
}
