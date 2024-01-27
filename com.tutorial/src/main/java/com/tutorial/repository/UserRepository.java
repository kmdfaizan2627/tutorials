package com.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.models.Employee;
// DAO layer - Data access object
// It is going to register bean to spring factory and can be called anywhere in application
@Repository
public interface UserRepository extends JpaRepository<Employee,Integer>{
	
	
}
