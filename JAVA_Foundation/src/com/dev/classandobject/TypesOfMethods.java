package com.dev.classandobject;

public class TypesOfMethods {
	
	public int method1(int x, int y) {
		return x+y;
	}
	
	public void method2() {
		System.out.println("Method 2 output");
	}

	public void method3(String name) {
		System.out.println(name);
	}
	
	public String method4() {
		return "Deloitte 4";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypesOfMethods obj = new TypesOfMethods();
		
		System.out.println(obj.method1(0, 1));
		obj.method2();
		obj.method3("method 3 output");
		System.out.println(obj.method4());
		
	}

}
