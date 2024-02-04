package com.formula;

public class Students {
	private String name;
	private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Students(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", designation=" + designation + "]";
	}
	}
	


