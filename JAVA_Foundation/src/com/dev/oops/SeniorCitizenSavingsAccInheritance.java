package com.dev.oops;

public class SeniorCitizenSavingsAccInheritance extends SavingsAccInheritance {

	private double additionInterest;
	
	public SeniorCitizenSavingsAccInheritance(String accountNumber, double balance, double interestRate, double additionInterest) {
		super(accountNumber, balance, interestRate);
		this.additionInterest = additionInterest;
	}
	
	public void scInterest() {
		double interest = getBalance() * (additionInterest/100);
		deposit(interest);
	}

}
