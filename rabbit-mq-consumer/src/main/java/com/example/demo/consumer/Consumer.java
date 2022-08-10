package com.example.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

import org.springframework.stereotype.Component;

import com.example.demo.direct.config.DirectExchangeConfig;
/**
 * 
 * @author Prawinkumar.B
 *
 */
@Component
public class Consumer {

	/**
	 * 
	 * @param message
	 */
	@RabbitListener(queues = DirectExchangeConfig.ROUTING_KEY)
	public void consumeMessage(String message) {
	
		System.out.println("Received One Message:="+message);

	}
	
}
