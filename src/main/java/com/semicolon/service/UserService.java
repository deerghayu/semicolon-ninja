package com.semicolon.service;

import com.semicolon.domain.User;

public interface UserService {

	void addUser(User user);

	public boolean isExisted(String username);

}
