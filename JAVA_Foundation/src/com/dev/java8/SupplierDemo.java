package com.dev.java8;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> otpGen = () -> {
			String otp = "";
			for(int i=1; i<=6; i++) {
				otp = otp + (int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(otpGen.get());
		
		//something extra
		Random r = new Random();
		System.out.println(r.nextInt(10000));

	}

}
