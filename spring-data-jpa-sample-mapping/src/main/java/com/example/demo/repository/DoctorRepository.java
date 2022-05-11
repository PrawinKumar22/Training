package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

	public List<Doctor>findByDepartment(String srch);
	
	public Doctor findByDoctorName(String srch);
	
	public Doctor findByDoctorNameAndDepartment(String name,String dept);
	
	@Query(nativeQuery = true,
	value="select doctor_id,department,doctor_name,phone_number from prawin_doctor"
			+" where doctor_name=:name or department=:dept")
	
	public List<Doctor>getByNameDept(@Param("name")String name,@Param("dept")String dept);
	
}

