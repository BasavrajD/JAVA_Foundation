package com.dev.exceptionHandling;
import java.lang.Exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
//			int i=8, j=0, k;
//			k = i/j;
//			System.out.println(k); // Arithmetic exception
			
//			String s = null;
//			System.out.println(s.length()); //NullPointer Exception
			
//			int arr[] = {1,2,3,4};
//			System.out.println(arr[4]); //ArrayIndexOutOfBounds Exception
			
			String name = "Raj";
			int n = Integer.parseInt(name); //NumberFormat Exception
			
			//if a subclass is missing then its exception is handled by superclass at the end- Exception(catch 5)
			
		}catch(ArrayIndexOutOfBoundsException n){
			n.printStackTrace();//maintains the stack of exceptions
			System.out.println("catch 1");
		}catch(NullPointerException n) {
			n.printStackTrace();//maintains the stack of exceptions
			System.out.println("catch 2");
		}catch(ArithmeticException n) {
			n.printStackTrace();//maintains the stack of exceptions
			System.out.println("catch 3");
		}catch(NumberFormatException n) {
			n.printStackTrace();//maintains the stack of exceptions
			System.out.println("catch 4");
		}catch(Exception n) {
			n.printStackTrace();//maintains the stack of exceptions
			System.out.println("catch 5");
		}finally {
			System.out.println("finally.");
		}

	}

}
