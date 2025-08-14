package com.dev.onlineShoppingSystem;

public class ShoppingCart {
	String[] items = {"one", "two", "three"};
	
	public void add(String item) {
		System.out.println("item added");
	}
	
	public void remove(String item) {
		System.out.println("item removed");
	}
}
