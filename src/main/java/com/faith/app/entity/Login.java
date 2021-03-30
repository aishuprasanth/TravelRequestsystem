package com.faith.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int login_id;

	private int role_id;
	private String username;
	private String password;

	// may login one role
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "role_id", updatable = false, insertable = false)
	private Role role;

	
	//one login one user
	@OneToOne(mappedBy="login")
	private User user;
	
	
	
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(int login_id, int role_id, String username, String password, Role role) {
		super();
		this.login_id = login_id;
		this.role_id = role_id;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public int getLogin_id() {
		return login_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	

}
