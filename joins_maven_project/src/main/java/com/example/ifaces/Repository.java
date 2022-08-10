package com.example.ifaces;

import java.util.List;

import java.util.Optional;

public interface Repository <T> {

	public int add(T obj);
	
	public List<T>findAll();
	
	public Optional<T> findById(int id);
	
	
}
