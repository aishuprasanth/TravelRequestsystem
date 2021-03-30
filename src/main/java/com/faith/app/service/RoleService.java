package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.faith.app.entity.Role;
import com.faith.app.repo.RoleRepository;

@Service
public class RoleService implements IRoleService {
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void addRole(Role role) {
		roleRepository.save(role);

	}

	@Override
	public List<Role> getAllRoles() {
		
		return (List<Role>) roleRepository.findAll();
	}

}
