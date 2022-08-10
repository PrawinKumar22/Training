package com.training;

import com.training.model.HealthInsurance;
import com.training.model.Insurance;

import com.training.model.LifeInsurance;

import com.training.model.VehicleInsurance;

public class Application {
	
	public static void printPremium(Insurance object) {
		
		System.out.println(object.calculatePremium());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleInsurance car = new VehicleInsurance(1010,"Ramesh","car",2019);
		
		printPremium(car);
		
		LifeInsurance life = new LifeInsurance(1010,"Prawin",21);
		
		printPremium(life);
		
		String[] illness = {"bp","sugar","ent","thyroid"};
		
		HealthInsurance health = new HealthInsurance(3030,"Vicky",illness);
		
		printPremium(health);
		

	}

}
