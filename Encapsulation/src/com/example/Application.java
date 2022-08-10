package com.example;

import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ram=new Student();
		ram.setRollNumber(56020);
		//ram.setMarkScored(95);//Protected //unable to access because the method is private in student class
		//ram.setFirstName("Ram");//Default //student class is in com.example.model package and Application is in com.example package
		System.out.println("Roll Number:"+ram.getRollNumber());
		//System.out.println("Mark Scored:"+ram.getMarkScored());
		//System.out.println("Student Name:"+ram.getFirstName());
		Student shyam=new Student(490,"Shyam",89,"Mech");
		System.out.println("Roll Number:"+shyam.getRollNumber());
	    System.out.println("Student Name:"+shyam.getFirstName());
		Student subramani=new Student(988,"Subramani","textile");
		System.out.println("Roll Number:"+subramani.getRollNumber());
		System.out.println("Student Name:"+subramani.getFirstName());
		System.out.println("Mark Scored:"+subramani.getMarkScored());
	
	}
}