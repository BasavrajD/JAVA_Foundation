package com.dev.collections;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> tr = new TreeSet<>();
		
		tr.add(100);
		tr.add(200);
		tr.add(300);
		
		System.out.println(tr);
		
		tr.add(1000);
		tr.add(50);
		tr.add(70);
		
		System.out.println(tr);
		
		for(int i: tr) {
			System.out.println(i);
		}

	}

}
