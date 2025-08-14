package com.dev.stringReference;

public class StringBufferBuilder {

	public static void main(String[] args) {
		
		StringBuffer strBuffer = new StringBuffer("Welcome");
		System.out.println(strBuffer.append(" Deloitte")); //mutable, no need to crete new object or reassign
		
		StringBuilder strBuilder = new StringBuilder("Welcome");
		System.out.println(strBuilder.append(" Deloitte"));

		System.out.println(strBuilder.reverse());
	}

}
