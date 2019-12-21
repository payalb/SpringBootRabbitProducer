package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Order;
import com.example.demo.dao.OrderRepository;

@Service
public class OrderService {

	@Autowired OrderRepository rep;
	public Order insertOrder(Order order) {
		return rep.save(order);
	}
}
