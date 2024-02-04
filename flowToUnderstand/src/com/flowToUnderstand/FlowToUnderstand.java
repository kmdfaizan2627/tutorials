package com.flowToUnderstand;

import com.flowToUnderstand.models.Employee;
import com.flowToUnderstand.service.EmployeeService;
import com.flowToUnderstand.serviceImpl.EmployeeServiceImpl;

public class FlowToUnderstand {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(12);
		emp.setName("Rahul");
		emp.setRoll("12");
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee savedEmployee = employeeService.save(emp);
		System.out.println(savedEmployee);
		Employee updatedEmployee = employeeService.updateEmployee(0);
		System.out.println(updatedEmployee);
		
		
	}

}
