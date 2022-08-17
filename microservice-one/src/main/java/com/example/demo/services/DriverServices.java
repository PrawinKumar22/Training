package com.example.demo.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Driver;

import com.example.demo.ifaces.DriverRepository;

@Service
public class DriverServices {

	private DriverRepository repo;
	
	@Autowired
	public DriverServices(DriverRepository repo) {
		super();
		this.repo = repo;
	}

	public List<Driver> findAll() {
		// TODO Auto-generated method stub
		
		return this.repo.findAll();	
	}

	public Driver add(Driver entity) {
		// TODO Auto-generated method stub
		
		return this.repo.save(entity);
		
	}
	
	public Driver findById(int id) {
		
		return this.repo.findById(id).orElseThrow(()-> new RuntimeException(id + "Id Not Found"));
	}
	
	public void deleteById(int id) {

		this.repo.deleteById(id);

		}
	
	public List<Driver> findByDriverName(String srchName){
		
		return this.repo.findByDriverName(srchName);
	}
	
	public List<Driver>srchByPhoneNumber(long number){
		
		return this.repo.findByPhoneNumber(number);
	}
	
	public List<Driver> srchByDriverRating(double rating){
		
		return this.repo.searchByRating(rating);
	}

	public int updateRating(int id, double updatedRating) {
		
		return this.repo.modifyRating(id, updatedRating);
	}
	
	public List<Driver> sortedList(String propName){
		
		return this.repo.findAll(Sort.by(propName));
	}
}
