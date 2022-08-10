package org.example.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.model.Student;

import org.example.service.StudentService;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

public class StudentServiceTestWithFake {
	
	@DisplayName(value = "Test Add Method Return inserted object back")
	@Test
	void testAddMethod() {
		
		StudentRepoFake fake = new StudentRepoFake();
		
		StudentService service = new StudentService(fake);
		
		Student ram = new Student(101,"Ram");
		
		Student actual = service.add(ram);
		
		assertEquals(actual,ram);
	}
	
	@DisplayName(value = "Test findAll Method Return All the Elements Added")
	@Test
	void testFindAll() {
		
		StudentRepoFake fake = new StudentRepoFake();
		
		StudentService service = new StudentService(fake);
		
		Student ramesh = new Student(102,"Ramesh");
		
		Student shyam = new Student(103,"Shyam");
		
		 service.add(ramesh);
		
		 service.add(shyam);
		
		int actual =service.findAll().size();
		
		int expected = 2;
		
		assertEquals(expected,actual);
	}
}