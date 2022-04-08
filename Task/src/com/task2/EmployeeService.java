package com.task2;

public class EmployeeService {

	public double calculateBonus(Employee employee) {
		
		double amount = employee.getEmployeeSalary();
		
		return(amount/100)*33;
	}
}
