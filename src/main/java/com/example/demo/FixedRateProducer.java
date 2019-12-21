package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

//@Service
public class FixedRateProducer {

	@Autowired RabbitTemplate template;
	private Logger logger= LoggerFactory.getLogger(FixedRateProducer.class);
	int i=0;
	//@Scheduled(fixedRate=500)//500 milliseconds: 0.5 sec
	public void sendMesage() {
		i++;
		//By default will send the message to the default exchange which will route it to the queue with the same name
		template.convertAndSend("q1", i+" Hello");
		logger.info("Message sent for "+ i);
	}
}
