package com.dev.java8;

public class CSlocation {
	private int lid;
	private String lName;
	private String cName;
	
	
	public CSlocation() {
		super();
	}

	public CSlocation(int lid, String lName, String cName) {
		super();
		this.lid = lid;
		this.lName = lName;
		this.cName = cName;
	}
	
	@Override
	public String toString() {
		return "CSlocation [lid=" + lid + ", lName=" + lName + ", cName=" + cName + "]";
	}
	
	public int getLid() {
		return lid;
	}
	public String getlName() {
		return lName;
	}
	public String getcName() {
		return cName;
	}
	
	
}
