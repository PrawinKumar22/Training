package com.training;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

import com.training.ifaces.BookService;

import com.training.ifaces.CrudRespository;

import com.training.model.Book;

import com.training.utils.BookNameComparator;

public class App {

public static void print(List<Book> args) {
		
		for(Book eachBook: args)
		
			System.out.println(eachBook);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<>();
		
		names.add("Ramesh");
		
		names.add("Anand");
		
		names.add("Chandru");
		
		names.add("Zahir");
		
		names.add("Pavan");
		
		System.out.println(names);
		
		Collections.sort(names);
		
		System.out.println(names);
	
        Book java = new Book(101,"Java","Suba",450);
		
		Book spring = new Book(102,"Spring","Prawin",650);
		
		Book maven = new Book(103,"Maven","Kawin",550);
		
		Book html = new Book(104,"Html","Venki",1450);
		
		Book python = new Book(105,"Python","Gokul",850);
		
		CrudRespository service = new BookService();
		
		System.out.println(service.add(java));
		
		service.add(java);
		
		System.out.println(service.add(spring));
		
		service.add(maven);
		
		service.add(html);
		
		service.add(python);
		
		List<Book> bookList = service.findAll();
		
		Collections.sort(bookList);
		
		print(bookList);
		
				
		//print(bookList);
		
		BookNameComparator book = new BookNameComparator();
		
		Collections.sort(bookList,book);
		
		System.out.println("++++++");
		
		System.out.println("Sort By Book Name:");
		
		print(bookList);
		
		
	}

}
