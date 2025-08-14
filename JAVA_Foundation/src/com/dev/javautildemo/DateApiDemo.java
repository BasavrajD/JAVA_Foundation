package com.dev.javautildemo;

import java.util.Date;

public class DateApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println(now);
		
		Date sppecificDate = new Date(111111111111111L);//specific date in milliseconds
		System.out.println(sppecificDate);
		
		System.out.println(now.getDay());
		System.out.println(now.getMonth());
		System.out.println(now.getYear());
		System.out.println(now.getHours());
		System.out.println(now.getMinutes());
		System.out.println(now.getSeconds());
		System.out.println(now.getTime());
		System.out.println(now.getDate());
		
		//comparison
		System.out.println(now.after(sppecificDate));//checks if now is after specificDate
		System.out.println(now.before(sppecificDate));
		
	}

}
