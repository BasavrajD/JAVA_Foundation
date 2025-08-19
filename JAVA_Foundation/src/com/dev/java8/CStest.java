package com.dev.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CStest {

	public static void main(String[] args) {
		
		List<CScustomer> custList = new ArrayList<CScustomer>();
		custList.add(new CScustomer(123, "Raj", 500));
		custList.add(new CScustomer(223, "Max", 50));
		custList.add(new CScustomer(923, "Don", 1000));
		custList.add(new CScustomer(713, "John", 550));
		custList.add(new CScustomer(683, "Yash", 20));
		custList.add(new CScustomer(333, "Prasad", 3));
		custList.add(new CScustomer(159, "Alok", 555));
		custList.add(new CScustomer(111, "Abhi", 159));
		custList.add(new CScustomer(777, "Kiran", 575));
		custList.add(new CScustomer(842, "Chintu", 609));
		
		List<CSlocation> locList = new ArrayList<CSlocation>();
		locList.add(new CSlocation(951, "Mumbai", "Raj"));
		locList.add(new CSlocation(551, "Nashik", "Smith"));
		locList.add(new CSlocation(254, "Nagpur", "Max"));
		locList.add(new CSlocation(753, "Kolhapur", "Jacob"));
		locList.add(new CSlocation(456, "Pune", "Yash"));
		locList.add(new CSlocation(654, "Mumbai", "Jamal"));
		locList.add(new CSlocation(157, "Mumbai", "Alok"));
		locList.add(new CSlocation(953, "Pune", "Chintu"));
		
		//1.sort by customer id - cid
		custList.stream().sorted(Comparator.comparingInt(CScustomer::getCid)).forEach(System.out::println);
		
		System.out.println("*********************************************");
		
		//2.sort by location name - lName
		locList.stream().sorted(Comparator.comparing(CSlocation::getlName)).forEach(System.out::println);
		
		System.out.println("*********************************************");
		
		//3.sum of total cost
		long sum = custList.stream().mapToInt(c -> c.gettCost()).sum();
		System.out.println("Sum of total costs of all customers is: " + sum);
		
		System.out.println("*********************************************");
		
		//4.where customer names are equal in both customer and location classes;
//		CSlocation obj = new CSlocation();
//		custList.stream().filter(c -> c.getcName().equals(obj.getcName())).forEach(n -> System.out.println(n));

		custList.stream().forEach(c -> locList.stream().filter(l -> l.getcName().equals(c.getcName()))
				.forEach(l -> System.out.println("Customer: " + c.getcName() + ", Location: " + l.getlName())));
		
		System.out.println("*********************************************");
		
		//5.grouping by first character of customer name
		Map<String, List<CScustomer>> mp = custList.stream().collect(Collectors.groupingBy(CScustomer::getcName));
		mp.forEach((k,v) -> System.out.println(k.charAt(0) + " " + v));
		
		System.out.println("*********************************************");
		
		//6.grouping by first character of location name
		Map<String, List<CSlocation>> mp2 = locList.stream().collect(Collectors.groupingBy(CSlocation::getlName));
		mp2.forEach((k,v) -> System.out.println(k.charAt(0) + " " + v));
		
		
		
		

	}

}
