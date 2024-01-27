package com.tutorial.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Pojo or Model 
@Entity // It is used to persist table in database
public class Employee {
	@Id
	private Integer id;
	private String name;
	private String roll;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

}
