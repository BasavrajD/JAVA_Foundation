package com.dev.oops;

public class UniversityEx {//constructor chaining example
	
	private String name;
	private int age;
	private String major;
	
	public UniversityEx() {
		System.out.println("default student");
	}
	public UniversityEx(String name) {
		this();
		this.name = name;
	}
	public UniversityEx(String name, int age) {
		this(name);
		this.age = age;
	}
	public UniversityEx(String name, int age, String major) {
		this(name, age);
		this.major = major;
	}
	
	public void view() {
		System.out.println(name + " " + age + " " + major);
	}
	
	

	public static void main(String[] args) {
		UniversityEx obj1 = new UniversityEx("Raj", 21, "IT");
		obj1.view();
		
		UniversityEx obj2 = new UniversityEx("Raj", 21);
		obj2.view();
		
		UniversityEx obj3 = new UniversityEx("Raj");
		obj3.view();
		
		UniversityEx obj4 = new UniversityEx();
		obj4.view();
	}

}
