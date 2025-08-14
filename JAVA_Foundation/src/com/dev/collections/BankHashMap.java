package com.dev.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class BankHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Customer, Account> custAccDetails = new HashMap<>(); //user defined reference data types in key value
		
		
		custAccDetails.put(new Customer(1111, "Raj"), new Account(123456, 100000.0));
		custAccDetails.put(new Customer(1122, "Yash"), new Account(98456, 500000.0));
		custAccDetails.put(new Customer(2222, "Alok"), new Account(142456, 1000000.0));
		custAccDetails.put(new Customer(3311, "Don"), new Account(123466, 1000.0));
		
//		System.out.println(custAccDetails);
		
		for(Entry<Customer, Account> cust: custAccDetails.entrySet()) {
			System.out.println(cust.getKey().getCustName() + " " + cust.getValue().getBalance());
			//or we can write 
			//Customer c = cust.getKey(); //and use c.getCustName() for readability.
		}

	}

}
