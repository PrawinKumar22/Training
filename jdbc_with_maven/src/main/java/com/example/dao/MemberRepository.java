package com.example.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.time.LocalDate;

import com.example.entity.*;

import java.util.ArrayList;

import java.util.List;

import com.example.ifaces.CrudRepository;

public class MemberRepository implements CrudRepository<Member> {
	
	private Connection con;

	public MemberRepository(Connection con) {
		super();
		this.con = con;
	}

	public int add(Member obj) {
		// TODO Auto-generated method stub
		
		int rowAdded = 0;
		
		String sql = "insert into prawinmember values(?,?,?,?,?,?,?,?)";
		
		 try(PreparedStatement pstmt = con.prepareStatement(sql)){
			 
             pstmt.setInt(1, obj.getMemberId());
        	 
        	 pstmt.setString(2,obj.getMemberName());
        	 
        	 pstmt.setString(3,obj.getMemberAddress());
        	 
     		java.sql.Date sqlDate = java.sql.Date.valueOf(obj.getAccountOpenDate());

        	 pstmt.setDate(4,sqlDate);
        	 
        	 pstmt.setString(5,obj.getMemberShipType());
        	 
        	 pstmt.setDouble(6,obj.getFeesPaid());
        	 
             pstmt.setInt(7, obj.getMaxBookAllowed());
             
        	 pstmt.setDouble(8,obj.getPenaltyAmount());
        	 
        	 rowAdded = pstmt.executeUpdate();
        	
		 }
		 
		 catch(SQLException e) {
			 
			 e.printStackTrace();
			 
		 }
		return rowAdded;
	}

	public List<Member> findAll() {
		// TODO Auto-generated method stub
		
        List<Member> memberList = new ArrayList<Member>();
		
		String sql = "select * from prawinmember";
		
		try(PreparedStatement pstmt =con.prepareStatement(sql))
		
		{
			ResultSet rs =pstmt.executeQuery();
			
			while(rs.next()) {
				
				int memberId = rs.getInt("MEMBER_ID");
				
				String memberName = rs.getString("MEMBER_NAME");
				
				String memberAddress = rs.getString("MEMBER_ADDRESS");
				
	      LocalDate accountOpenDate = rs.getDate("ACC_OPEN_DATE").toLocalDate();
				
				String memberShipType = rs.getString("membership_type");
				
				double feesPaid = rs.getDouble("fees_paid");
				
				int maxBookAllowed = rs.getInt("max_books_allowed");
				
				double penaltyAmount = rs.getDouble("penalty_amount");
				
		        Member member = new Member(memberId, memberName, memberAddress,
		        		
		        		accountOpenDate, memberShipType, feesPaid, 
		        		
		        		maxBookAllowed, penaltyAmount); 
		        
		        memberList.add(member);
			}
			
		}
		
		catch(SQLException e)
		{
			
			e.printStackTrace();
		}
		
		
		return memberList;
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(int Id, Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}



	
}
