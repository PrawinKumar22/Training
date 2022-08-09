package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Seminar;

import com.example.demo.entity.Speaker;

import com.example.demo.utils.SeminarUtils;

@SpringBootApplication
public class SpringDataJpaOne2oneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
			
				SpringApplication.run(SpringDataJpaOne2oneApplication.class, args);
		
		SeminarUtils util = ctx.getBean(SeminarUtils.class);
		
		//util.add();
		
		util.findAll().forEach(System.out::println);
		
		ctx.close();
		
	}

	@Bean
	public Seminar rocky() {
		
		Seminar semi = new Seminar();
		
		semi.setId(101);
		
		semi.setName("Rocky");
		
		semi.setDuration(25);
		
		semi.setSpeaker(rajesh());
		
		return semi;
		
	}
	
	@Bean
	public Speaker rajesh() {
		
		return new Speaker(102,"Rajesh","IAS");
	}
	
}
