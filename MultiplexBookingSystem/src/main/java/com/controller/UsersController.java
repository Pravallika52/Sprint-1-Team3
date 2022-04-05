package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Users;
import com.model.UsersDAO;

@RestController
public class UsersController {

	@Autowired
	UsersDAO usersDAO;	
	
	@GetMapping("/getallusers")
	public Iterable<Users> getAllUsers(){
	return usersDAO.findAll();
	}
	
	@GetMapping("/")
	public String getHome() {
		return "hello";
	}
}
