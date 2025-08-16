package com.dev.handsOn;
////complete this later
public class University {
	
	private String studentId;
	private String studentName;
	
	public University(String studetnName, String studentId) {
		this.studentId = studentId;
		this.studentName = studetnName;
	}
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}




	@Override
	public boolean equals(Object obj) {
//		System.out.println(this.getClass());
//		System.out.println(obj.getClass());
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		
		System.out.println("meow");
		University std = (University) obj;
		
//		System.out.println(this.studentId);
//		System.out.println(std.getStudentId());
//		System.out.println(std.studentId); // by doing this i got to know that i was giving i/p in id,name order but receiving them as name,id.
		return this.studentId.equals(std.getStudentId());
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
		System.out.println(student1.hashCode());
		
		University student2 = new University("Yash", "A001");
		System.out.println(student2.toString());
		System.out.println(student2.hashCode());
		
		System.out.println(student1.equals(student2));

		
//		System.out.println(student1.studentId.equals());
		
		
	}


}
