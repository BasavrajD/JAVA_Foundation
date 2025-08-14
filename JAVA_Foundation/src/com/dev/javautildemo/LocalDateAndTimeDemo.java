package com.dev.javautildemo;

import java.time.LocalDateTime;//latest versions introduced after java 8
import java.time.format.DateTimeFormatter;

public class LocalDateAndTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime of = LocalDateTime.of(2004, 10, 4, 12, 32, 40);
		System.out.println(of);
		
//		now.plusDays(5);
		System.out.println(now.plusDays(5));
		System.out.println(now.plusWeeks(2));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String format = now.format(formatter);
		System.out.println(format);
		
		System.out.println(now.isAfter(of));
		System.out.println(now.isBefore(of));

	}

}
