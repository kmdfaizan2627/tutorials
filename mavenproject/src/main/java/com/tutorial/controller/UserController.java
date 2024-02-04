package com.tutorial.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.models.User;

import jakarta.websocket.server.PathParam;

@RestController
public class UserController {

	List<User> listAll = new ArrayList<User>(); // This will be available to this 
	// class anywhere
	

	@GetMapping(value = "/hello")
	public String hello() {
		return "My Name";
	}

	// @RequestBody maps incoming json or xml with Java Pojo class
	// @PostMapping mapping is used when we send data to save it in database.
	@PostMapping(value = "/save")
	public User save(@RequestBody User emp) {
		return emp;
	}

	// Next Level
	@PostMapping(value = "/saveAll")
	public List<User> saveEmployee(@RequestBody List<User> emp) {
		List<User> list = new ArrayList<User>(); // Only inside method it will be available
		list.addAll(emp);
		return list;
	}
	




	// Next to Next Level
	@PostMapping(value = "/saveAllEmployee")
	public List<User> saveEmployees(@RequestBody List<User> emp) {
		listAll.addAll(emp);
		return listAll;
	}

	@GetMapping(value = "/getEmployee")
	public User getEmployee() {
		User employee = listAll.get(0);
		return employee;
	}

	@DeleteMapping(value = "/deleteEmployee")
	public List<User> getEmployeesAfterDeletion() {
		listAll.remove(0);
		return listAll;
	}

	@PostMapping(value = "/addEmployee")
	public List<User> addEmployee() {
		List<User> listEmployee = new ArrayList<User>();
		User obj1 = new User();
		obj1.setName("Rahul");
		obj1.setRoll("123");
		User obj2 = new User();
		obj2.setName("Rakesh");
		obj2.setRoll("12");
		User obj3 = new User();
		obj3.setName("Ramesh");
		obj3.setRoll("1234");
		User obj4 = new User();
		obj4.setName("Raman");
		obj4.setRoll("1231");

		listEmployee.add(obj1);
		listEmployee.add(obj2);
		listEmployee.add(obj3);
		listEmployee.add(obj4);

		return listEmployee;
	}

	@PostMapping(value = "/mapEmployee")
	public Map<String, User> postEmployee(@RequestBody Map<String, User> map) {

		return map;

	}
	
//	@GetMapping(value="/{roll}")
//	public String setRoll(@PathVariable String roll) {
//		Employee obj = new Employee();
//		obj.setName("Arish");
//		obj.setRoll(roll);
//		
//		return "Name is "+obj.getName()+" , Roll is "+obj.getRoll();
//		
//	}
	
	@GetMapping(value="/{name}/{roll}")
	public String setRoll(@PathVariable String name,@PathVariable String roll) {
		User obj = new User();
		obj.setName(name);
		obj.setRoll(roll);
		
		return "Name is "+obj.getName()+" , Roll is "+obj.getRoll();
		
	}
	
	@GetMapping(value="/getDetail")
	public String queryParam(@RequestParam(value = "name") String name,@RequestParam(value = "age") String age,@RequestParam(value = "roll") String roll) {
		User obj = new User();
		obj.setName(name);
		obj.setRoll(roll);
		
		return "Name is "+obj.getName()+"Age is "+age+" , Roll is "+obj.getRoll();
		
	}

}
