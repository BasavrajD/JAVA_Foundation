package com.dev.collections;

public class EmployeeDemo implements Comparable<EmployeeDemo>{
	int empId;
	String empName;
	int age;
	double salary;
	
	public EmployeeDemo(int empId, String empName, int age, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int compareTo(EmployeeDemo o) {
		if(this.empId > o.empId) return 1;
		else if(this.empId < o.empId) return -1;
		else return 0;
	}
	
	
	
}
