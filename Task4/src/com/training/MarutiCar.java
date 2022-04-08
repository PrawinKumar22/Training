package com.training;

import com.training.model.Automobile;

public class MarutiCar implements Automobile {
	

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		
		String color ="red";
		return color;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		
		String model = "hatchback";
		return model;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		
		double amount = 600000;
		
		return amount;
	}

}
