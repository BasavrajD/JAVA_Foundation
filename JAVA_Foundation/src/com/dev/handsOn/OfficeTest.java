package com.dev.handsOn;

public class OfficeTest {

	public static void main(String[] args) {
		OfficeManager emp1 = new OfficeManager("Raj", 10000.0, 15);
		emp1.calculateBous();
		System.out.println("manager salary: " + emp1.getSalary());
		System.out.println("manager bonus: " + emp1.calculateBous());

	}

}
