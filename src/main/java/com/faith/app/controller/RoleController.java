package com.faith.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Role;
import com.faith.app.service.IRoleService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class RoleController {

	@Autowired
	private IRoleService roleservice;

	// get all roles
	@GetMapping("/roles")
	public List<Role> getAllRole() {
		return roleservice.getAllRoles();

	}

	// add role
	@PostMapping("/roles")
	public void addUser(@RequestBody Role role) {
		roleservice.addRole(role);
	}
}
