package com.dev.oops;

class A{
	int i = 10;
	
	public A() {
		System.out.println("default constructor of class A");
	}
	public void parentMethod() {
		System.out.println("Class A - parent");
	}
}

class B extends A{
	int j = 20;
	
	public B() {
		super();//call the constructor of parent class
		System.out.println("default constructor of class B");
	}
	public void childMethod() {
		parentMethod();//can also do this
		System.out.println("Class B - child");
	}
	public void addition() {
		System.out.println(i+j);
	}
}


public class Inheritance {

	public static void main(String[] args) {
		B objB = new B();
		objB.childMethod();
		objB.parentMethod();
		objB.addition();
		//objB.toString() -- multilevel I as Object class <-- A <-- B

	}

}
