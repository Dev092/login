package com.dev.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.login.module.User;
import com.dev.login.repository.UserInterface;

@RestController
@RequestMapping("/api/")
public class UserController {
	@Autowired
	UserInterface userInterface;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userInterface.findAll();
	}

}
