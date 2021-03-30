package com.faith.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.User;

import com.faith.app.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private IUserService userService;

	// get all users
	@GetMapping("/users")
	public List<User> getAllusers() {

		userService.getAllUsers();

		return userService.getAllUsers();
	}

	// get user by id
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable Integer id) {

		return userService.getUserById(id);
	}

	// add user
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {

		// user.setUser_id(user.getUser_id());
		System.out.println(user);
		userService.addUser(user);

		return user;
	}

	// update user
	@PutMapping("/users/update/{id}")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}

	// delete user
	@PutMapping("/users/disable/{id}")
	public void disableUser(@PathVariable Integer id) {

		userService.disableUser(id);
	}

	// enable user
	@PutMapping("/users/enable/{id}")
	public void enableUser(@PathVariable Integer id) {
		userService.enableUser(id);
	}

	
}
