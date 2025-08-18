package com.dev.exceptionHandling;

public class Student {
	
	private int sid;
	private String sname;
	private int m1;
	private int m2;
	private int m3;
	private int total;
	private double avg;
	
	
	public Student(int sid, String sname, int m1, int m2, int m3) {
		this.sid = sid;
		this.sname = sname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.total = this.m1 + this.m2 + this.m3;
		this.avg = this.total/3;
	}
	
	public void result() {
		System.out.println("total is: " + this.total);
		if(m1>35 && m2>35 && m3>35) {
			if(this.avg>= 60) System.out.println("first class");
			else if(this.avg >= 50 && this.avg < 60) System.out.println("second class");
			else if(this.avg >= 35 && this.avg <50) System.out.println("third class");
		}else {
			System.out.println("failed");
		}
	}


	public static void main(String[] args) {
		Student[] students = new Student[3];
		
		students[0] = new Student(111, "Raj", 70, 80, 90);
		students[1] = new Student(112, "Yash", 50, 52, 54);
		students[2] = new Student(113, "Max", 33, 37, 40);
		
		for(Student s: students) {
			s.result();
		}
	}

}
