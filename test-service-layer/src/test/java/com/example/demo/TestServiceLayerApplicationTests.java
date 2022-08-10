package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestInstance;

import org.junit.jupiter.api.TestInstance.Lifecycle;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.CabDriver;

import com.example.demo.services.CabDriverService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class TestServiceLayerApplicationTests {

	@Autowired
	CabDriverService service;
	
	@BeforeAll
	void setUp() {
		
		CabDriver driver = new CabDriver(1010,"Jegan",8745,"Chennai",LocalDate.of(2001,01,22),4.5);
		
		service.save(driver);
		
	}
	
//	@Test
//	@DisplayName("Find All Method should return a Empty Array")
//	void testFindAllFailure() {
//		
//		assertTrue(service.findAll().isEmpty());
//	}

	@Test
	@DisplayName("Find All Method should return a Empty Array")
	void testFindAllSuccess() {
		
		assertFalse(service.findAll().isEmpty());
	}

	@Test
	@DisplayName("Find By Id Method should return an Element with Given Id")
	void testFindById() {
		
//		assertEquals("Jegan",service.findById(1010).get().getDriverName());
		
//		CabDriver driver = service.findById(1010).orElseThrow(EntityNotFoundException::new);
		
//		assertEquals("Jegan",driver.getDriverName());
	}
	
}
