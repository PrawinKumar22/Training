package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
//		int value=Integer.parseInt(args[0]);
//		System.out.println(++value);
		CurrencyConvertor conv = new CurrencyConvertor();
		double d=Double.parseDouble(args[0]);
		System.out.println(conv.inrToUsd(d));
		
		double inrValue=Double.parseDouble(args[1]);//AutoBoxing Concept-converts primitives to objects and objects to primitives//
		System.out.println(conv.inrToEuro(inrValue));
		
		double salary=42500.00;
		int intsal=(int)salary;
		int age=42;
		String strAge=Integer.toString(age);
		int intAge=Integer.valueOf(strAge);
		
	}

}
