package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SkillReference;

import com.example.demo.services.SkillReferenceService;

@RestController

@RequestMapping(path = "/api/v1/skills/reference")
public class SkillsReferenceController {

	private SkillReferenceService service;

	@Autowired
	public SkillsReferenceController(SkillReferenceService service) {
		super();
		this.service = service;
	}
	
	@PostMapping(path = "/add")
	public SkillReference add(@RequestBody SkillReference entity) {
		
		return this.service.add(entity);
	}
	
	@GetMapping(path = "/findAll")
	public List<SkillReference>findAll(){
		
		return this.service.findAll();
	}
}
