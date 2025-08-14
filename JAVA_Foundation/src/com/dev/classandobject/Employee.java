package com.dev.classandobject;

public class Employee {
	//attributes
	
	int empId;     //instance variables
	String empName;
	
	//Method
	public void viewEmpDetails() {// non static methods
		System.out.println(empId + ":" + empName);
	}
	
//	public static void main(String[] args) {
//		Employee emp = new Employee();
//		
//		//setting the values to class variables using a reference variable which is object
//		emp.empId = 111; 
//		emp.empName = "TOM"; 
//		System.out.println(emp.empId);
//		System.out.println(emp.empName);
//	}
	
}
