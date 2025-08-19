package com.dev.java8;

public class CScustomer {
	private int cid;
	private String cName;
	private int tCost;
	
	public CScustomer(int cid, String cName, int tCost) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.tCost = tCost;
	}

	@Override
	public String toString() {
		return "CScustomer [cid=" + cid + ", cName=" + cName + ", tCost=" + tCost + "]";
	}
	
	public int getCid() {
		return cid;
	}

	public String getcName() {
		return cName;
	}

	public int gettCost() {
		return tCost;
	}
	
	
	
}
