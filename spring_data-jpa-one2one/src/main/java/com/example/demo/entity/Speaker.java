package com.example.demo.entity;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

@Entity
@Table(name= "prawin_speaker_one_to_one2")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Speaker {

	@Id
	@Column(name = "speaker_id")
	int id;
	
	@Column(name = "first_name")
	String firstName;
	
	@Column(name = "qualification")
	String qualification;
	
	
}
