package org.example.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.service.StudentService;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

public class StudentServiceTestWithStub {
	
	@Test
	@DisplayName(value = "test find all using stub")
	void testFindAllMethod() {
		
		StudentRepositoryStub stub = new StudentRepositoryStub();
		
		StudentService service = new StudentService(stub);
		
		assertEquals(service.findAll().size(),2);
	}
	
	

}


