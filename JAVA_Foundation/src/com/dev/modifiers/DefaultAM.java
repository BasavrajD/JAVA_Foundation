package com.dev.modifiers;

//default class
class Demo{
	
	//default constructor
	Demo(){
		System.out.println("Default constructor");
	}
	
	//default var
	int var;
	
	//default non static method
	void method1() {
		System.out.println("default non static method in default class");
	}
	
	//default static method
	static void method2() {
		System.out.println("default static method in default class");//var gives error here
	}
	
}

public class DefaultAM {

	public static void main(String[] args) {
		//cant access below code in any other file outside the package
		Demo demoObj = new Demo();
		demoObj.var = 11;
		demoObj.method1();
		Demo.method2(); 

	}

}
