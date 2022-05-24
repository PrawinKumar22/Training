package com.example.demo.entity;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "prawin_driver")
@NoArgsConstructor
@AllArgsConstructor
public class Driver {

	@Id
	private int driverId;

	@Column(name = "driver_name")
	private String driverName;
	
	@Column(name = "phone_number")
	private long phoneNumber;
	
	private double rating;
	
}
