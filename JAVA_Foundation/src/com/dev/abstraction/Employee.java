package com.dev.abstraction;

public abstract class Employee {
	private String name;
	private int id;
	
	public Employee(String name, int id) {

		this.name = name;
		this.id = id;
	}
	
	

	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}



	public void downloadPayslip() {
		System.out.println("pay slip downloaded");
	}
	
	abstract double calculateSalary();
}

class FTE extends Employee{
	
	private double monthlySalary;
	
	

	public FTE(String name, int id, double monthlySalary) {
		super(name, id);
		this.monthlySalary = monthlySalary;
	}



	@Override
	double calculateSalary() {
		return monthlySalary;
		
	}
	
}

class partTime extends Employee{
	
	private int hoursWorked;
	
	public partTime(String name, int id, int hoursWorked) {
		super(name, id);
		this.hoursWorked = hoursWorked;
	}

	@Override
	double calculateSalary() {
		return hoursWorked*1000;
		
	}
	
}
