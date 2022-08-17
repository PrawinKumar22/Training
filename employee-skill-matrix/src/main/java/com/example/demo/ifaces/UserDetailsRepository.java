package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails,Integer> {

}
