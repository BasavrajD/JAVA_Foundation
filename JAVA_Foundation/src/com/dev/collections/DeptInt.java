package com.dev.collections;

public class DeptInt implements Department<Integer> {
	
	@Override
	public void deptId(Integer a) {
		System.out.println("department id is: " + a);
		
	}

	public static void main(String[] args) {
		DeptInt obj = new DeptInt();
		obj.deptId(1212); //enabling type-safety. we cannot enter any value other than string 

	}

	
	

}
