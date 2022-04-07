package com.task.training;

public class Address {
	
	private int doorNumber;
	
	private String streetName;
	
	private String areaName;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.doorNumber+","+this.streetName+","+this.areaName;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int doorNumber, String streetName, String areaName) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.areaName = areaName;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	
	

}
