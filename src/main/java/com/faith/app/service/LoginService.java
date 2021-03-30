package com.faith.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.Login;
import com.faith.app.repo.LoginRepository;

@Service
public class LoginService implements ILoginService{
	
	@Autowired
	private LoginRepository loginRepo;

	@Override
	public Login findUser(String username, String password) {
		return loginRepo.findByLoginnameAndPassword(username, password) ;
	}

}
