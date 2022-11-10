package com.muneendra.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muneendra.studentmanagement.entity.User;

public interface UserRepository extends JpaRepository <User, Integer>{
	
	public User findByUsername(String username);

}
