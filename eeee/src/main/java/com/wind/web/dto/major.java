package com.wind.web.dto;

public class major {
	
	private String id;
	private String frontEnd;
	private String backEnd;
	private String Hw;
	public major(String id, String frontEnd, String backEnd, String hw) {
		super();
		this.id = id;
		this.frontEnd = frontEnd;
		this.backEnd = backEnd;
		Hw = hw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFrontEnd() {
		return frontEnd;
	}
	public void setFrontEnd(String frontEnd) {
		this.frontEnd = frontEnd;
	}
	public String getBackEnd() {
		return backEnd;
	}
	public void setBackEnd(String backEnd) {
		this.backEnd = backEnd;
	}
	public String getHw() {
		return Hw;
	}
	public void setHw(String hw) {
		Hw = hw;
	}
	
	
	
}
