package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.demo.service.OrderService;

@Service
public class ProducerSendJson {

	@Autowired RabbitTemplate template;
	@Autowired OrderService service;
	
	@Scheduled(fixedRate=500)
	public void sendMessage() {
		Map<Integer, Float> products= new HashMap<>();
		products.put(1, 565.25f);
		Order order= new Order(products,0, 121);
		Order o=service.insertOrder(order);
		template.convertAndSend("q1", o);
	}
}
