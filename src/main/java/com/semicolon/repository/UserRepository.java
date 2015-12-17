package com.semicolon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.semicolon.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public User getUserByUsername(String user);
}
