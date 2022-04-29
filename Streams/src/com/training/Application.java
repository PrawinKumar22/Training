package com.training;

import java.util.List;

import com.training.services.BookService;

import com.training.ifaces.CrudRespository;

import com.training.model.Book;

public class Application {	
	
	public static void print(List<Book> args) {
		
		for(Book eachBook: args)
		
			System.out.println(eachBook);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book java = new Book(101,"Java","Suba",450);
		
		Book spring = new Book(102,"Spring","Prawin",650);
		
		Book maven = new Book(103,"Maven","Kawin",550);
		
		Book html = new Book(104,"Html","Venki",1450);
		
		Book python = new Book(105,"Python","Gokul",50);
		
		CrudRespository service = new BookService();
						
		System.out.println(service.add(java));
		
		//service.add(java);
		
		service.add(spring);
		
		service.add(maven);
		
		service.add(html);
		
		service.add(python);
		
		List<Book>bookList2 = ((BookService)service).getBooksGrtThan(600);

		
        System.out.println("++++++++++++++++++++++++");
		
		bookList2.forEach(System.out::println);
		
		System.out.println("++++++++++++++++++++++++");
		
		List<Book> bookList = service.findAll();
		
		for(Book eachBook:bookList) {
			
			System.out.println(eachBook);
				
		}
		
		Book foundBook = service.findById(101);
		
		System.out.println("FoundBook:"+foundBook);
		
		//service.remove(python);
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Size of ArrayList:"+service.findAll().size());
		
		List<Book> bookList1 = service.findAll();
		
		print(service.findAll());
		
		Book react = new Book(205,"ReactJS","Rahul",6850);
		
		Book reactNew =new Book(205,"ReactJS","Rahul",6850);
		

		//service.update(react);
		
		System.out.println("====AFTER UPDATE=====");
		
		service.update(react, reactNew);
		
		print(service.findAll());
		
		System.out.println();
		
		System.out.println("Greter Than");
		
		List<Book> bookList3 =((BookService)service).getBooksGrtThan(800);
		
		bookList.forEach(System.out::println);
		
		System.out.println("Using Streams");
		
		((BookService)service).findBooksGrtThan(1000).forEach(System.out::println);
		
		List<String> nameList = ((BookService)service).getBookNames();
		
		nameList.forEach(System.out::println);
		
		System.out.println("=>=>=>=>=>=>=>=>=>");
		
		
        List<String> grtThan900 = ((BookService)service).getBookNameGrtThanPrice(900);
		
		grtThan900.forEach(System.out::println);
		
		
		System.out.println("Sorted By Name");
		
        List<Book> sortedByName = ((BookService)service).sortedByName();
		
		sortedByName.forEach(System.out::println);
		
		System.out.println("Sorted By DescNumber");
		
		 List<Book> sortedByNumberDesc = ((BookService)service).sortedByNumberDesc();
			
		 sortedByNumberDesc.forEach(System.out::println);
			
		
		
		
		
		
	}

}
