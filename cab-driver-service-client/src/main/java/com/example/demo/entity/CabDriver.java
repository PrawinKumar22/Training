package com.example.demo.entity;

import java.time.LocalDate;

import lombok.AccessLevel;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


public class CabDriver {

	int driverId;
	
	String driverName;
	
	long mobileNumber;
	
	String location;
	
	LocalDate dateOfBirth;

	double rating;
	
}
