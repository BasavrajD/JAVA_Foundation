package com.dev.rentalSystem;

public class Bike extends Vehicle implements Insurable{

	public Bike(String brand, int year) {
		super(brand, year);
	}

	@Override
	public void insure() {
		System.out.println("bike insured");
		
	}

}
