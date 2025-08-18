package com.dev.exceptionHandling;

class InvalidNameExcep extends Exception{
	public InvalidNameExcep(String eName) {
		super(eName);
	}
}

public class CustomExcep {
	
	public static void validName(String eName) {
		try {
			if(eName.length() < 3) {
				throw new InvalidNameExcep("You entered invalid name");
			}else {
				System.out.println("Hello: " + eName);
			}
		}catch(InvalidNameExcep i) {
//			System.out.println("reached catch");
			System.out.println(i.getMessage()); // another way similar to printStackTrace
		}
	}

	public static void main(String[] args) {
//		validName("Raj");
		validName("Ra");

	}

}
