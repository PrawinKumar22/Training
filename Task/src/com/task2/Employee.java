package com.task2;

public class Employee {
	private String EmployeeName;
	private int EmployeeId;
	private int EmployeeAge;
	private double EmployeeSalary;
	
	public double getEmployeeSalary() {
		return EmployeeSalary;
	}


	public void setEmployeeSalary(double salary) {
		this.EmployeeSalary = salary;
	}


	public Employee() {
		super();
	}
	

	public Employee(String employeeName, int employeeId, int employeeAge,double salary) {
		super();
		EmployeeName = employeeName;
		EmployeeId = employeeId;
		EmployeeAge = employeeAge;
		EmployeeSalary= salary;
	}


	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public int getEmployeeAge() {
		return EmployeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		EmployeeAge = employeeAge;
	}
}
