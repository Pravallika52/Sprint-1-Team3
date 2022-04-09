package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.UsersDAO;

@RestController
public class UsersTaskController {

	@Autowired
	UsersDAO usersDAO;	
	
	
	@GetMapping("/")
	public String getHome() {
		return "hello";
	}
}
