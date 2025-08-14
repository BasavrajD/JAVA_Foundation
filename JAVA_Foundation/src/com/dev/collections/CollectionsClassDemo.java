package com.dev.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arl = new ArrayList<>();
		
		arl.add(21);
		arl.add(1);
		arl.add(021);
		arl.add(210);
		arl.add(201);
		arl.add(2121);
		arl.add(121);
		arl.add(66);
		
		//Collection has private constructor and all static methods hence we are accessing them like that
		System.out.println(arl);
		Collections.sort(arl);
		System.out.println(arl);
		
		Collections.reverse(arl);
		System.out.println(arl);
		
		Collections.shuffle(arl);
		System.out.println(arl);
		
		Collections.fill(arl, 999);
		System.out.println(arl);
		
		System.out.println(Collections.max(arl) + " " + Collections.min(arl));
		
		
		//check ArrayListEmp for comparator
		
		

	}

}
