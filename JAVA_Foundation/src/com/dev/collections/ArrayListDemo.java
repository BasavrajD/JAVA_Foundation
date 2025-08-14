package com.dev.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> s1 = new ArrayList<>();
		
		s1.add("one");
		s1.add("two");
		s1.add("three");
		
		System.out.println(s1.size());
		System.out.println(s1);
		
		System.out.println(s1.indexOf("two"));
		
		System.out.println(s1.isEmpty());
		
		s1.add(1, "meow");
		System.out.println(s1);
		
		s1.remove(0);
		System.out.println(s1);
		System.out.println("***********");
		
		//normal printing just values
		int i=0;
		while(i<s1.size()) {
			System.out.println(s1.get(i));
			i++;
		}
		
		System.out.println("***********");
		
		//printing just values using enhanced/for each/advanced for loop
		for(String s: s1) {
			System.out.println(s);
		}
		
		System.out.println("***********");
		
		//using iterator printing values
		Iterator<String> iterator = s1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		

	}

}
