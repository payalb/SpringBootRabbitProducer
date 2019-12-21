package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@RabbitListener(queues = "q1", concurrency = "3")
	public void listen(Order message) throws InterruptedException {
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName()+ " consumed "+ message);
	}
	
}

//spin up 3 consumer threads