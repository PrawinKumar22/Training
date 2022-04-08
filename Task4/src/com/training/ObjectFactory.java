package com.training;

import com.training.model.Automobile;

public class ObjectFactory {
	
	public Automobile getObject(int key) {
		
		switch(key) {
		
		case 1:
			
			return new MarutiCar();
			
		case 2:
			
			return new ToyotaCar();
			
			default:
				
				return null;
			}
		
	}
	
	public void printQuote(Automobile poly) {
		
		if(poly!=null) {
		
		System.out.println("Color:"+poly.getColor());
		
		System.out.println("Model:"+poly.getModel());
		
		System.out.println("Price:"+poly.getPrice());
		}
		else {
			System.out.println("invalid choice");
		}
	}

}
