package com.dev.collections;

import java.util.Comparator;

public class SortByEmpId implements Comparator<EmployeeDemo>{

	@Override
	public int compare(EmployeeDemo o1, EmployeeDemo o2) {
		return o1.compareTo(o2); //this compareTo we have overriden in the EmployeeDemo Class. This is not from String class as in line 48 in ArrayListEmp.
	}

}
