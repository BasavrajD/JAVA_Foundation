package com.dev.java8;


interface In2{
	public double area(int r);
}

public class AreaExercise {

	public static void main(String[] args) {
		
		//area of circle
		In2 i1 = (r) -> {
			return 3.142 * r * r;
		};
		System.out.println("Area of circle is: "+ i1.area(5));
		
		//area of rectangle
//		In2 i1 = (l,b) -> {
//			return l*b;
//		};
//		System.out.println("Area of rectangle is: "+ i1.area(5, 3));

	}

}
