package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.bidirectional.Patient;

@SpringBootApplication
public class SpringDataJpaOne2ManyBidirectionApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=
				
				SpringApplication.run(SpringDataJpaOne2ManyBidirectionApplication.class, args);
	}

//	@Bean
//	 public Patient reva() {
//		
//		  return new Patient(101, "revathy", 216565l);
//		   
//	   }
//	@Bean
//	public Patient geetha() {
//		return new Patient(102, "geetha", 1545445454l);
//	}
}
