package com.example;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import com.example.dao.MemberRepository;
import com.example.demo.services.Invoice;
import com.example.demo.services.ProductService;
import com.example.entity.Member;
import com.example.entity.Product;
import com.example.utils.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void member() {
		
        Connection con;
		
		//con = ConnectionFactory.getOracleConnection();
		
		con =ConnectionFactory.getPostgressConnection();
		  
		  System.out.println(con);
		  
//		  MemberRepository member = new MemberRepository(con);
//		  
//		  member.findAll().forEach(System.out::println);
//		
//		  Member toAdd = new Member(1051,"Rajesh","AnnaNagar",LocalDate.of(2000, 05, 5),
//				 
//				  "Quarterly",200.0,5,100.0);
//		  
//		  System.out.println("Rows Added:"+ toAdd);
		
	}
	
//	public static void product() {
//		
//		Connection con =ConnectionFactory.getPostgressConnection();
//		
//		ProductService service = new ProductService(con);
//		
//		Product toAdd = new Product(949,"UPS",17470.00);
//		
//		int rowAdded = service.addProduct(toAdd);
//
//	    System.out.println("Row Added: "+ rowAdded);
//	    
//	}
    public static void main( String[] args )
   
    {
      
    	Connection con;
		
		con = ConnectionFactory.getOracleConnection();
		
		//con =ConnectionFactory.getPostgressConnection();
		  
		  //System.out.println(con);
		  
		  //MemberRepository member = new MemberRepository(con);
		  
	      // member.findAll().forEach(System.out::println);
	
//		  Member toAdd = new Member(251,"Rajesh","AnnaNagar",LocalDate.of(2000, 05, 5),
//			 
//				  "quarterly",200.0,5,100.0);
//
//		  int rowAdded = member.add(toAdd);
//		  
//	      member.findAll().forEach(System.out::println);
//
// 	      System.out.println("Rows Added:"+ rowAdded);
		
		 // product();
 	      
 	      ProductService service = new ProductService(con);
 	      
 	     Product kathli =new Product(401,"Kajukathli",200);
 	      
 	      Product jamun = new Product(402,"GulabJamun",100);
 	      
		  
 	      Invoice invoice= new Invoice(181, "AAA",5,902);
 	      
		service.usingTxn(kathli,jamun,invoice);
		
    }
}
