package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

//@Service
public class SenderOfMessageInitializer implements CommandLineRunner {

	@Autowired Producer producer;
	@Override
	public void run(String... args) throws Exception {
		producer.sendMessage();
		
	}

}


/*
 * producer: sending messages every 0.5 sec 
 * consumer: 1 sec to consume message..
 */