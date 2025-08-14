package com.dev.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class GenericBoundDemo {
	
	
	public static void sample(Collection<? super Integer> collection) {//lower bound restrictions
		//we can parse integer and Number (because Number is a super class)
		
		
	}
	
	public static void sample1(Collection<? extends Number> collection) {//upper bound restrictions
		//we can parse any class extending Number
		
		
	}
//we can also use classes in the place of Number, Integer ....
	//public static void studentMethod(Collection<? extends Student> collection){} //rn i dont have Student class hence not executing 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sample(new ArrayList<Integer>());
		sample(new ArrayList<Number>());
		sample(new ArrayList<Object>());
		//sample(new ArrayList<double>());
		//sample(new ArrayList<String>());
		//both double and String throws error double is not super to the integer
		//any super class to integer are allowed 
		//Object<--Number<--Integer hence Object class also allowed
		
		
		sample1(new LinkedList<Integer>());
		sample1(new LinkedList<Double>());
		sample1(new LinkedList<Long>());//Boolean String Object class will not work here
		
	}

}
