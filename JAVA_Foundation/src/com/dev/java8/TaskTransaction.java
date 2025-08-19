package com.dev.java8;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Transaction1 {
    private String type;
    private double amount;

    public Transaction1() {}
    public Transaction1(String type, double amount) {
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
        return "Transaction [amount=" + amount + "]";
    }
}

class PredicateTn{
	public static Predicate<Transaction1> isCredit(){
		return tran -> tran.getType().equals("credit");
	}
	public static Predicate<Transaction1> isDebit(){
		return tran -> tran.getType().equals("debit");
	}
}

public class TaskTransaction {

	public static void main(String[] args) {
		List<Transaction1> transactions = Arrays.asList(
				new Transaction1("credit", 500.0),
				new Transaction1("credit", 200.0),
				new Transaction1("debit", 300.0),
				new Transaction1("credit", 100.0),
				new Transaction1("debit", 200.0));
		
		Map<String, List<Transaction1>> mp = new HashMap<>();//transactions.stream().collect(Collectors.groupingBy(Transaction1::getType));
		mp.put("credit", transactions.stream().filter(PredicateTn.isCredit()).collect(Collectors.toList()));
		mp.put("debit", transactions.stream().filter(PredicateTn.isDebit()).collect(Collectors.toList()));

		System.out.println(mp);
		System.out.println("******************************");
		
		List<Transaction1> credits = mp.get("credit");
		List<Transaction1> debits = mp.get("debit");
		
		System.out.println("credit transactions: " + credits);
		System.out.println("debit transactions: " + debits);		
		
	}
}
