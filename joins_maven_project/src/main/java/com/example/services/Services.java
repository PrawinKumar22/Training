package com.example.services;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;

import java.util.Optional;

import com.example.entity.Customer;

import com.example.entity.LoanApplication;

import com.example.ifaces.Repository;


public class Services implements Repository<LoanApplication> {
	

	private Connection con;
	
	public Services(Connection con) {
		
		super();
		
		this.con= con;
	}

	@Override
	public int add(LoanApplication obj) {
		// TODO Auto-generated method stub
		
		 int rowAdded = 0;
		
		 
       //List<LoanApplication> loan = new ArrayList<LoanApplication>();
		
       String sqlcustomer = "insert into prawin_customer values(?,?,?,?)";
		
		String sqlloan = "insert into prawin_loan_application values(?,?,?)";
		
		
		
		
		  try(PreparedStatement pstmt = con.prepareStatement(sqlloan);
				 
				  PreparedStatement pstmt1 = con.prepareStatement(sqlcustomer)){
			 
			  pstmt1.setInt(1,obj.getCustomer().getCustomerId());
			  
			  pstmt1.setString(2,obj.getCustomer().getCustomerName());
			  
			  pstmt1.setLong(3,obj.getCustomer().getPhoneNumber());
			  
			  pstmt1.setDouble(4,obj.getCustomer().getCreditScore());
			  
			  
			  
			  
	          pstmt.setInt(1, obj.getApplicationNumber());
	        	 
	          pstmt.setInt(2,obj.getCustomer().getCustomerId());
	        	 
	          pstmt.setDouble(3,obj.getLoanAmount());
	        
	          pstmt1.executeUpdate();
	          rowAdded = pstmt.executeUpdate();
			
		  }
			  
		  
		  
		  catch(SQLException e) {
			  
			  e.printStackTrace();
		  }
		
		return rowAdded;
	}

	@Override
	public List<LoanApplication> findAll() {
		// TODO Auto-generated method stub
		
        List<LoanApplication> loan = new ArrayList<LoanApplication>();
		
		String sql = "select pc.customer_id,pc.customer_name,pc.phone_number,pc.credit_score,pl.application_number,pc.customer_name,pl.customer_ref,pl.loan_amount from prawin_loan_application pl, prawin_customer pc where pc.customer_id = pl.customer_ref and pc.customer_id =pl.customer_ref";
		
        try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			ResultSet rs =pstmt.executeQuery();
			
			while(rs.next()) {
				
				int applicationNumber = rs.getInt("application_number");
				
				String customerName = rs.getString("customer_name");
				
				int customerRef =rs.getInt("customer_ref");
				
				double loanAmount = rs.getDouble("loan_amount");
				
				int customerId = rs.getInt("customer_id");
				
				long phoneNumber = rs.getLong("phone_number");
				
				int creditScore = rs.getInt("credit_score");
				
				Customer customer = new Customer(customerId,customerName,phoneNumber,creditScore);
	
				LoanApplication loanapp = new LoanApplication(applicationNumber, customer, loanAmount); 
				
	      		loan.add(loanapp);
			}
		}
		
		catch(SQLException e) {
		
			e.printStackTrace();
			
		}
		
		return loan;
	}

	
	@Override
	public Optional<LoanApplication> findById(int id) {
		// TODO Auto-generated method stub
		
		Optional<LoanApplication> obj = Optional.empty();
		
    String sql = "select pc.customer_id,pc.customer_name,pc.phone_number,pc.credit_score,pl.application_number,pc.customer_name,pl.customer_ref,pl.loan_amount from prawin_loan_application pl, prawin_customer pc where pc.customer_id = pl.customer_ref and pc.customer_id =?";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			 pstmt.setInt(1,id);
			 
			 ResultSet rs =pstmt.executeQuery();
			 
			 if(rs.next()) {
				 
				 int applicationNumber = rs.getInt("application_number");
				 
				 int customerRef = rs.getInt("customer_ref");
				 
				 double loanAmount = rs.getDouble("loan_amount");
				 
				 int customerId = rs.getInt("customer_id");
				 
				 String customerName = rs.getString("customer_name");
					
				 long phoneNumber = rs.getLong("phone_number");
				 
				 int creditScore = rs.getInt("credit_score");
					
				 Customer customer = new Customer(customerId, customerName, phoneNumber, creditScore);
				 
				 LoanApplication loan = new LoanApplication(applicationNumber, customer, loanAmount);
				 
				 obj = Optional.of(loan);
			 }
				 
		}
		catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return obj;
	}
}
	