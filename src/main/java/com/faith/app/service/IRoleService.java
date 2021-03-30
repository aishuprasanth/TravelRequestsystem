package com.faith.app.service;

import java.util.List;

import com.faith.app.entity.Role;



public interface IRoleService {

	// add roles
	void addRole(Role role);

	// view all roles
	List<Role> getAllRoles();

}
