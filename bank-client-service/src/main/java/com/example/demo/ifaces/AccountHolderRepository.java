package com.example.demo.ifaces;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import com.example.demo.entity.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder,Integer> {

	AccountHolder findByAccountNumber(long accountNumber);
	
	@Query(nativeQuery = true,value = "update prawin_account_holder set balance=:amount where account_number=:accountNumber")
	@Transactional
	@Modifying
	Object balanceAfterTransaction(@Param("amount")double amount,
			@Param("accountNumber") long accountNumber);
	
	@Query(nativeQuery = true,value = "update prawin_account_holder set balance=:amount where account_number=:accountNumber")
	@Transactional
	@Modifying
	Object balanceAfterTransaction1(@Param("amount")double amount,
			@Param("accountNumber") long accountNumber);
	
	
}
