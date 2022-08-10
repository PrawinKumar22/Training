package org.example.mockito.module1;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;

import org.mockito.Mock;

import org.mockito.Mockito;

import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.mockito.Mockito.times;

import static org.mockito.Mockito.verify;

import static org.mockito.Mockito.when;

import java.util.ArrayList;

import java.util.List;

import org.example.ifaces.StudentRepository;

import org.example.model.Student;

import org.example.service.StudentService;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
	
	@Mock
	StudentRepository repo;
	
	@Mock
	StudentService serviceMock;
	
	@InjectMocks
	StudentService service;
	
	@DisplayName("Test Find All Method with Mockito Stub and Annotation")
	@Test
	void testFindAllUsingAnnotation(){
		
		Student ram = new Student(101,"Ram");
		
		Student shyam = new Student(102,"Shyam");
		
		List<Student> list = new ArrayList<>();
		
		list.add(ram);
		
		list.add(shyam);
		
		//stubbing
		
		when(repo.findAll()).thenReturn(list);
		
		assertEquals(service.findStudentSize(),2);
	}

	@DisplayName("Test Find All Method with Mockito Stub")
	@Test
	void testFindAll(){
		
		StudentRepository repo=Mockito.mock(StudentRepository.class);
		
		StudentService service=new StudentService(repo);
		
		Student ram = new Student(101,"Ram");
		
		Student shyam = new Student(102,"Shyam");
		
		List<Student> list = new ArrayList<>();
		
		list.add(ram);
		
		list.add(shyam);
		
		//stubbing
		
		when(repo.findAll()).thenReturn(list);
		
		assertEquals(service.findStudentSize(),2);
	}
	
	@DisplayName(value = "Test addWithCondition Method of the service "
			+ "it should add elements only roll number is greater than 2000"
			+ "else it should return a null value")
	@Test
	void testAddWithCondition() {
		
		Student ram = new Student(2001,"Ram");
		
		assertNotNull(service.addWithCondition(ram));
		
	}
	
	@Test
	void verifyAddWithCondition() {
		
		Student ram = new Student(2001,"Ram");
		
		serviceMock.addWithCondition(ram);
		
		verify(service,times(1)).addWithCondition(ram);
		
	}
		
}
