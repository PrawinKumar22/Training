package com.example.demo.services;

import java.sql.*;

import java.util.*;

import com.example.entity.*;

public class ProductService {

	private Connection con;

	public ProductService(Connection con) {
		
		super();
		
		this.con = con;
	}
	
	public int updatePriceByName(String productName, double newPrice) {
		
		int rowsUpdated = 0;
		
		String sql = "update prawin_product set price = ? where product_name = ?";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			
			pstmt.setDouble(1,newPrice);

			pstmt.setString(2,productName);
			
			rowsUpdated = pstmt.executeUpdate();

		}
		
		catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return rowsUpdated;
		
	}
	
	public int deleteById(int id) {
		
		int rowsDeleted = 0;
		
		String sql = "delete from prawin_product where product_id = ?";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1,id);
			
			rowsDeleted = pstmt.executeUpdate();
			
		}
		
		catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return rowsDeleted;
		
	}
	
	public Optional<Product>findById(int id){
		
		Optional<Product> obj = Optional.empty();
		
		String sql = "select * from prawin_product where product_id=?";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			 pstmt.setInt(1,id);
			 
			 ResultSet rs =pstmt.executeQuery();
			 
			 if(rs.next()) {
				 
				 int productId = rs.getInt("product_id");
				 
				 String productName = rs.getString("product_name");
					
				 double price = rs.getDouble("price");
					
				Product prod = new Product(productId, productName, price);
				
				obj = Optional.of(prod); 
			 }
			 
		}
		
		catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return obj;
	}
	
	public int addProduct(Product product) {
		
		int rowAdded = 0;
		
		String sql = "insert into prawin_product values(?,?,?)";
		
         try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
        	 pstmt.setInt(1, product.getProductId());
        	 
        	 pstmt.setString(2,product.getProductName());
        	 
        	 pstmt.setDouble(3,product.getPrice());
        	 
        	 rowAdded = pstmt.executeUpdate();
        		
			}
         
         catch(SQLException e) {
        	 
        	 e.printStackTrace();
         }
         
         return rowAdded;
		
	}
	
	public List<Product> findAll(){
	
		List<Product> productList = new ArrayList<Product>();
		
		String sql = "select * from prawin_product";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			ResultSet rs =pstmt.executeQuery();
			
			while(rs.next()) {
				
				int productId = rs.getInt("product_id");
				
				String productName = rs.getString("product_name");
				
				double price = rs.getDouble("price");
				
				Product prod = new Product(productId, productName, price);
				
				productList.add(prod);
				
			}
		}
		
		catch(SQLException e) {
		
			e.printStackTrace();
			
		}
		
		return productList;
	}
	
	public void usingTxn(Product prd1, Product prd2,Invoice invoice ) {
		
		String sql = "insert into prawin_product values(?,?,?)";
		
		String invoicesql ="insert into prawininvoice values(?,?,?,?)";
		
		try(PreparedStatement productstmt = con.prepareStatement(sql);
			
		PreparedStatement invoicestmt = con.prepareStatement(invoicesql)){
			
			con.setAutoCommit(false);
			
//			productstmt.setInt(1,prd1.getProductId());
//			
//			productstmt.setString(2,prd1.getProductName());
//			
//			productstmt.setDouble(3,prd1.getPrice());
//			
//			int rowAdded = productstmt.executeUpdate();
			
			invoicestmt.setInt(1,invoice.getInvoiceNumber());
			
			invoicestmt.setString(2,invoice.getCustomerName());

			invoicestmt.setInt(3,invoice.getQuantity());
			
			invoicestmt.setInt(4,invoice.getProductRef());
			
			int rowAdded3=invoicestmt.executeUpdate(); 
			
			con.commit();
//					
//			productstmt.setInt(1,prd2.getProductId());
//			
//			productstmt.setString(2,prd2.getProductName());
//			
//			productstmt.setDouble(3,prd2.getPrice());
//			
//			int rowAdded2 = productstmt.executeUpdate();
//			
//			if(prd2.getPrice()>prd1.getPrice()) {
//			
//				con.commit();
//				
//			}
//			
//			else {
//				
//				con.rollback();
//				
//			}
//			
//			
//			System.out.println("RowAdded:"+rowAdded2);
//			
	}
		
	catch(SQLException e) {
		
			e.printStackTrace();
			
			try 
			
			{
				con.rollback();
				
			} 
			
			catch (SQLException e1) 
			{
				// TODO Auto-generated catch block
				
				e1.printStackTrace();
			}
		}
		
   }
	
}
