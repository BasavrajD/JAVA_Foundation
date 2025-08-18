package com.dev.exceptionHandling;

public class MyExceptionDemo {
	
	public void show(int age) throws MyException {
		if(age >= 60) throw new MyException(age);
		else System.out.println("Eligible at: " + age);
	}

	public static void main(String[] args) {
		int i=60;
		MyExceptionDemo obj = new MyExceptionDemo();
		
		try {
			obj.show(i);
		}catch(MyException m){
			m.printStackTrace();
		}finally {
			System.out.println("finally");
		}

	}

}
