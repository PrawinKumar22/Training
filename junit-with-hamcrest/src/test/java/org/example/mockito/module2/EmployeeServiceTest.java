package org.example.mockito.module2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;

import org.mockito.Mock;

import org.mockito.Mockito;

import org.mockito.junit.jupiter.MockitoExtension;

import org.example.model.ifaces.EmployeeRepository;

import org.example.model.Employee;

import org.example.model.service.EmployeeService;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

	@Mock
	EmployeeRepository repo;
	
	@InjectMocks
	EmployeeService service;
	
	@Test
	@DisplayName(value = "Test the value is not found should return ElementNotFound")
	void testElementFound() throws Exception {
		
		Employee ram= new Employee("ram", 188);
		
		Mockito.when(repo.getById(106)).thenReturn(Optional.of(ram));
		
		assertNotNull(service.getById(106));
		
//		assertEquals(ram, service.getById(106));
		
	}
	
	@Test
	@DisplayName(value = "test the value delete the id if found otherwise throws exception")
   void testDeleteById() {
		
		Employee ram = new Employee("ram",101);
		
		Mockito.when(repo.deleteById(101)).thenReturn(Optional.of(ram));
		
		assertNotNull(service.deleteById(101));
	}

}
