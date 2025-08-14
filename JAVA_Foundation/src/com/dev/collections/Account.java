package com.dev.collections;

public class Account {
	
	private int accNo;
	private double balance;
	public Account(int accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
