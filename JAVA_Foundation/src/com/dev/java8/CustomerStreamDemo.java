package com.dev.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Customer{
	int cid;
	String cName;
	float tCost;
	
	public Customer(int cid, String cName, float tCost) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.tCost = tCost;
	}
}

public class CustomerStreamDemo {
	public static void main(String[] args) {
		List<Customer> ls = new ArrayList<Customer>();
		ls.add(new Customer(123, "Raj", 5000));
		ls.add(new Customer(223, "Max", 2000));
		ls.add(new Customer(323, "Yash", 6000));
		ls.add(new Customer(423, "Don", 50000));
		
		Stream<Customer> d = ls.stream().filter(c -> c.tCost>4000 );
		d.forEach((c) -> System.out.println(c.cName + " " + c.tCost));

	}

}
