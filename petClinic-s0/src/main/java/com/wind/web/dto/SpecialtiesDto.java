package com.wind.web.dto;

public class SpecialtiesDto {
	private int id;
	private String name;
	
	
	
	public SpecialtiesDto() {}
	public SpecialtiesDto(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
}
