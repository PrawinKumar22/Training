package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CabDriver;

public interface CabDriverRepository extends JpaRepository<CabDriver,Integer> {

	CabDriver findByDriverName(String qryName);
}
