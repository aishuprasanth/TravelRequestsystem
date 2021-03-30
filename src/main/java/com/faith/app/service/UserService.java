package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.User;
import com.faith.app.repo.UserRepository;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	@Override
	public Optional<User> getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public void addUser(User user) {

		userRepository.save(user);

	}

	@Override
	public void updateUser(User user) {

		userRepository.save(user);

	}

	@Override
	public void disableUser(Integer id) {
		userRepository.disableUser(id);

	}

	@Override
	public void enableUser(Integer id) {
		userRepository.enableUser(id);

	}

	@Override
	public User findUser(String username, String password) {
	
		return  userRepository.findByUsernameAndPassword(username, password);
	}

}
