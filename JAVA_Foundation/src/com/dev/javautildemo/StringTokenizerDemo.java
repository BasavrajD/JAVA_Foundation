package com.dev.javautildemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		String str = "Welcome to Deloitte !!";
		StringTokenizer tokens = new StringTokenizer(str);//space is considered default delimiter
		System.out.println("total tokens: " + tokens.countTokens());
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
		System.out.println("************************");
		
		StringTokenizer tokens1 = new StringTokenizer(str, "e");//e is delimiter but not included in tokens
		System.out.println("total tokens: " + tokens1.countTokens());
		while(tokens1.hasMoreTokens()) {
			System.out.println(tokens1.nextToken());
		}
		System.out.println("************************");
		
		StringTokenizer tokens2 = new StringTokenizer(str, "e", true);//e is delimiter and tokens include e
		System.out.println("total tokens: " + tokens2.countTokens());
		while(tokens2.hasMoreTokens()) {
			System.out.println(tokens2.nextToken());
		}
		System.out.println("************************");
		
		
		
		

	}

}
