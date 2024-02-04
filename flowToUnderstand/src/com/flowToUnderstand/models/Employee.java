package com.flowToUnderstand.models;

public class Employee {
    private Integer id;
    private String name;
    private String roll;
	public Integer getId() {
		return id;
	}
	public void setId(int i) {
		this.id = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", roll=" + roll + "]";
	}
	
    
    
}
