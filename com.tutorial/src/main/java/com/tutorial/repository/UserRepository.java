package com.tutorial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.models.User;
// DAO layer - Data access object
// It is going to communicate with your database
@Repository
public interface UserRepository extends CrudRepository<User,Integer>{
	
}
