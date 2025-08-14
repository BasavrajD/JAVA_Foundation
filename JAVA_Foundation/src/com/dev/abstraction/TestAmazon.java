package com.dev.abstraction;

public class TestAmazon {

	public static void main(String[] args) {
		AmazonSeller obj1 = new AmazonSeller(0.05);
		obj1.sellProduct(500.0);
		
		AmazonPrimeSeller obj2 = new AmazonPrimeSeller(0.05,0.05);
		obj2.sellProduct(500.0);
	}

}
