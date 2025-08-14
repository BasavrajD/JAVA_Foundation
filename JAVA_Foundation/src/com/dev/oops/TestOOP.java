package com.dev.oops;

public class TestOOP {//runner class

	public static void main(String[] args) {
		EmployeeOOP emp = new EmployeeOOP("Raj", 21, 600000);
		
//		emp.setEmpId(111);
//		emp.setEmpName("Raj");
//		emp.setAge(21);
//		
//		System.out.println(emp.getEmpId());
//		System.out.println(emp.getEmpName());
//		System.out.println(emp.getAge());
//		
		emp.viewDetails();
		
		//some other work
		System.out.println(emp.toString());
		System.out.println(emp.hashCode());//returns the numerical representation of an object in integer format
		
//		System.out.println(emp.getBonus());
	}

}
