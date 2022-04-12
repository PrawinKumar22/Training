package com.training;

import java.util.ArrayList;

import java.util.List;

import com.training.model.Student;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Ram","Shyam","Siva"};
		
		for(String eachName : names) {
			
			System.out.println(eachName);
			
			List<Student> studList = new ArrayList<>();
			
			for(Student eachStudent : studList) {
				
				System.out.println(eachStudent);
				
				
			}
		}

	}

}
