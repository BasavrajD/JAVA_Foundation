package com.dev.javautildemo;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateDemo {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfMonth());
		
		
		System.out.println(today.plusWeeks(2));
		System.out.println(today.minusMonths(1));
		
		LocalDate of = LocalDate.of(1999, 6, 1);
		System.out.println(of);//prints specific date
		
		
		//LocalTimeDemo
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour() +" "+ time.getMinute() +" "+ time.getSecond());
		
		LocalTime noon = LocalTime.of(12,0);
		System.out.println(noon);
		
		LocalTime lunch = LocalTime.of(13,30);
		System.out.println(lunch);
		
		System.out.println(time.plusHours(3));
		System.out.println(time.minusHours(2));
		
		System.out.println(time.isAfter(lunch));
		System.out.println(time.isBefore(noon));
	}

}
