package com.dev.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Transaction{
	private String type;
	private double amount;
	public Transaction() {
		super();
	}
	public Transaction(String type, double amount) {
		super();
		this.type = type;
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public double getAmount() {
		return amount;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [type=" + type + ", amount=" + amount + "]";
	}
	
}

public class PredicateDemo {

	public static void main(String[] args) {
		List<Transaction> trans = Arrays.asList(new Transaction("credit", 5000), new Transaction("debit", 200), new Transaction("credit", 9000), 
				new Transaction("debit", 2000), new Transaction("credit", 500) );
		
		Predicate<Transaction> ct = tran -> tran.getType().equals("credit");
		List<Transaction> ct1 = trans.stream().filter(ct).collect(Collectors.toList());
		System.out.println(ct1);
		
	}

}
