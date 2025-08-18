package com.dev.exceptionHandling;

public class Employee {
	
	private int eid;
	private String eName;
	private double basic;
	private double hra;
	private double ta;
	private double da;
	private double gross;
	
	//haven't added getters since we don't need them for this problem

	public Employee(int eid, String eName, double basic) {
		this.eid = eid;
		this.eName = eName;
		this.basic = basic;
		this.hra = this.basic * 0.12;
		this.ta = this.basic * 0.08;
		this.da = this.basic * 0.1;
		this.gross = this.basic + this.hra + this.ta + this.da;
	}
	
	public void grade() {
		System.out.println(eName);
		if(gross >= 25000.0) System.out.println("grade A");
		else if(gross >= 10000.0 && gross < 25000.0) System.out.println("grade B");
		else if(gross < 10000.0) System.out.println("grade C");
	}



	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		
		emps[0] = new Employee(111, "Raj", 25000.0);
		emps[1] = new Employee(112, "Yash", 10000.0);
		emps[2] = new Employee(113, "Max", 5000.0);
		
		for(Employee e: emps) {
			e.grade();
		}

	}

}
