package com.faith.app.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Roles")
public class Role {

	// id generation

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int role_id;

	private String role_name;

	// one role may users
	@OneToMany(mappedBy = "role")
	private List<Login> login;

	// default constructor

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor

	public Role(int role_id, String role_name) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
	}

	// getters and setters

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

}
