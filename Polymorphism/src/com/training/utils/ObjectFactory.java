package com.training.utils;

import com.training.ifaces.Conditional;
import com.training.ifaces.Professor;
import com.training.ifaces.Student;

public class ObjectFactory {
	
	public Conditional getConditional(int key) {
		
		switch (key) {
		
		case 1:
			return new Professor("phd");
							
		case 2:
			
			return new Student(89);
						
			default:
				
				return null;
				
		}
		
	}
		public double getValue(Conditional obj,Object value) 
		{
			//here obj reference type is conditional but objects are student//
			//or professor or principal at runtime test method in the respective//
			//objects is called hence run time polymorphism//
			boolean result = obj.test(value);
			
			double travelAllowance = 1000;
			
			if(result) {
				
				travelAllowance = 2000;
			}
			
			return travelAllowance;
			
			
			
		
	}

}
