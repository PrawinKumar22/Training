package com.example.demo.service;

import java.time.LocalDateTime;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Passenger;

import com.example.demo.ifaces.PassengerRepository;

@Service
public class PassengerService {

	
	private PassengerRepository repo;

	@Autowired
	public PassengerService(PassengerRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Passenger add(Passenger entity) {
		// TODO Auto-generated method stub
		
		return this.repo.save(entity);	
	}
	
	public List<Passenger> findAll() {
		// TODO Auto-generated method stub
		
		return this.repo.findAll();	
	}

	public List<Passenger> findByPassengerName(String name) {
		
		return this.repo.findByPassengerName(name);
		
	}
	
	public List<Passenger> findByTripDateTime(LocalDateTime date) {
		
		return this.repo.findByTripListTripDateTime(date);
		
	}


}
