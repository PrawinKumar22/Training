package com.example.demo;

import java.sql.*;

import java.util.Optional;

import com.example.demo.services.ProductService;

import com.example.entity.Product;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con;
		
		try 
		{
			con = DriverManager
					
					.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			
			ProductService service = new ProductService(con);
			
			Product toAdd = new Product(949,"UPS",17470.00);
			
//			int rowAdded = service.addProduct(toAdd);
//			
//			System.out.println("Row Added: "+ rowAdded);
//			
			System.out.println("RowsDeleted:"+ service.deleteById(949));
			
			service.findAll().forEach(System.out::println);
			
			System.out.println("=============================");
			
			Optional<Product> product = service.findById(108);
			
			if(product.isPresent()) {
				
				System.out.println("Found ID:"+product.get());
				
			}
			
			else 
			{
				System.out.println("The product with given ID is not present");
			
			}
			
		System.out.println("Rows Updated:" +service.updatePriceByName("laptop",27500));

			
		}
		
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
		
	}

}
