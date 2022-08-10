package com.example.demo.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.TripDetail;

import com.example.demo.ifaces.TripDetailRepository;

@Service
public class TripDetailService {

	
	private TripDetailRepository repo;

	@Autowired
	public TripDetailService(TripDetailRepository repo) {
		super();
		this.repo = repo;
	}
	
    public TripDetail save(TripDetail entity) {
		
		return repo.save(entity);
		
	}
	
    public List<TripDetail> findById(int id){
		
		return repo.findByDriverId(id);
		
	}
    
    public List<TripDetail>findAll(){
		
		return repo.findAll();
	}
}
