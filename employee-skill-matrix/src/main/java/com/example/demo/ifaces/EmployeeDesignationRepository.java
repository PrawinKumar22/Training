package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmployeeDesignation;

public interface EmployeeDesignationRepository extends JpaRepository<EmployeeDesignation,Integer> {

}
