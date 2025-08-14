package com.dev.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> marks = new LinkedHashMap<>();
		marks.put("Maths", 90);
		marks.put("Comps", 70);
		marks.put("Marathi", 99);
		marks.put("English", 80);
		marks.put("Science", 97);
		
		System.out.println(marks); //unsorted, order of insertion is maintained 
		System.out.println(marks.get("Comps"));
		
		//we cannot use iterator in maps
		//hence we use for each 
		for(Entry<String, Integer> mark: marks.entrySet()) {
			System.out.println(mark.getKey() + " " + mark.getValue());
		}

	}

}
