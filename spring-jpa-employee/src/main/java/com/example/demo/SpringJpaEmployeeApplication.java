package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;

import com.example.demo.services.EmployeeService;

@SpringBootApplication
public class SpringJpaEmployeeApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =
				 
				SpringApplication.run(SpringJpaEmployeeApplication.class, args);
		
		//Employee siva = ctx.getBean(Employee.class);
		
		EmployeeService service = ctx.getBean(EmployeeService.class);
		
		//service.findAll().forEach(System.out::println);
		
		//service.findByDateOfBirth(LocalDate.of(2000,01,10)).forEach(System.out::println);
		
		service.findByLocationAndSkillSet("Chennai","JAVA")
		
		.forEach(System.out::println);
//		
//		service.getByEmployeesLocationAndSkill("Kovai","JAVA").forEach(System.out::println);
			
//		Employee added = service.add(siva);
//		
//		if(added!=null) {
//			
//			System.out.println("One Employee Added");
//			
//		}
		
		ctx.close();
	}

//	@Bean
//	public Employee siva() {
//		
//		return new Employee(101,"Siva",LocalDate.of(2000,01,10),"Chennai","JAVA",9855185);
//	}
}
