package com.dev.handsOn;

public class Car {
	
	private String company;
	private String model;
	private int engineVersion;
	private String carType;
	
	public Car(String company){
		this.company = company;
	}
	
	public Car(String company, String carType) {
		this.company = company;
		this.carType = carType;
	}
	
	public Car(int engineVersion, String carType) {
		this.engineVersion = engineVersion;
		this.carType = carType;
	}

	@Override
	public String toString() {
		return company + " " + model + " " + engineVersion + " " + carType; 
	}

	public static void main(String[] args) {
		Car obj1 = new Car("Honda");
		System.out.println(obj1.toString());
		
		Car obj2 = new Car("TATA", "Sedan");
		System.out.println(obj2.toString());
		
		Car obj3 = new Car(10, "SUV");
		System.out.println(obj3.toString());

	}

}
