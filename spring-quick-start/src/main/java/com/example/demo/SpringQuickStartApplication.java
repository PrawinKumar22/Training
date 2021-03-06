package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Primary;

import org.training.model.Author;

import org.training.model.Book;

import com.example.demo.model1.Bill;

import com.example.demo.model1.CustomerList;

import com.example.demo.model1.Invoice;

import com.example.demo.model1.Teacher;

@SpringBootApplication
@ComponentScan(basePackages= {"org.training","com.example"})
public class SpringQuickStartApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx =SpringApplication
				
				.run(SpringQuickStartApplication.class, args);
		
		System.out.println(ctx.getBean(Book.class));
		
		System.out.println("Author:"+ctx.getBean(Author.class));
		
	    Invoice inv = ctx.getBean(Invoice.class);
		
		System.out.println(inv);
		
		Bill bill = ctx.getBean(Bill.class);
			
			System.out.println("Customer:"+bill.getCustomer());
			
			System.out.println("Product:"+bill.getProduct());
			
			CustomerList list = ctx.getBean(CustomerList.class);
			
			list.getCustList().forEach(System.out::println);
			
		
	}
	
	@Bean
	public Author hari() {
		
		return new Author(101,"Harish Kumar");
		
	}
	
	@Bean
	@Primary
	public Author mani() {
		
		return new Author(102,"Mani");
		
	}
	
	public static void method () {
		
       //System.out.println(ctx.getBean("ram"));
		
		//System.out.println(ctx.getBean("teacher"));
//		
		//Method:1
		
		//casting not required but there should be only one bean of that type will throw Exception
		
//		Teacher stella = ctx.getBean(Teacher.class);
//		
//		stella.setId(494);
//		
//		stella.setName("Stella Sundari");
//		
//		stella.setSubject("Fluid Mech");
//		
//		System.out.println(stella);
		
		//Method:2
		
		//when using Id need to cast to specific Bean since return type of getBean() is obj
		
		//Teacher harish = (Teacher) ctx.getBean("harish");
		
		//System.out.println(harish);
		
		//Method:3
		
		//when more than One Bean of the same Type available should use id and class name
		
//		Teacher harish2 = ctx.getBean("harish",Teacher.class);
//		
//		System.out.println(harish2);
	}

}
