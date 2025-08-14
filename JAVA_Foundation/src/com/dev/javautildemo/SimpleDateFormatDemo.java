package com.dev.javautildemo;

import java.text.SimpleDateFormat;//not from util package
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdObj = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String formatedDate = sdObj.format(new Date());//formats the new date in our specified format above
		System.out.println(formatedDate);
		
		
	}

}
