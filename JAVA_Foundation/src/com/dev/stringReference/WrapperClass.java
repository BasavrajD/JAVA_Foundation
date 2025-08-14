package com.dev.stringReference;

public class WrapperClass {

	public static void main(String[] args) {
		int i = 10;
		
		Integer i1 = new Integer(i);//i1 is an object - boxing / autoboxing
		System.out.println(i1.toString()); //converting int to string
		//toString comes from Object class to Integer class, Integer class overrides it.
		
		int i2 = i1;//unboxing---OR int i2 = i1..intValue();
		System.out.println(i2);
		
		int x = Integer.parseInt("1234");//string should have only digits or gives number format runtimr exception
		System.out.println(x);
	}

}
