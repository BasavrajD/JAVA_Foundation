package com.dev.javautildemo;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());//print current date and time
		
		cal.set(Calendar.YEAR, 2004);	
		cal.set(Calendar.MONTH, Calendar.APRIL);
		cal.set(Calendar.DAY_OF_MONTH, 10);
		System.out.println(cal.getTime());//you can also get only year, month etc inssid bracket
		
		//adding to the date
		cal.add(Calendar.YEAR, 5);
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.DAY_OF_MONTH, 22);
		System.out.println(cal.getTime());
		
		
	
	}

}
