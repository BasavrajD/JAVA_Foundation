package com.dev.abstraction;

public abstract class Amazon {
	private double discount;
	
	//no arg constructor
	public Amazon() {
		discount = 0.02;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	abstract void sellProduct(double price);
}

class AmazonSeller extends Amazon{
	
	private double sellerDiscount;
	
	public AmazonSeller(double sellerDiscount) {
		this.sellerDiscount = sellerDiscount;
	}

	@Override
	void sellProduct(double price) {
		double amount = price - (price*(getDiscount()+sellerDiscount));
		System.out.println("amount to be paid after seller discount: " + amount);
		
	}
	
}

class AmazonPrimeSeller extends Amazon{
	
	private double sellerDiscount;
	private double primeDiscount;
	
	public AmazonPrimeSeller(double sellerDiscount, double primeDiscount) {
		this.sellerDiscount = sellerDiscount;
		this.primeDiscount = primeDiscount;
	}

	@Override
	void sellProduct(double price) {
		double amount = price - (price*(getDiscount()+sellerDiscount+primeDiscount));
		System.out.println("amount to be paid after prime discount: " + amount);
		
	}
	
}
