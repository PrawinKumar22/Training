package com.task.training;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address = new Address(12,"netaji","Annanagar");
		
		MobileBill bill = new MobileBill("prawin",98954,"PostPaid",address);
		
		System.out.println(MobileBill.SERVICEPROVIDER +":"+bill.findAmount());
		
		System.out.println(address.toString());		
	}
}
