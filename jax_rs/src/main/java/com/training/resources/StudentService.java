package com.training.resources;

import java.util.*;

import java.util.stream.*;

import com.example.Student;

public class StudentService {

	private List<Student> studentList;

	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
		
		this.studentList = new ArrayList<Student>();
		
	}
	
	public boolean add(Student student) {
		
		return this.studentList.add(student);
		
	}
	
	public List<Student>getAll(){
		
		return this.studentList;
	}
	
	public Optional<Student> findById(int id) {
		
	
	return this.studentList.stream().filter(e-> e.getRollNo()==id).findFirst();
		
	}
	
	public boolean remove(int id) {
		
		return this.studentList.removeIf(e -> e.getRollNo()==id);
		
	}
	
     
	public Student update(int id,Student newValue) {
		
		int idxPos = this.studentList.indexOf(findById(id).get());
		
		return studentList.set(idxPos, newValue);
		
	}
	
}
