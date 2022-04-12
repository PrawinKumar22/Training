package com.training.ifaces;

import java.util.*;

import com.training.model.Book;

public interface CrudRespository {
	
	public boolean add(Book book);
	
	public Book findById(int id);
	
	public boolean remove(Book book);
	
	public List<Book> findAll();
	
	public Book update(Book oldBook,Book newBook);
	
	
	
	
	

}
