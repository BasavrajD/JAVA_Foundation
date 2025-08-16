package com.dev.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<>();
		
		ls.add(12);
		ls.add(10);
		ls.add(0);
		
		System.out.println(ls);
		
		ls.addFirst(14);
		ls.addLast(20);
		ls.add(1, 5);
		
		System.out.println(ls);
		
		ls.remove();//removes first
		System.out.println(ls);
		
		ls.remove(1);//removes at index
		System.out.println(ls);
		
		ls.removeFirst();
		ls.removeLast();
		System.out.println(ls);
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		System.out.println("*************");
		
		for(int i: ls) {
			System.out.println(i);
		}
		
		System.out.println("*************");
		
		LinkedList<EmployeeDemo> lsEmp = new LinkedList<>();
		
		EmployeeDemo emp1 = new EmployeeDemo(111, "Raj", 21, 5000.0);
		EmployeeDemo emp2 = new EmployeeDemo(212, "Taj", 31, 6000.0);
		EmployeeDemo emp3 = new EmployeeDemo(113, "Baj", 41, 7000.0);
		
		lsEmp.add(emp1);
		lsEmp.add(emp2);
		lsEmp.add(emp3);
		
		System.out.println(lsEmp);//prints reference id
		
		Iterator<EmployeeDemo> it = lsEmp.iterator();
		while(it.hasNext()) {
			EmployeeDemo e = it.next();
			System.out.print(e.age + " ");
			System.out.print(e.empId + " ");
			System.out.print(e.empName + " ");
			System.out.println(e.salary+ " ");	
		}
		
		

	}

}
