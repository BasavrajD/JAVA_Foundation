package com.dev.rentalSystem;

public class Car extends Vehicle implements Insurable{

	public Car(String brand, int year) {
		super(brand, year);
	}
	
	@Override
	public void insure() {
		System.out.println("Car insured");
		
	}

}
