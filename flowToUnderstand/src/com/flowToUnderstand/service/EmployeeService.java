package com.flowToUnderstand.service;

import java.util.List;

import com.flowToUnderstand.models.Employee;

public interface EmployeeService {

	Employee save(Employee emp);

    void deleteEmployee(int i);

	Employee updateEmployee(int i);
	
	Employee puEmployee(Employee emp);
	
	List<Employee> addEmployees(List<Employee> iEmployee);

}
