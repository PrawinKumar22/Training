package com.task2;

import java.util.Scanner;

import com.task1.Customer;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee= new Employee();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Employee Name:");
		
		String employeeName = sc.next();
		
		System.out.println("Enter Employee Id:");
		
		int employeeId= sc.nextInt();
		
		System.out.println("Enter Employee Age:");
		
		int employeeAge = sc.nextInt();
		
		employee.setEmployeeName(employeeName);	
		
		System.out.println("Employee Name:"+employee.getEmployeeName());
		
		employee.setEmployeeId(employeeId);
		
		System.out.println("Employee Id:"+employee.getEmployeeId());
		
		employee.setEmployeeAge(employeeAge);
		
		System.out.println("Employee Age:"+employee.getEmployeeAge());
		
		EmployeeService ebn = new EmployeeService();
		
		System.out.println(ebn.calculateBonus(employee));
		
		sc.close();
	}

}
