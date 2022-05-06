package com.example.demo.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.example.demo.model1.Customer;
import com.example.demo.model1.Product;
import com.example.demo.model1.Student;
import com.example.demo.model1.Teacher;

@Configuration
public class AppConfig {

	// Id of the bean is same as the method name 
	@Bean
	public Student ram() {
		
		return new Student(101,"Ramesh",98);
		
	}
	@Bean
    public Teacher harish() {
		
		return new Teacher(101,"Harish","CSE");
		
	}
	
	@Bean
	public Product tv() {
		
		return new Product(101,"Sony TV");
	}
	
	@Bean
	public Customer suresh() {
		
		return new Customer(201,"Suresh");
	}
	
	@Bean
	public Customer ramesh() {
		
		return new Customer(202,"Ramesh");
	}
	
	@Bean
	public Customer ravi() {
		
		return new Customer(203,"Ravi");
	}
}
