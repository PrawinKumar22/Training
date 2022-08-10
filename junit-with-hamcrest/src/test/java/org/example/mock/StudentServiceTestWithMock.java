package org.example.mock;

import org.example.model.Student;

import org.example.service.StudentService;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

public class StudentServiceTestWithMock {

	@DisplayName(value = "Test verify Add Method with Mock")
	@Test
	void testAddWithMock() {
		
		StudentServiceMock mock = new StudentServiceMock();
		
		StudentService service = new StudentService(mock);
		
		Student kavi = new Student(897,"Kavi");
		
		Student kavitha = new Student(987,"Kavitha");
		
		service.add(kavi);
		
		mock.verify(kavi,1);
		
		service.add(kavitha);
		
		mock.verify(kavitha,2);
		
			
	}
}
