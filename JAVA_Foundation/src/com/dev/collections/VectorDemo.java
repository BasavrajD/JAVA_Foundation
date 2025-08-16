package com.dev.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Double> v =new Vector<>();
		
		v.add(12.45);
		v.addFirst(10.000);
		v.addLast(55555.5555555);
		v.add(3, 2.0);
		v.add(44.69);
		
		
		System.out.println(v);
		
		System.out.println(v.capacity()); //how many items can fit in the v before it full. once full new memory gets allocated.
		
		System.out.println(v.size());
		System.out.println(v.contains(2.0));
		
		v.remove(0);
		v.removeFirst();
		v.removeLast();
		
		System.out.println(v);
		System.out.println("******************");
		
		for(double d: v) {
			System.out.println(d);
		}
		

	}

}
