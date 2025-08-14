package com.dev.oops;

public class BankExercise {

	private String custName;
	private int deposit;
	
	public BankExercise(){
		System.out.println("account created");
	}
	
	public BankExercise(String name) {
		this();
		this.custName = name;
		System.out.println("1C");
	}
	
	public BankExercise(String name, int amount) {
		this();
		this.custName = name;
		this.deposit = amount;
		System.out.println("2C");
	}
	
	public static void main(String[] args) {
		BankExercise obj = new BankExercise("Raj", 500000);
	}
}
