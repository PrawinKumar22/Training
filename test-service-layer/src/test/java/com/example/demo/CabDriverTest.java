package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.http.MediaType;

import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.entity.CabDriver;

import com.example.demo.services.CabDriverService;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import static org.mockito.BDDMockito.*;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestInstance;

import org.junit.jupiter.api.TestInstance.Lifecycle;

import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.Matchers.hasSize;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@AutoConfigureMockMvc
public class CabDriverTest {

	@Autowired
	MockMvc mock;
	
	@Autowired
	ObjectMapper mapper;
	
	@MockBean
	CabDriverService service;
	
	
	private CabDriver kanna;
	
	private CabDriver damu;

	private CabDriver david;

	
	@BeforeAll
	void init(){
		
		kanna=new CabDriver(123,"Kanna",8745,"Madurai", LocalDate.of(1997,10,11), 4.5);
		
		damu=new CabDriver(129,"Damu",8723,"Madurai", LocalDate.of(1997,07,12), 4.2);
		
		david=new CabDriver(121,"David",8743,"Madurai", LocalDate.of(1997,02,14), 4.3);
		
	}
	@DisplayName("Find All Method should return a Array")
	@Test
	void testFindAll() throws Exception{
		
//		List<CabDriver>list = Arrays.asList(kanna,damu,david);
		
		List<CabDriver>list = new ArrayList<>();
		
		list.add(kanna);
		
		list.add(damu);
		
		list.add(david);
		
		 given(service.findAll()).willReturn(list);
		
		mock.perform(MockMvcRequestBuilders
				
                .get("/api/v1/drivers")
                
               .contentType(MediaType.APPLICATION_JSON))
		
                .andExpect(status().isOk())
                
                .andExpect(jsonPath("$" ,hasSize(3)))
                
                .andExpect(jsonPath("$[2].driverName",is("David")));

	}
	
	@DisplayName(value = "Test Add Method return status code 201 and "
			+ "returns the element Added")
	@Test
	void testAdd() throws Exception {
		
		CabDriver parth = new CabDriver(2006,"Sathish",876543,"Sivakasi",LocalDate.of(2005,10,12),4.0);
	
		given(service.save(parth)).willReturn(parth);
		
		mock.perform(MockMvcRequestBuilders.post("/api/v1/drivers")
				
				.contentType(MediaType.APPLICATION_JSON)
				
				.content(asJsonString(parth)))
		
		.andExpect(status().isCreated())
		
		.andExpect(content().contentType(MediaType.APPLICATION_JSON))
		
		.andExpect(jsonPath("$.driverName",is("Sathish")));

	}
	
	

	public  String asJsonString(CabDriver obj) {
	
		try {

	//ObjectMapper objectMapper = new ObjectMapper();
	
			return mapper.writeValueAsString(obj);

	}
	
		catch(Exception e) {
	
			throw new RuntimeException(e);
		
		}
	}
	
	@DisplayName("Test deleteById Method return a deletedelement")
	@Test
	void testDeleteById() throws Exception {

	Optional<CabDriver> element=Optional.of(kanna);

	given(service.remove(123)).willReturn(element);

	mock.perform(MockMvcRequestBuilders
	
			.delete("/api/v1/drivers/delete/123")
	
			.contentType(MediaType.APPLICATION_JSON))
	
	// .andExpect(status(204))
	
	// .andExpect(jsonPath("$", hasSize(3)))
	
	.andExpect(jsonPath("$.driverName",is("Kanna")));

	}
	
}
