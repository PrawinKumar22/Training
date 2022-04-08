package com.training;

import com.training.model.Automobile;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectFactory factory = new ObjectFactory();
		
		Automobile auto = factory.getObject(1);
		
		Automobile auto1 = factory.getObject(2);
		
		factory.printQuote(auto);
		
		factory.printQuote(auto1);

	}

}
