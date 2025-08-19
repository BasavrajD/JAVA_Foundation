package com.dev.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Order{
	private String orderId;
	private double amount;
	public Order(String orderId, double amount) {
		super();
		this.orderId = orderId;
		this.amount = amount;
	}
	
	public void billProcess() {
		System.out.println("Order processing..." + orderId + "with amount: " + amount);
	}
	
	
}

public class ConsumerDemo {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList("prem", "david", "hari", "john", "altaf", "rajesh");
		Consumer<String> cn = (c) -> {System.out.println(c);};
		ls.forEach(cn);
		
		System.out.println("****************");
		
		List<Order> orders = Arrays.asList(
				new Order("01", 100.0),
				new Order("02", 200.0),
				new Order("03", 300.0),
				new Order("04", 400.0));
		
		Consumer<Order> po = Order::billProcess;
		orders.forEach(po);
	}

}
