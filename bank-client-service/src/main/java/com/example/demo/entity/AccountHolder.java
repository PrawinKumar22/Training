package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "prawin_account_holder")
public class AccountHolder {
	
	@Id
	@Column(name = "account_number")
	long accountNumber;
	
	@Column(name = "account_holder_name")
	String accountHolderName;
	
	@Column(name = "account_type")
	String accountType;
	
	@Column(name = "date_of_birth")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate dateOfBirth;
	
	@Column(name = "balance")
	double balance;
	
	@Column(name = "email_id")
	String emailId;
	
	@Column(name = "phone_number")
	long phoneNumber;
	
	@Column(name = "address")
	String address;
}
