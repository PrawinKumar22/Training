package org.example;

import static org.junit.jupiter.api.Assertions.assertAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.example.model.Book;

import org.example.services.BookService;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestInfo;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.ValueSource;

public class BookServiceTest {

BookService service=null;
	
	
	@BeforeAll
	public static void init(TestInfo info) {
		System.out.println(info.getDisplayName()+"called");
	}
	@BeforeEach
	public void setUp(TestInfo info) {
		 service = new BookService();
		 System.out.println(info.getDisplayName()+"called");
	}
	
	@Test
	@DisplayName(value = "Get Method should not return null value")
	void testGetBookMethod() {
		
		BookService service= new BookService();
		
		Object actual = service.getBookList();
		
		assertNotNull(actual);
	}
	
	@DisplayName(value ="add Method should return 1 for success and 0 for failure to insert")
	@Test
	void testAddBookMethod() {
		
		BookService service = new BookService();
				
		int expected = 1;
		
		int actual = service.addBook(new Book());
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	@DisplayName("addBook Method should not Accept Dupilcate")
	void testDuplicateNotAllowed() {
		
		BookService service=new BookService();
		
		Book Java=new Book(1001, "Java", 700);
		
		Book list=new Book(1001, "Java", 700);
		
		int value=service.addBook(Java);
		
		int result=service.addBook(list);
		
		int expected=0;
		
		assertEquals(expected, result);
		
//		assertAll("Testing Add Book",
//				
//				()->assertEquals(1,new Book(1001, "Java", 700)),
//				()->assertEquals(0,new Book(1001, "Java", 700)));
	}
	
	@Test
	@DisplayName(value = "If the element is not found in the collection removeBook method should throw "
			+ "Runtime Exception with message element not found")
	void testRemoveBook(){
		
		Throwable exception =
	            assertThrows(RuntimeException.class, ()->                    		
	            service.removeBook(new Book(103,"spring",550)));
		assertEquals("element not found",exception.getMessage());
	}
	
	@DisplayName(value = "Test if getBestBook method has the value Head First Java in one first three positions")
	@ParameterizedTest
	@ValueSource(ints= {0,1,2})
	void testGetBestBook(int pox) {
		
//		System.out.println(System.getProperty("os.name"));
//		
//		assumeTrue(System.getProperty("os.name").equals("Windows 8.1"));
		
		assertEquals("FaceBook",service.getBestBooks().get(pox));
	}
}
