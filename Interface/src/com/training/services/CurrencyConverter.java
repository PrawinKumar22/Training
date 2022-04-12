package com.training.services;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Function;

// A class can extends another class but it can implement one or more interface//  

//class Dummy extends Function{
//	
//}

public class CurrencyConverter implements Function,CheckCondition {

	@Override
	public double apply(double value) {
		// TODO Auto-generated method stub
		return value*100;
	}

	@Override
	public boolean test(int value) {
		// TODO Auto-generated method stub
		return value>5000 ;
	}
	

}
