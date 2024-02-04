package com.tutorial.service;

import java.util.List;

import com.tutorial.models.User;

public interface UserDBService {

	User saveUser(User employee);

	String saveAllUser(List<User> user);

	List<User> getAllUser(List<User> iuser);

	String deleteUser(Integer id);

	User updateUser(User iser);
	
	User getUser(Integer id);

}
