package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Passenger;

import com.example.demo.service.PassengerService;

@RestController
@RequestMapping(path = "/api/v2")
public class PassengerController {
	
	@Autowired
	private PassengerService service;

	@PostMapping(path = "/passenger")
	public Passenger addPassenger(@RequestBody Passenger entity) {
		
		return this.service.add(entity);
	}
	
	@GetMapping(path = "/passenger")
	public List<Passenger>getAllPassengers(){
		
		return this.service.findAll();
   }
	
	@GetMapping(path = "/passengers/{passengerName}")
	public List<Passenger> getByPassengerName(@PathVariable("passengerName") String name) {
		
		return this.service.findByPassengerName(name);
		
	}
	@GetMapping(path = "/passengers/srch/date/{TripListTripDateTime}")
	public List<Passenger> findByTripListTripDateTime(@PathVariable("TripListTripDateTime")
	
	@DateTimeFormat(iso = ISO.DATE_TIME)LocalDateTime date){
		
		return this.service.findByTripDateTime(date);
		
	}
 
}
