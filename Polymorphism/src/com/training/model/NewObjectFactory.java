package com.training.model;

import com.training.ifaces.Conditional;
import com.training.utils.ObjectFactory;

public class NewObjectFactory extends ObjectFactory {

	@Override
	public Conditional getConditional(int key) {
		// TODO Auto-generated method stub
		switch(key) {
		
		case 3:
			return new Principal("eng");
	
	default:
					
      return super.getConditional(key);
	
 }
	
	}
}
