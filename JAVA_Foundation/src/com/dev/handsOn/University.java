package com.dev.handsOn;
////complete this later
public class University {
	
	private String studentId;
	private String studentName;
	
	public University(String studentId, String studetnName) {
		this.studentId = studentId;
		this.studentName = studetnName;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		return false;
	}



	@Override
	public String toString() {
		return studentId + " " + studentName;
	}



	@Override
	public int hashCode() {
		return studentId.hashCode();
	}


	public static void main(String[] args) {
		University student1 = new University("Raj", "A001");
		System.out.println(student1.toString());
		
		University student2 = new University("Yash", "A001");
		System.out.println(student2.toString());
		
		System.out.println(student1.equals(student2));

		
//		System.out.println(student1.studentId.equals());
		
		
	}


}
