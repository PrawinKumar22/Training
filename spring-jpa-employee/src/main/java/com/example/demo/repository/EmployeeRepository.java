package com.example.demo.repository;

import java.time.LocalDate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	public List<Employee>findByDateOfBirth(LocalDate date);
	
	public List<Employee>findBySkillSet(String skillSet);
	
	public List<Employee>findByLocationAndSkillSet(String location, String skillSet);
	
	@Query(nativeQuery = true,
			value="select employee_id,date_of_birth,employee_name,location,phone_number,skillset"
					+" from prawin_employee where skillset=:skillSet or location=:location")
	
	public List<Employee>getByEmployeesLocationAndSkill(@Param("location")String location, 
			@Param("skillSet")String skillSet);
			
}
