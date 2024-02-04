package com.flowToUnderstand.service;

import com.flowToUnderstand.models.Employee;

public interface EmployeeService {

	Employee save(Employee emp);

	Employee deleteEmployee(Long id);

	Employee updateEmployee(int i);

}
