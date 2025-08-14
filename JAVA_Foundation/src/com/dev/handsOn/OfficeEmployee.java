package com.dev.handsOn;

public class OfficeEmployee {
	
	private String name;
	private double salary;
	
	public OfficeEmployee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public double calculateBous() {
		return salary*0.05;
	}
	
	

}
