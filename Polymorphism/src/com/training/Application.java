package com.training;

import com.training.ifaces.Conditional;
import com.training.model.NewObjectFactory;
import com.training.utils.ObjectFactory;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectFactory factory = new NewObjectFactory();
		
		Conditional object = factory.getConditional(1);
		
		Conditional stuObj =  factory.getConditional(2);
	
		System.out.println("Allowance:"+factory.getValue(object,"chennai"));
		
		System.out.println("Allowance:"+factory.getValue(stuObj,"ece"));
		
		System.out.println(object.test("chennai"));
		
		Conditional principalObj = factory.getConditional(3);		
		
		System.out.println("Allowance:"+factory.getValue(principalObj,"eng"));

	}

}
