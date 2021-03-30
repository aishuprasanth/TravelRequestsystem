package com.faith.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {
	
	//id generation
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;

	private String firstname;
	private String lastname;
	private int age;
	private String gender;
	private String phone;
	private int login_id;

	private boolean isActive;

	//login to user
	@OneToOne(cascade = CascadeType.MERGE)
	 @JoinColumn(name ="login_id" ,updatable = false, insertable = false)
	private Login login;
	

	//default constructor
	
	public User() {
		super();
		
	}

	//Parameterized constructor
	
	public User(int user_id, String firstname, String lastname, int age, String gender, String phone, int role_id,
			boolean isActive, Login login, String username,String password) {
		super();
		this.user_id = user_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.login=login;
		this.isActive = isActive;
		
	}

	//getters and setter
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getLogin_id() {
		return login_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	

	
	
	
	
	


}
