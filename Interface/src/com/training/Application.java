package com.training;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.ifaces.Function;
import com.training.services.CurrencyConverter;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//super type = sub type//
		
		Function conv =new CurrencyConverter();
		
		double response = conv.apply(200);
		
		System.out.println(Function.COUNTER);
		
		System.out.println(response);
		
		//line 12 & 14 and 18 are identical//
		
		System.out.println(conv.apply(300));
		
		if (conv instanceof CheckCondition) {
			
			CheckCondition obj =(CheckCondition)conv;
			
			System.out.println("Is Discount Allowed:"+obj.test(5300));
			
			Conditional conObj = new DiscountCalculator();
			
			System.out.println(conObj.test(6000));
			
			System.out.println(conObj.negate(6000));
			
			
		}
	}

}
