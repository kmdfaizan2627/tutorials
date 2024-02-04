package com.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.models.User;
import com.tutorial.service.UserDBService;

@RestController
public class UserDBController {

	@Autowired
	UserDBService userService; 

	@PostMapping(value = "/saveUser") // To save single user in database
	public User saveEmployee(@RequestBody User user) {
		User returnValue = userService.saveUser(user);
		return returnValue;
	}
	
//	@GetMapping(value="/{id}")
//	public User getUser(@PathVariable String id) {
//		userService.
//	}
	
	@PostMapping(value = "/saveAllUsers") // To save a list of users in database
	public String saveAllEmployee(@RequestBody List<User> user) {
		userService.saveAllUser(user);
		return "All Users saved successfully..";
	}
	

	@DeleteMapping(value = "/{id}") // To delete User from database
	public String deleteEmployee(@PathVariable Integer id) {
		userService.deleteUser(id);
		return "Employee deleted successfully..";
	}

	@PutMapping(value = "/updateEmployee") // To update user details from database
	public User updateEmployee(@RequestBody User user) {
		User returnValue = userService.updateUser(user);
		return returnValue;
	}

}
