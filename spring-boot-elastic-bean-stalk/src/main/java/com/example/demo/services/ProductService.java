package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ifaces.ProductRepositorty;
import com.example.demo.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepositorty repo;
	
	public Product add(Product entity) {
			
			return this.repo.save(entity);

	}
	
	public List<Product> findAll() {
		
		return this.repo.findAll();
	}

}
