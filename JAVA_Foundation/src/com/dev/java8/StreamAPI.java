package com.dev.java8;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		List<StreamAPIcustomer> custList = new ArrayList<StreamAPIcustomer>();
		custList.add(new StreamAPIcustomer(5, "Raj", "male", "basic", "borivali"));
		custList.add(new StreamAPIcustomer(3, "Yash", "male", "prime", "borivali"));
		custList.add(new StreamAPIcustomer(4, "Maxy", "female", "prime", "bandra"));
		
		custList.stream().sorted(Comparator.comparingLong(StreamAPIcustomer::getId)).forEach(System.out::println);
		
		System.out.println("************************************************************************************");
		
		custList.stream().filter(c -> c.getType().equals("prime")).forEach(System.out::println);
		
		System.out.println("************************************************************************************");
		
		List<StreamAPIcustomer> c1 = custList.stream().filter(c -> c.getBranch().equals("bandra")).collect(Collectors.toList());
		System.out.println(c1);
		
		System.out.println("************************************************************************************");
		
		Map<String, List<StreamAPIcustomer>> cg = custList.stream().collect(Collectors.groupingBy(StreamAPIcustomer::getType));
		cg.forEach((accType, customerList) -> {
			System.out.println(accType);
			customerList.forEach(System.out::println);
		});

	}

}
