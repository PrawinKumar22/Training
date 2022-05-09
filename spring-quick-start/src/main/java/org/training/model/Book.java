package org.training.model;

import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Service;

@Service
public class Book {

	public double getDiscount(String bookName) {
		
		return 0.10;
		
	}
}
