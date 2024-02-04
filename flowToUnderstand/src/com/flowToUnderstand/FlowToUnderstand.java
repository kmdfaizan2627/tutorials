package com.flowToUnderstand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.flowToUnderstand.models.Employee;
import com.flowToUnderstand.service.EmployeeService;
import com.flowToUnderstand.serviceImpl.EmployeeServiceImpl;
//Controller
public class FlowToUnderstand { //Think about this class as  Controller of springboot
	public static void main(String[] args) {
		
		// !st controller -> @RequestBody Employee emp;
		Employee emp = new Employee();
		emp.setId(12);
		emp.setName("Rahul");
		emp.setRoll("12");
		// @Autowired
		// EmployeeService employeeService;
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee savedEmployee = employeeService.save(emp);
		System.out.println(savedEmployee);
		
		// Second Controller -> @PathVariable
//           employeeService.deleteEmployee(0);
//		 System.out.println("Employee deleted successfully");
		
		// Second Controller
		// @PutMapping - >@PathVariable
		Employee updatedEmployee = employeeService.updateEmployee(0);
		System.out.println(updatedEmployee);
		
		
		
		// @PutMapping // @RequestBody Employee 
		Employee puEmployee  = new Employee();
		puEmployee.setId(99);
		puEmployee.setName("Rajeshwari");
		puEmployee.setRoll("9876");
		System.out.println("Before update"+puEmployee);
		Employee pubject = employeeService.puEmployee(puEmployee);
		System.out.println("After update"+pubject);
		System.out.println(pubject);
		
		
		// @RequestBody ->Add List<Employee> listEmployee 
		Employee puEmployee1  = new Employee();
		puEmployee1.setId(99);
		puEmployee1.setName("Raj");
		puEmployee1.setRoll("3333");
		Employee puEmployee2  = new Employee();
		puEmployee2.setId(1098);
		puEmployee2.setName("Rajeshi");
		puEmployee2.setRoll("2222");
		Employee puEmployee3  = new Employee();
		puEmployee3.setId(100);
		puEmployee3.setName("Rajesh");
		puEmployee3.setRoll("0000");
		Employee puEmployee4  = new Employee();
		puEmployee4.setId(102);
		puEmployee4.setName("Rajeshwar");
		puEmployee4.setRoll("1111");
		List<Employee> listEmployee = Arrays.asList(puEmployee1,puEmployee2,puEmployee3,puEmployee4);
		List<Employee> returnEmployees = employeeService.addEmployees(listEmployee);
		System.out.println(returnEmployees);
		
		
		
		
	}

}
