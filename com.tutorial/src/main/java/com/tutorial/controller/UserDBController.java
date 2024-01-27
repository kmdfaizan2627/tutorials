package com.tutorial.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.models.Employee;
import com.tutorial.repository.UserRepository;


@RestController
public class UserDBController {
	
	@Autowired
	private UserRepository repo;
	
	@PostMapping(value = "/dbsave")
	public Employee saveEmployee(@RequestBody Employee emp) {
		Employee obj = (Employee)repo.save(emp);
		return obj;
	}
	
	@GetMapping(value="/{id}")
	public Employee setRoll(@PathVariable Integer id) {
		Optional<Employee> emp = repo.findById(id);
		
		return emp.get();
		
	}
	
	@DeleteMapping(value="/{id}")
	public String deleteEmployeeId(@PathVariable Integer id) {
		if(repo.findById(id).get()!=null) {
			repo.deleteById(id);
		}else {
			throw new NullPointerException();
		}
		return "Deleted successfully";	
	}
	
	@PutMapping(value="/{id}")
	public Employee updateEmployee(@PathVariable Integer id) {
		Employee emp = null;
		if(repo.findById(id).get()!=null) {
			emp = repo.findById(id).get();
			emp.setName("Rahul");
			emp.setRoll("98766");
			repo.save(emp);
			
		}else {
			throw new NullPointerException("User does not exist");
		}
		return emp;	
	}

}
