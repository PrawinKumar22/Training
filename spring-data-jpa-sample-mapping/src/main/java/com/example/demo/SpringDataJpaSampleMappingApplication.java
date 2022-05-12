package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;

import com.example.demo.services.DoctorService;

@SpringBootApplication
public class SpringDataJpaSampleMappingApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =
				
				SpringApplication.run(SpringDataJpaSampleMappingApplication.class, args);
		
		Doctor siva = ctx.getBean(Doctor.class);
		
		DoctorService service = ctx.getBean(DoctorService.class);
		
		//service.findAll().forEach(System.out::println);
		
		//System.out.println(service.findByDept("ent"));
		
		//System.out.println(service.findByDoctorName("Deva"));
		
		//System.out.println(service.findByDoctorNameAndDept("Siva","ent"));
		
		System.out.println(service.getByNameDept("Prakash","MBBS"));
		
//		Doctor added = service.add(siva);
//		
//		if(added!=null) {
//			
//			System.out.println("One Doctor Added");
//			
//		}
		
		ctx.close();
	}

	@Bean
	public Doctor siva() {
		
		return new Doctor(2020,"Siva","ent",8482832);
	}
}
