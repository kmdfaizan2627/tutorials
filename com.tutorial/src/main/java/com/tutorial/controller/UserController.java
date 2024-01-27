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

import com.tutorial.models.Employee;

import jakarta.websocket.server.PathParam;

@RestController
public class UserController {

	List<Employee> listAll = new ArrayList<Employee>(); // This will be available to this 
	// class anywhere
	

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
		List<Employee> list = new ArrayList<Employee>(); // Only inside method
		list.addAll(emp);
		return list;
	}

	// Next to Next Level
	@PostMapping(value = "/saveAllEmployee")
	public List<Employee> saveEmployees(@RequestBody List<Employee> emp) {
		listAll.addAll(emp);
		return listAll;
	}

	@GetMapping(value = "/getEmployee")
	public Employee getEmployee() {
		Employee employee = listAll.get(0);
		return employee;
	}

	@DeleteMapping(value = "/deleteEmployee")
	public List<Employee> getEmployeesAfterDeletion() {
		listAll.remove(0);
		return listAll;
	}

	@PostMapping(value = "/addEmployee")
	public List<Employee> addEmployee() {
		List<Employee> listEmployee = new ArrayList<Employee>();
		Employee obj1 = new Employee();
		obj1.setName("Rahul");
		obj1.setRoll("123");
		Employee obj2 = new Employee();
		obj2.setName("Rakesh");
		obj2.setRoll("12");
		Employee obj3 = new Employee();
		obj3.setName("Ramesh");
		obj3.setRoll("1234");
		Employee obj4 = new Employee();
		obj4.setName("Raman");
		obj4.setRoll("1231");

		listEmployee.add(obj1);
		listEmployee.add(obj2);
		listEmployee.add(obj3);
		listEmployee.add(obj4);

		return listEmployee;
	}

	@PostMapping(value = "/mapEmployee")
	public Map<String, Employee> postEmployee(@RequestBody Map<String, Employee> map) {

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
		Employee obj = new Employee();
		obj.setName(name);
		obj.setRoll(roll);
		
		return "Name is "+obj.getName()+" , Roll is "+obj.getRoll();
		
	}
	
	@GetMapping(value="/getDetail")
	public String queryParam(@RequestParam(value = "name") String name,@RequestParam(value = "age") String age,@RequestParam(value = "roll") String roll) {
		Employee obj = new Employee();
		obj.setName(name);
		obj.setRoll(roll);
		
		return "Name is "+obj.getName()+"Age is "+age+" , Roll is "+obj.getRoll();
		
	}

}
