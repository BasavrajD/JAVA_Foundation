package com.dev.abstraction;

public class TestEmployee {

	public static void main(String[] args) {
		FTE emp1 = new FTE("Raj", 11, 50000);
		System.out.println(emp1.calculateSalary());
		emp1.downloadPayslip();
		
		partTime emp2 = new partTime("yash", 22, 10);
		System.out.println(emp2.calculateSalary());

	}

}
