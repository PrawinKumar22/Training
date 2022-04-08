package com.task3;

public class Hotel {
	private String hotelName;
	private int hotelNumber;
	private String hotelAddress;
	
	public Hotel() {
		super();
		
	}
	

	public Hotel(String hotelName, int hotelNumber, String hotelAddress) {
		super();
		this.hotelName = hotelName;
		this.hotelNumber = hotelNumber;
		this.hotelAddress = hotelAddress;
	}


	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getHotelNumber() {
		return hotelNumber;
	}

	public void setHotelNumber(int hotelNumber) {
		this.hotelNumber = hotelNumber;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

}
