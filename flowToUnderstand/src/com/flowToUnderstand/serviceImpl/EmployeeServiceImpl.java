package com.flowToUnderstand.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.flowToUnderstand.models.Employee;
import com.flowToUnderstand.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	
	List<Employee> employee = new ArrayList<>();// Assume This is your repository
                                               // which has many methods like JpaRepository.
	@Override
	public Employee save(Employee emp) {
		    employee.add(emp); // saving employee in list 
		    Employee returnValue = employee.get(0);
		return returnValue;
	}

	@Override
	public Employee deleteEmployee(Long id) {
		Employee returnValue = employee.remove(0);
		return returnValue;
	}

	@Override
	public Employee updateEmployee(int index) {
		Employee returnValue = employee.get(index);
		returnValue.setName("Ajay");
		return returnValue;
	}

}
