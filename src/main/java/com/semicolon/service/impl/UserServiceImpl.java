package com.semicolon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.semicolon.domain.User;
import com.semicolon.repository.UserRepository;
import com.semicolon.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	public void addUser(User user) {
		userRepository.save(user);
	}

}
