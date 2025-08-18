package com.dev.exceptionHandling;

public class MyException extends Exception{

	//constructor
	public MyException(int age) {
		System.err.println("Not eligible at: " + age);
	}
}
