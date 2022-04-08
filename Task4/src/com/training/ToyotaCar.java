package com.training;

import com.training.model.Automobile;

public class ToyotaCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		String color = "blue";
		return color;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		String model ="suv";
		return model;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		
		double amount = 500000;
		
		return amount;
		
	}

}
