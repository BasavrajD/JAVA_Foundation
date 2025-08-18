package com.dev.java8;

import java.util.ArrayList;
import java.util.List;

interface In1{
	public int show(int a, int b);
}

public class LambdaDemo {

	public static void main(String[] args) {
		
		//forEach loop
		List<String> ls = new ArrayList<String>();
		
		ls.add("one");
		ls.add("two");
		ls.add("three");
		ls.add("four");
		ls.forEach((n) -> System.out.println(n));
		
		//Lambda expr with multiple args
//		In1 i1 = (a, b) -> {
//			return a+b;
//		};
//		System.out.println(i1.show(5, 2));
//		
//		In1 i2 = (a,b) -> (a+b); //without writing return keyword
//		System.out.println(i2.show(3, 17));
		
		//Lambda expr with one Int arg
//		In1 i1 = (id) -> {
//			return id;
//		};
//		System.out.println(i1.show(52));
		
		
		//Lambda expr with one String arg
//		In1 i1 = (name) -> {
//			return "Hello " + name;
//		};
//		System.out.println(i1.show("Raj"));
		
		//Lambda expr with no args
//		In1 i1 = () -> {
//			return "Hello Veera";
//		};
//		System.out.println(i1.show());
		
		
//		int amt = 999;
		//anonymous function
//		In1 i1 = new In1() {
//
//			@Override
//			public void show() {
//				System.out.println("Amount to be paid: " + amt);
//			}
//			
//		};
		
		
		

	}

}
