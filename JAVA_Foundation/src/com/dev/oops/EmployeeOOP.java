package com.dev.oops;

import java.util.Objects;

public class EmployeeOOP {//development class
	private int empId;
	private String empName;
	private int age;
	private int salary;
	
	public EmployeeOOP() {
		empId = 111;
	}
	
	public EmployeeOOP(String empName, int age, int salary) {
//		super();
//		this.empId = empId;
		this();//constructor chaining, this loc invokes the no args constructor above
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void viewDetails() {
		System.out.println(empId + ", " + empName + ", " + age + ", " + salary);
	}
	
	public double getBonus() {
		if(this.salary <= 500000) {
			return this.salary*0.02;
		}else if(this.salary > 500000 && this.salary <= 800000) {
			return this.salary*0.05;
		}else {
			return this.salary*0.06;
		}
	}

	//some other work
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId+ " " + empName + " "+ age + " " + salary;
	}

	@Override
	public int hashCode() {
		//return Objects.hash(empId); returns hashcode of empId
		return empId;
//		return Objects.hash(empId, empName);
		//return empId*20 + empName.hashCode();// custom hashcode
	}
	
	
	
	
	
}
