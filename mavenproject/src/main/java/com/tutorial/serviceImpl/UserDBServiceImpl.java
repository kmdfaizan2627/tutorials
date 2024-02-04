package com.tutorial.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tutorial.models.User;
import com.tutorial.repository.UserRepository;
import com.tutorial.service.UserDBService;

public class UserDBServiceImpl implements UserDBService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User returnValue =  userRepository.save(user);
		return returnValue;
	}

	@Override
	public List<User> getAllUser(List<User> users) {
		  List<User> returnValue = (List<User>) userRepository.saveAll(users);
		return returnValue;
	}

	@Override
	public String deleteUser(Integer id) {
		    Optional<User> user = userRepository.findById(id);
		    if(user.isPresent()) {
		    	userRepository.delete(user.get());
		    }
		return "User deleted successfully..";
	}

	@Override
	public User updateUser(User user) {
		 Optional<User> getUser = userRepository.findById(user.getId());
		 getUser.get().setName("Rahul");
		User returnValue =  userRepository.save(getUser.get());
		return returnValue;
	}

	@Override
	public String saveAllUser(List<User> users) {
			userRepository.saveAll(users);

		return "Users saved successfully..";
	}

	

}
