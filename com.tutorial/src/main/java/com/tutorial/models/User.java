package com.tutorial.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Pojo or Model 
@Entity // It is used to persist table in database and if we don't provide @Table(name = "employees")
        // then it will take class name and will create table like here employee
@Table(name = "employees")  //- > Table will be created in database with name employees  
public class User {
	@Id // Primary key in database
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Different strategy generating primary key
	private Integer id;
	@Column(name ="employee_name")
	private String name;
	@Column(name="employee_roll") // It will create column with name "employee_roll"
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
