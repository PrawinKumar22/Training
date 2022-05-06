package com.training;

import java.util.Arrays;

import java.util.Comparator;

import java.util.List;

import java.util.Map;

import java.util.Optional;

import java.util.Set;

import com.training.model.Book;

import static java.util.stream.Collectors.*;


public class UsingStreams {
	
	public static void useDistinct(List<Book> bookList) {
		
		bookList.stream().distinct().forEach(System.out::println);
		
		
	}
	
	public static void collectToSet(List<Book>bookList) {
		
	Set<Book>bookSet = bookList.stream().filter(e -> e.getPrice()>500).collect(toSet());
		
		bookSet.forEach(System.out::println);
	}
	
	public static void collectMap(List<Book>bookList) {
		
		// To avoid duplicate either use distinct or set//
		
		//Set<Book> bookSet = bookList.stream().collect(toSet());
		
		Map<String,Double> values = bookList.stream().filter(e -> e.getPrice()>500).distinct()
				
				.collect(toMap(Book::getBookName,Book::getPrice));
		
		values.forEach((key,value)->System.out.println(key + ":"+ value));
	}
	
	public static void findMaxPrice(List<Book>bookList) {
		
		Optional<Book> optional = bookList.stream()
				
				.max(Comparator.comparing(Book::getPrice));
		
		
		if(optional.isPresent()) {
			
			System.out.println("Maximum Price:"+ optional.get().getPrice());
			
		}
		
	}
	
	public static void findMinPrice(List<Book>bookList) {
		
		Optional<Book> optional = bookList.stream().min(Comparator.comparing(Book::getPrice));
		
		if(optional.isPresent()) {
			
			System.out.println("Minimum Price:"+ optional.get().getPrice());
			
		}
		
	}
	
	public static void findBookNameHasv(List<Book>bookList) {
		
	long book= 	bookList.stream().filter(e -> e.getBookName().contains("v")).count();
		
		System.out.println("Book Name Has V :"+ book);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Book java = new Book(101,"Java","Suba",450);
		
		Book spring = new Book(102,"Spring","Prawin",650);
		
		Book maven = new Book(103,"Maven","Kawin",550);
		
		Book html = new Book(104,"Html","Venki",1450);
		
		Book python = new Book(105,"Python","Gokul",50);
		
		Book mavenNew = new Book(103,"Maven","Kawin",550);
		
		Book htmlNew = new Book(104,"Html","Venki",1450);
		
		
		List<Book> bookList = Arrays.asList(java,spring,maven,html,python,mavenNew,htmlNew);
		
		useDistinct(bookList);
		
		System.out.println("++++++++++++++++++++++++++");
		
		collectToSet(bookList);
		
		System.out.println("==========================");
		
		collectMap(bookList);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
		
		findMaxPrice(bookList);
		
		System.out.println("!=!=!=!=!=!=!=!=!=");
		
		findMinPrice(bookList);
		
		System.out.println("########################");
		
		findBookNameHasv(bookList);
		
	}

}
