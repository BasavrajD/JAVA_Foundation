package com.dev.collections;

class GenericsClass<T>{//T here represents the type, <> represents type safety
	public void display(T a, T b) {
		System.out.println("the output is: " + a + b);
	}
}


interface GenericInterface<T>{
	T concat(T a, T b);
}

class TestGenInterface implements GenericInterface<Integer>{

	@Override
	public Integer concat(Integer a, Integer b) {
		return a+b;
	}
	
}

class TestGenInterfaceString implements GenericInterface<String>{

	@Override
	public String concat(String a, String b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}

class TestGenInterfaceEmp implements GenericInterface<EmployeeDemo>{

	@Override
	public EmployeeDemo concat(EmployeeDemo a, EmployeeDemo b) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

public class GenericsDemo {

	public static void main(String[] args) {
		
		GenericsClass<Integer> obj = new GenericsClass<>();
		obj.display(10, 10);
		
		GenericsClass<String> obj1 = new GenericsClass<>();
		obj1.display("one", "two");
		
		TestGenInterface obj2 = new TestGenInterface();
		System.out.println(obj2.concat(10, 20));
		
		TestGenInterfaceString obj3 = new TestGenInterfaceString();
		System.out.println(obj3.concat("aaa","bbb"));
		
		EmployeeDemo emp1 = new EmployeeDemo(111, "Raj", 21, 5000.0);
		EmployeeDemo emp2 = new EmployeeDemo(212, "Taj", 31, 6000.0);
		TestGenInterfaceEmp obj4 = new TestGenInterfaceEmp();
		
		System.out.println(obj4.concat(emp1, emp2));

	}

}
