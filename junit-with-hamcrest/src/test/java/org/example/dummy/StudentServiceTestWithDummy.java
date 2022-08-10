package org.example.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.fake.StudentRepoFake;

import org.example.ifaces.ProfessorRepository;

import org.example.ifaces.StudentRepository;

import org.example.model.Student;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import org.training.service.StudentService;

public class StudentServiceTestWithDummy {

	private StudentRepository repo;
	
	private ProfessorRepository prfrepo;
	
	public StudentServiceTestWithDummy(StudentRepository repo, ProfessorRepository prfrepo) {
		super();
		this.repo = repo;
		this.prfrepo = prfrepo;
	} 	 
	@Test
	@DisplayName("test add method return inserted object back")
	void testAddMethod() {
		
		StudentRepoFake fake = new StudentRepoFake();
		
		DummyProfessorRepository dummy=new DummyProfessorRepository();

		StudentService service = new StudentService(fake,dummy);
		
		Student rev = new Student(101, "revathy");
		
		Student actual = service.add(rev);
		
		assertEquals(actual, rev);
		
	}
	@Test
	@DisplayName("test findall method return all the elements added")
	void testFindAllMethod() {
		StudentRepoFake fake = new StudentRepoFake();
		DummyProfessorRepository dummy=new DummyProfessorRepository();


		StudentService service = new StudentService(fake,dummy);
		
		Student rev = new Student(101, "revathy");
		
		Student ram = new Student(102, "ram");
		
		Student gee = new Student(103, "gee");

		
		service.add(ram);
		
		service.add(rev);
		
		service.add(gee);


		int actual= service.findAll().size();
		
		int expected = 3;
		
        assertEquals(expected, actual);		
	}

}
	

