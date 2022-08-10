package org.example.model.ifaces;

import java.util.Optional;

import org.example.model.Employee;

public interface EmployeeRepository {

	public Optional<Employee>getById(int id);

	public Optional<Employee> deleteById(int id);
	
}
