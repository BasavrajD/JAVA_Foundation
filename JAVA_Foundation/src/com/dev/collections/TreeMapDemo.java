package com.dev.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> marks = new TreeMap<>();
		marks.put("Maths", 90);
		marks.put("Comps", 70);
		marks.put("Marathi", 99);
		marks.put("English", 80);
		marks.put("Science", 97);
		
		System.out.println(marks); //sorted order by key
	
		System.out.println(marks.get("Comps"));
		
		//we cannot use iterator in maps
		//hence we use for each 
		for(Entry<String, Integer> mark: marks.entrySet()) {
			System.out.println(mark.getKey() + " " + mark.getValue());
		}

	}

}
