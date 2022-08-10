package com.training;

import java.util.HashMap;

import java.util.HashSet;

import java.util.Map;

import java.util.Set;

import com.training.doctor.Appointment;

import com.training.doctor.Doctor;

import com.training.doctor.Patient;

public class Application {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patient patient = new Patient(101,"Ram","Chennai",9876);
		
		Patient patient1 = new Patient(102,"Ramesh","Kovai",9586);
		
		Patient patient2 = new Patient(103,"Suresh","Madurai",8776);
		
		Set<Patient> patients = new HashSet<>();
		
		patients.add(patient);
		
		patients.add(patient1);
		
		patients.add(patient2);
		
		Doctor doctor = new Doctor(101,"Durai","Cardiology",patients);
		
		Doctor doctor1 = new Doctor(102,"Vicky","Cardiology",patients);
		
		for(Patient eachPatient: doctor.getPatients()) {
			
		//System.out.println(eachPatient);
		
		}	
		
		Map<Doctor,Set<Patient>> map = new HashMap<>();
		
		map.put(doctor,patients);
		
		map.put(doctor1, patients);
		
		Appointment appointment = new Appointment(map);
		
		Map<Doctor, Set<Patient>> map1 = appointment.getMap();
		
	     System.out.println(appointment.getPatients(doctor));		
		
 	}

}
