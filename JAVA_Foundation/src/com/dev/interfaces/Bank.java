package com.dev.interfaces;

public interface Bank {
	
	int minBalance = 1000; //static and final implicitly
	
	//abstract methods
	public void credit();
	public void debit();
	public void calcInterest();
	
	
	//METHODS allowed in interface
	//static method (we can't override static method too)
	public static void staticMethod() {
		System.out.println("i am a static method in interface");
	}
	
	//default method
	public default void defaultMethod() {
		System.out.println("i am a default method in interface");
	}

}
