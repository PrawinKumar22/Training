package org.training.service;

import java.util.List;

import org.example.ifaces.ProfessorRepository;

import org.example.ifaces.StudentRepository;

import org.example.model.Student;

public class StudentService {

	private StudentRepository repo;
	
	private ProfessorRepository profRepo;

	public StudentService(StudentRepository repo, ProfessorRepository profRepo) {
		super();
		this.repo = repo;
		this.profRepo = profRepo;
	}
	
    public Student add(Student entity) {
		
		return this.repo.add(entity);
		
	}
	
	public List<Student>findAll(){
		
		return this.repo.findAll();
	}

	
	
}
