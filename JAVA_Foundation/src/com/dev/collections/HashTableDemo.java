package com.dev.collections;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> marks = new Hashtable<>();
		marks.put("Maths", 90);
		marks.put("Comps", 70);
		marks.put("Marathi", 99);
		marks.put("English", 80);
		marks.put("Science", 97);
		
		System.out.println(marks); //unordered and unsorted
		System.out.println(marks.get("Comps"));
		
		//we cannot use iterator in maps
		//hence we use for each 
		for(Entry<String, Integer> mark: marks.entrySet()) {
			System.out.println(mark.getKey() + " " + mark.getValue());
		}
		
	}

}
