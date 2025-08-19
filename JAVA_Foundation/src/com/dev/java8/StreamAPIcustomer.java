package com.dev.java8;

public class StreamAPIcustomer {
	private int id;
	private String name;
	private String gender;
	private String type;
	private String branch;
	
	public StreamAPIcustomer() {
		
	}
	public StreamAPIcustomer(int id, String name, String gender, String type, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.type = type;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", type=" + type + ", branch="
				+ branch + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
}
