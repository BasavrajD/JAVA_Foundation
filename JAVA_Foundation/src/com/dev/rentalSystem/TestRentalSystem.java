package com.dev.rentalSystem;

public class TestRentalSystem {

	public static void main(String[] args) {
		Car c1 = new Car("TATA", 2020);
		c1.rent();
		c1.insure();
		
		Bike b1 = new Bike("Honda", 2000);
		b1.rent();
		b1.insure();

	}

}
