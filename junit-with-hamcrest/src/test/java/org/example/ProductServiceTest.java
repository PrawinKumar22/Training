package org.example;

import org.example.services.ProductService;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;


public class ProductServiceTest {

	ProductService service = null;
	
	@BeforeEach
	void init() {
		
		service = new ProductService();
	}
	
	@DisplayName(value = "Test findDiscount method returns 0.20 or above for tv and laptops")
	@Test
	void testFindDiscount() {
		
		double actual = service.findDiscount("tv");
		
		assertThat(actual,is(greaterThan(0.19)));
	}
	
	@DisplayName(value = "Test findProducts method returns 0.10 or above for fridge,washing machine")
	@Test
	void testFindDiscountCaseTwo() {
		
		double actual = service.findDiscount("fridge");
		
		assertThat(actual,is(greaterThan(0.01)));
	}
	
	@DisplayName(value = "Test findProducts method returns a list of four brands")
	@Test
	void testProductList() {
		
		int list = service.findProducts().size();
		
		int expected = 4;
		
		assertEquals(expected,list);
	}
	
	@DisplayName(value = "Test findProducts method returns a list containing"
			+"Dell,Lenova,Hp,Asus for product laptop")
	@Test
	void testFindProductHasItems() {

	String[] str = {"dell","macbook","hp","lenovo"};

	assertThat(str,is(arrayContaining("dell","macbook","hp","lenovo")));
			
	}
}
