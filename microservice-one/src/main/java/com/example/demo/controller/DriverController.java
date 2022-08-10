package com.example.demo.controller;

import java.net.URI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;

import com.example.demo.services.DriverServices;

@RestController
@RequestMapping(path = "api/v1")
public class DriverController {

	private DriverServices service;

	@Autowired
	public DriverController(DriverServices service) {
		super();
		this.service = service;
	}

	@GetMapping(path = "/drivers")
	public List<Driver>getAllDrivers(){
		
		return this.service.findAll();
		
	}
	
	@GetMapping(path = "/drivers/{id}")
	public Driver getDriverById(@PathVariable("id")int id) {
		
		return this.service.findById(id);
	}
	
//	@PostMapping(path = "/drivers")
//	public Driver addDriver(@RequestBody Driver entity) {
//		
//		return this.service.add(entity);
//	}
			
//	@PostMapping(path = "/drivers")
//	public ResponseEntity<Driver>addDriver(@RequestBody Driver entity) {
//		
//		Driver driver = this.service.add(entity);
//		
//		return ResponseEntity.status(HttpStatus.CREATED).body(driver);
//		
//	}
	
	@PostMapping(path = "/drivers")
	public ResponseEntity<Driver> addDriver(@RequestBody Driver entity) {
		
		Driver driver = this.service.add(entity);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest() //http://localhost:8080/api/v1/drivers
				
				.path("/{id}")//http://localhost:8080/api/v1/drivers/{id}
				
				.buildAndExpand(entity.getDriverId())//http://localhost:8080/api/v1/drivers/104
				
				.toUri();
		
		return ResponseEntity.created(location).body(driver);
	}
	
	@DeleteMapping(path="/drivers/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id){
		
		try {
			
			this.service.deleteById(id);
			//return ResponseEntity.status(204).build();
			
			return ResponseEntity.status(HttpStatus.CREATED).body("One Record Deleted "+id);
			
		}
			catch(Exception e){
				
				return ResponseEntity.status(400).body("Not found");
			}
	}
	
	@GetMapping(path = "/drivers/srch/phno/{phoneNumber}")
	public List<Driver> getDriverByPhoneNumber(@PathVariable("phoneNumber")long number) {
		
		return this.service.srchByPhoneNumber(number);
	}
	
	@PutMapping(path = "/drivers/update/{id}/{rating}")
	public ResponseEntity<String> updateRating(@PathVariable("id")int id, @PathVariable("rating") double updatedRating){
		
		int update = this.service.updateRating(id,updatedRating);
		
		return ResponseEntity.status(HttpStatus.OK).body("Record Updated"+update);
	}
	
	@GetMapping(path = "/drivers/srch/name/{srchName}")
   public List<Driver> getDriverByName(@PathVariable("srchName")String srchName) {
		
		return this.service.findByDriverName(srchName);
		
	}
	
	@GetMapping(path = "/drivers/srch/rate/{rating}")
	public List<Driver> getDriverByRating(@PathVariable("rating") double rating){
		
		return this.service.srchByDriverRating(rating);
	
	}
	

	@GetMapping(path = "/drivers/sort/{propName}")
	public List<Driver> getDriverBySortedName(@PathVariable("propName")String propName){
		
		return this.service.sortedList(propName);
	
	}
}
