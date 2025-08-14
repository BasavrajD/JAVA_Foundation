package com.dev.oops;

public class ODAccInheritance extends AccountInheritance{
	
	private double overDraftLimit;

	public ODAccInheritance(String accountNumber, double balance, double overDraftLimit) {
		super(accountNumber, balance);
		this.overDraftLimit = overDraftLimit;
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount > 0 && amount <= getBalance()+overDraftLimit) {
			super.withdraw(amount);//calling the method in super class
		}
	}

	
	
}
