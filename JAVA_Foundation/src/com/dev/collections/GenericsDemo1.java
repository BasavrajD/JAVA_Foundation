package com.dev.collections;


class Container<T>{ //allows any type of  data type, also user defined
	T var;
	
	public void display() {
		System.out.println(var);
	}
	
	public T getVar() {
		return var;
	}
	
	public void setVar(T var) {
		this.var = var;
		
	}
}

//restricted data type allowed (only integrals)
class ContainerNumber<T extends Number>{ //Number has int, float, ....
	T var;
	
	public void display() {
		System.out.println(var);
	}
	
	public T getVar() {
		return var;
	}
	
	public void setVar(T var) {
		this.var = var;
	}
		
	
}


public class GenericsDemo1 {

	public static void main(String[] args) {
		Container<Integer> obj = new Container<>();
		obj.setVar(100);
		System.out.println(obj.getVar());
		obj.display();
		
		System.out.println("***************");
		
		Container<String> obj1 = new Container<>();
		obj1.setVar("hundred");
		System.out.println(obj1.getVar());
		obj1.display();
		
		System.out.println("****************");
		
		Container<EmployeeDemo> obj2 = new Container<>();
		EmployeeDemo emp1 = new EmployeeDemo(111, "Raj", 21, 5000.0);
		obj2.setVar(emp1);
		EmployeeDemo var2 = obj2.getVar();
		System.out.println(var2.empName);
		obj2.display();
		
		System.out.println("--------------------");
		
		ContainerNumber<Integer> intObj = new ContainerNumber<>(); //also can do the same for double 
		intObj.setVar(55);
		System.out.println(intObj.getVar());
		intObj.display();
		
		//but if you try to do this string or any user defined class like EmployeeDemo it gives error because its not extending the number class
		


	}
}
