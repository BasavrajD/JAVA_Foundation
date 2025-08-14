package com.dev.oops;

public class ThisMethod {
	
//constructor chaining	
	int val1;
	int val2;
	
	public ThisMethod(int v1) {
		this.val1= v1;
		System.out.println("1C");
	}
	
	public ThisMethod(int v1, int v2) {
		this(v1); //invoke the constructor ThisMethod(int v1)
		this.val2= v2;
		System.out.println("2C" + val1 + " " + val2);
	}
	
	
//method chaining
	//non static method
	void display() {
		System.out.println("non static deloitte");
	}
	void invoke() {
		this.display(); // method chaining
		m1(); //no need of this since its static method
	}
	
	static void m1() {
		System.out.println("static deloitte");
	}
	
	
	public static void main(String[] args) {
		//method chaining 
//		ThisMethod obj = new ThisMethod();
//		obj.invoke();
		
		//constructor chaining 
		ThisMethod obj1 = new ThisMethod(1,2);

		
	}

}
