package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;

import com.example.demo.repos.ProductRepository;


@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ConfigClientApplication {

	@Autowired
	private ProductRepository repo;
//	@Value("${customer.firstName}")
//	private String name;
//	
//	@GetMapping(path = "/names")
//	public String getName() {
//		
//		return this.name;
//		
//	}
	
	@GetMapping(path = "/products")
	public List<Product>findAll() {
		
		return this.repo.findAll();
		
	}
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
				SpringApplication.run(ConfigClientApplication.class, args);
		
//		ProductRepository repo = ctx.getBean(ProductRepository.class);
//		
//		repo.findAll().forEach(System.out::println);
	}

}
