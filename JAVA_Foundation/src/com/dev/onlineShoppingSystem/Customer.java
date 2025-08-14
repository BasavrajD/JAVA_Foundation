package com.dev.onlineShoppingSystem;

public class Customer {
	
	static String name;
	String address;
	
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void login() {
		System.out.println("logged in");
		System.out.println(name);
	}
	public void logout() {
		System.out.println("logged out");
	}
	public void selectProduct(String productName) {
		System.out.println("product selected");
	}
}
