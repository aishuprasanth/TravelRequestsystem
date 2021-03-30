package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.entity.User;
import com.faith.app.entity.User;



public interface IUserService {
	
	
	// get all users
	List<User> getAllUsers();

	// get user by id
	Optional<User> getUserById(Integer id);

	// add users
	void addUser(User user);

	// update user
	void updateUser(User user);

	// disable
	void disableUser(Integer id);

	// enable
	void enableUser(Integer id);

	User findUser(String username, String password);


}
