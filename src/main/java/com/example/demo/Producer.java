package com.example.demo;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class Producer {

	@Autowired RabbitTemplate template;
	
	public void sendMessage() {
		template.convertAndSend("exchange1","q1","hello");
	}
}
