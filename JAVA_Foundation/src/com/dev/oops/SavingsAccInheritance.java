package com.dev.oops;

public class SavingsAccInheritance extends AccountInheritance {

	private double interestRate;
	
	
	public SavingsAccInheritance(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}


	public double getInterestRate() {
		return interestRate;
	}
	
	public void addInterest() {
		double interest = getBalance() * interestRate/100; //you should use this.interestRate() if same name variable in parent class and you want to use the one in child class or super.
		deposit(interest);
	}

}
