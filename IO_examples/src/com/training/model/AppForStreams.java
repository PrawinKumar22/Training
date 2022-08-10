package com.training.model;

import java.io.File;

import com.training.services.BookService;

public class AppForStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book(8847,"Oracle","Harish",560);
		
		BookService service = new BookService();
		
		File file = new File("book.ser");
		
		int ch =8;
		
		if(ch==1) {
			
		Book book1 = new Book(8847,"Oracle","Harish",560);
			
		
		boolean result = service.writeToStream(file,book);
		
		if(result) {
			
			System.out.println("One Record Serialized");
			
			
		}}
		
		else
		{
			
			Book fromFile = (Book)service.readFromStream(file);
			
			System.out.println(fromFile);
			
		}
		
	}

}
