package com.training.model;

public class HealthInsurance extends Insurance{
	
	private String [] preExistingDiseases; 
	

	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    public HealthInsurance(int policyNumber, String policyHolderName, String[] preExistingDiseases) {
		super(policyNumber, policyHolderName);
		this.preExistingDiseases = preExistingDiseases;
    }

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		
		double premium = 10000;
		
		for(String eachItem : preExistingDiseases) {
			
			String item = eachItem.toLowerCase();
			
			if(item.equals("bp")|| item.equals("sugar"))
					{
			
				premium = 15000;
			}
		
		}
		return premium;
	}
	

}
