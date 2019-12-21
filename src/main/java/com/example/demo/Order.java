package com.example.demo;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order_info")
public class Order implements Serializable{
		@Id
		@GeneratedValue
		int orderId;
		//productid and price
		@ElementCollection
		Map<Integer, Float> products;
		float discount;
		int customerId;
		
		public Order(Map<Integer, Float> products,	float discount,int customerId) {
			this.products= products;
			this.discount= discount;
			this.customerId= customerId;
		}
}
