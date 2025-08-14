package com.dev.onlineShoppingSystem;

public class Product {
	String name;
	int price;
	int quantityAvailable;
	
	public void order() {
		System.out.println("ordered");
	}
	
	public void changePrice() {
		System.out.println("price changed");
	}
}
