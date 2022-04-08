package com.task3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel hotel = new Hotel();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Hotel Name:");
		String hotelName = sc.next();
		System.out.println("Enter Hotel Number:");
		int hotelNumber= sc.nextInt();
		System.out.println("Enter Hotel Address:");
		String hotelAddress = sc.next();
		hotel.setHotelName(hotelName);
		System.out.println("Hotel Name:"+hotel.getHotelName());
		hotel.setHotelAddress(hotelAddress);
		System.out.println("Hotel Address:"+hotel.getHotelAddress());
		hotel.setHotelNumber(hotelNumber);
		System.out.println("Hotel Number:"+hotel.getHotelNumber());
		sc.close();
	}

}
