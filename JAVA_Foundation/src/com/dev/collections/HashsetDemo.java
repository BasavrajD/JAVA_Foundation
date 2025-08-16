package com.dev.collections;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(11);
		hs.add(15);
		hs.add(20);
		
		System.out.println(hs);//order of insertion is not maintained
		
		System.out.println(hs.size());
		System.out.println(hs.contains(22));
		
		hs.remove(14);//apparently gives no error 
		hs.remove(10);
		System.out.println(hs);
		
	
		System.out.println(hs.clone());//returns shallow copy
		
		
		

	}

}
