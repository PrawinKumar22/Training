package com.training.product;

import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product1 = new Product(101,"Good Day",10);
		
		Product product2 = new Product(102,"MilkBikkis",50);
		
		Product product3 = new Product(103,"Hide & Seek",60);
		
		Product product4 = new Product(104,"Jim Jam",80);
		
		Product product5 = new Product(101,"BourBon",20);
		
		Set<Product> products = new TreeSet<>();
		
		products.add(product1);
		
		products.add(product2);
		
		products.add(product3);
		
		products.add(product4);
		
		products.add(product5);
		
		ProductService productservice = new ProductService(products);
		
		System.out.println(productservice.getTopThree());

	}

}
