package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Product;

import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		
     ApplicationContext ctx =SpringApplication
				.run(SpringJdbcApplication.class, args);
		
     ProductRepository repo = ctx.getBean(ProductRepository.class);
     
     Product tv = ctx.getBean(Product.class);
     
    // System.out.println("RoWAdded:"+repo.add(tv));

     repo.findAll().forEach(System.out::println);
     
    // System.out.println("Found ID:"+repo.findById(202));
     
    // System.out.println("Updated:"+repo.update(tv));
     
     //System.out.println("Deleted:"+repo.remove(202));
     
     
	}

	@Bean
	public Product tv() {
		
		return new Product(202,"Panasonic Tv",23400);
	}
}
