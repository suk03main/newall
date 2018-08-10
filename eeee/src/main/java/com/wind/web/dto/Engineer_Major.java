package com.wind.web.dto;

public class Engineer_Major {

	private int engineer_id;
	private int major_id;
	
	public Engineer_Major() {}

	public Engineer_Major(int engineer_id, int major_id) {
		super();
		this.engineer_id = engineer_id;
		this.major_id = major_id;
	}

	public int getEngineer_id() {
		return engineer_id;
	}

	public void setEngineer_id(int engineer_id) {
		this.engineer_id = engineer_id;
	}

	public int getMajor_id() {
		return major_id;
	}

	public void setMajor_id(int major_id) {
		this.major_id = major_id;
	}
		
	
}
