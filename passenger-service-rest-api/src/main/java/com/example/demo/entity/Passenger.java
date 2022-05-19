package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.FetchType;

import javax.persistence.Id;

import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "prawin_passenger")
public class Passenger {

	@Id
	@Column(name = "passenger_id")
	private int passengerId;
	
	@Column(name = "passenger_name")
	private String passengerName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "location")
	private String location;
	
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", email=" + email
				+ ", location=" + location + "]";
	}

	@Autowired
	public Passenger(int passengerId, String passengerName, String email, String location) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.email = email;
		this.location = location;
	}

	@OneToMany(targetEntity = TripHistory.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "passenger_ref",referencedColumnName="passenger_id")
	List<TripHistory>tripList;//one to many one passenger to many trips
}
