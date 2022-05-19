package com.example.demo;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Passenger;

import com.example.demo.entity.TripHistory;

import com.example.demo.ifaces.PassengerRepository;

import com.example.demo.service.PassengerService;

@SpringBootApplication
public class PassengerServiceRestServiceApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(PassengerServiceRestServiceApplication.class, args);
		
	}
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			PassengerRepository repo;
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
	
				TripHistory trip1 = new TripHistory(501,LocalDateTime.of(2015,01,10,7,30),"Madurai","Chennai",1500);
				
				TripHistory trip2 = new TripHistory(502,LocalDateTime.of(2016,02,11,6,40),"Chennai","Coimbatore",800);
				
				TripHistory trip3 = new TripHistory(503,LocalDateTime.of(2017,03,12,5,55),"Erode","Salem",700);
				
				Passenger pass = new Passenger();
				
				pass.setPassengerId(101);
				
				pass.setPassengerName("Rocky");
				
				pass.setEmail("rocky123@gmail.com");
				
				pass.setLocation("Madurai");
				
				List<TripHistory>list = Arrays.asList(trip1,trip2,trip3);
				
				pass.setTripList(list);
				
				repo.save(pass);
			}
		};
	}
}
