package com.dev.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListEmp {

	public static void main(String[] args) {
		
		ArrayList<EmployeeDemo> arrEmp = new ArrayList<>();
		
		EmployeeDemo emp1 = new EmployeeDemo(111, "Raj", 21, 5000.0);
		EmployeeDemo emp2 = new EmployeeDemo(212, "Taj", 31, 6000.0);
		EmployeeDemo emp3 = new EmployeeDemo(113, "Baj", 41, 7000.0);
		EmployeeDemo emp4 = new EmployeeDemo(114, "Maj", 21, 5000.0);
		EmployeeDemo emp5 = new EmployeeDemo(115, "Naj", 31, 6000.0);
		EmployeeDemo emp6 = new EmployeeDemo(116, "Saj", 41, 7000.0);
		
		arrEmp.add(emp1);
		arrEmp.add(emp2);
		arrEmp.add(emp3);
		arrEmp.add(emp4);
		arrEmp.add(emp5);
		arrEmp.add(emp6);
		
		System.out.println(arrEmp);//printing the reference id of each
		
		Iterator<EmployeeDemo> it = arrEmp.iterator();
		while(it.hasNext()) {
			EmployeeDemo next = it.next();
			System.out.println(next.empId);
			System.out.println(next.empName);
			System.out.println(next.age);
			System.out.println(next.salary);
		}
		
		System.out.println("***********************");
		
		////COMPARATOR interface sorting
		//we cant do here collections.sort(arrEmp)
		
		Comparator<EmployeeDemo> comp = new Comparator<EmployeeDemo>() 
		{

			@Override
			public int compare(EmployeeDemo o1, EmployeeDemo o2) {
				return o1.empName.compareTo(o2.empName); //compareTo from String class
			}
			
		};
		
		//now we can do sorting 
		Collections.sort(arrEmp, comp);
		
		for(EmployeeDemo emp: arrEmp) {
			System.out.print(emp.empName + " ");
		}
		System.out.println();
		System.out.println("******************");
		
		
		
		
		
		
		
		////COMPARABLE interface sorting
		arrEmp.sort(new SortByEmpId()); //see file SortByEmpId, also we have override the compareTo in EmployeeDemo
		Iterator<EmployeeDemo> it2 = arrEmp.iterator();
		while(it2.hasNext()) {
			EmployeeDemo next = it2.next();
			System.out.print(next.empName);
			System.out.print(" ");
			System.out.print(next.empId);
			System.out.println("");
		}
		
		
		
		
		
	}

}
