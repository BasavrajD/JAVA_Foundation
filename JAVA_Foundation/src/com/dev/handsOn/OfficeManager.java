package com.dev.handsOn;

public class OfficeManager extends OfficeEmployee {
	
	private int teamSize;

	public OfficeManager(String name, double salary, int teamSize) {
		super(name, salary);
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	@Override
	public double calculateBous() {
		return getSalary()*0.10;
	}

	

}
