package com.dev.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraysAsList {

	public static void main(String[] args) {
		//Array as a list -- list methods can be used on array like get,set,contains etc but size is fixed, we cannot add or remove element.
		List<String> sList = Arrays.asList("USA","India", "China", "Japan", "Brazil", "Russia", "South Africa", "Cuba", "USA", "China" ); //2 duplicates 
		List<Integer> nList = Arrays.asList(12,64,3, 9,1,3,99,4,6,27);
		
		//copying list elements to set -- avoiding duplicates
		Set<String> sSet = new HashSet<>();
		sList.forEach(s -> sSet.add(s));
		System.out.println(sSet);
		
		
		//sorted based on number of characters
		sList.stream().sorted((n1,n2) -> n1.length() > n2.length() ? 1 : n1.length() < n2.length() ? -1: 0).forEach(System.out::println);

		System.out.println("************************************************************************************");
		
		//second largest in nList
		int secLargest = nList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secLargest);
		
		System.out.println("************************************************************************************");

		//k,v pairs of first char of string with the original string.
		Map<Character, List<String>> mp = sList.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
		mp.forEach((k,v) -> System.out.println(k + " " + v)); //observe-- China and Cuba are chained together
		
		System.out.println("************************************************************************************");
		
		//sum of even numbers in nList
		long evenSum = nList.stream().filter(n -> n%2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println(evenSum);
		
		System.out.println("************************************************************************************");

		//any string in sList that contains i
		sList.stream().filter(s -> s.contains("i")).forEach(System.out::println);
		
		System.out.println("************************************************************************************");

		
	}

}
