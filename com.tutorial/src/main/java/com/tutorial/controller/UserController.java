package com.tutorial.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.models.Employee;

@RestController
public class UserController {

	List<Employee> listAll = new ArrayList<Employee>();

	@GetMapping(value = "/hello")
	public String hello() {
		return "My Name";
	}

	// @RequestBody maps incoming json or xml with Java Pojo class
	// @PostMapping mapping is used when we send data to save it in database.
	@PostMapping(value = "/save")
	public Employee save(@RequestBody Employee emp) {
		return emp;
	}

	// Next Level
	@PostMapping(value = "/saveAll")
	public List<Employee> saveEmployee(@RequestBody List<Employee> emp) {
		List<Employee> list = new ArrayList<Employee>();
		list.addAll(emp);
		return list;
	}

	// Next to Next Level
	@PostMapping(value = "/saveAllEmployee")
	public List<Employee> saveEmployees(@RequestBody List<Employee> emp) {
		listAll.addAll(emp);
		return listAll;
	}
	
	@GetMapping(value= "/getEmployee")
	public Employee getEmployee() {
		Employee employee = listAll.get(0);
		return employee;
	}
	
	@DeleteMapping(value= "/deleteEmployee")
	public List<Employee> getEmployeesAfterDeletion() {
		listAll.remove(0);
		return listAll;
	}

}
