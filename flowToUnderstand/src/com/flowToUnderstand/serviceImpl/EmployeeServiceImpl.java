package com.flowToUnderstand.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.flowToUnderstand.models.Employee;
import com.flowToUnderstand.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	
	List<Employee> listOfemployee = new ArrayList<>(9);// Assume This is your repository interface 
	                                            // which is annotated as @Repository
	                                            //which has methods like JpaRepository

	@Override
	public Employee save(Employee emp) {
		    listOfemployee.add(emp); // saving employee in list 
		    Employee returnValue = listOfemployee.get(0);
		return returnValue;
	}

	@Override
	public void deleteEmployee(int index) {
		 if (!listOfemployee.isEmpty()) { // Check if the list is not empty
	            listOfemployee.remove(0); // Remove the element at index 0
	        }
		// employee.remove(0);
		//return returnValue;
	}

	@Override
	public Employee updateEmployee(int index) {
		Employee returnValue = listOfemployee.get(index);
		returnValue.setName("Ajay");
		return returnValue;
	}

	@Override
	public Employee puEmployee(Employee emp) {
		emp.setName("Amanullah");
		Employee setValues = emp;
		return setValues;
	}

	@Override
	public List<Employee> addEmployees(List<Employee> iEmployee) {
		for(Employee i : iEmployee) {
			listOfemployee.add(i);
		}
		listOfemployee.remove(1);
		return listOfemployee;
	}
  

}
