package com.dev.modifiers;

//outer class
public class NestedClass {
	
	String msg = "Hello";
	
	//inner class
	public class InnerClass{
		public void print() {
			System.out.println("i am inner class method: "+ msg);
		}
	}
	
	//static inner class
	public static class StaticInnerClass{
		public void print() {
			System.out.println("i am a static inner class method");//using msg here gives error since its not static
		}
	}

	public static void main(String[] args) {
		
		NestedClass outer = new NestedClass();
		System.out.println(outer.msg);
		
		//calling inner class
		NestedClass.InnerClass obj = outer.new InnerClass();
		obj.print();
		
		//calling static inner class
		NestedClass.StaticInnerClass obj2 = new NestedClass.StaticInnerClass();
//		StaticInnerClass obj2 = new StaticInnerClass(); this also works since its same package
		obj2.print();
	}

}
