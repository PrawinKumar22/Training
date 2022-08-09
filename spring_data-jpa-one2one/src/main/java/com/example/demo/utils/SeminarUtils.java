package com.example.demo.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Seminar;

import com.example.demo.entity.Speaker;

import com.example.demo.ifaces.SeminarRepository;

@Component
public class SeminarUtils {

	@Autowired
	Speaker speaker;
	
	@Autowired
	Seminar seminar;
	
	@Autowired
	SeminarRepository repo;
	
	public void add() {
		
		seminar.setSpeaker(speaker);

		Seminar add = repo.save(seminar);
		
         if(add!=null) {
			
			System.out.println("One Record added");
			
		}
	}
	
	public List<Seminar> findAll() {
		
	return this.repo.findAll();
	
	}
}
