package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;
@Entity
@Table(name= "prawin_patient_one_to_manybid")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

	@Id
	@Column(name="patient_id")
	int patientId;
	
	@Column(name="patient_name")
	String patientName;
	
	@Column(name="phone_number")
	long phoneNumber;
	
	
}
