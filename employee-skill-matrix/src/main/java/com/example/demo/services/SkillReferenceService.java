package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.SkillReference;

import com.example.demo.ifaces.SkillReferenceRepository;

@Service
public class SkillReferenceService {

	private SkillReferenceRepository repo;

	@Autowired
	public SkillReferenceService(SkillReferenceRepository repo) {
		super();
		this.repo = repo;
	}
	
	public SkillReference add(SkillReference entity) {
		
		return this.repo.save(entity);
	}

	public List<SkillReference> findAll() {

		return this.repo.findAll();
		
	}
}
