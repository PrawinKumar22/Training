package com.example.demo.utils.bidirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.bidirectional.Doctor;

import com.example.demo.entity.bidirectional.Patient;

import com.example.demo.ifaces.bidirectional.DoctorRepository;

import com.example.demo.ifaces.bidirectional.PatientRepository;



public class Utility {

	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	@Autowired
	PatientRepository patientRepo;
	
	public void create() {
		
		doc.setPatientList(patientList);
		
		Doctor added=repo.save(doc);
		
		if(added!=null) {
			
			System.out.println("One Record Added");
		}
	}
	
	//if lazy is used ,use transactional 
	//@Transactional
	public void findAll() {
		
		List<Doctor> doctors=repo.findAll();
		
		for(Doctor eachDoctor:doctors) {
			
			System.out.println("Doctor name:="+eachDoctor.getDoctorName());
			System.out.println("Department:="+eachDoctor.getDepartment());
			
			List<Patient> patients = eachDoctor.getPatientList();
			
			for(Patient eachPatient: patients) {
				
				System.out.println("Patient Name:="+eachPatient.getPatientName());
				System.out.println("Mobile Number:="+ eachPatient.getPhoneNumber());
			}
		}
	}
	
	
	public void findDoctorFromPatient() {
		
		Patient entity=patientRepo.findById(200).get();
		
		System.out.println(entity.getPatientName());
		System.out.println(entity.getDoctor());
		
	}
	
}

