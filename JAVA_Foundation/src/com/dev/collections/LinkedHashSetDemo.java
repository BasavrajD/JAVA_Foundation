package com.dev.collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		lhs.addFirst(10);
		lhs.addLast(10);//doesn't save duplicates
		lhs.add(20);
		lhs.add(14);//adds at last
		lhs.addLast(55);
		
		System.out.println(lhs);
		
		System.out.println(lhs.getFirst());
		System.out.println(lhs.getLast());
		System.out.println(lhs.getClass());
	}

}
