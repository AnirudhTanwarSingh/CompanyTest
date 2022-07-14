package com.user.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.registration.entity.UserData;
import com.user.registration.enums.Status;
import com.user.registration.service.UserRegisterService;

@RestController
//@RequestMapping("/userForRegistartion")
public class UserRegistrationController {

	@Autowired
	private UserRegisterService userRegisterService;
	
	@PostMapping("/newUser")
	public Status registerUser(@RequestBody UserData user) {
		return userRegisterService.saveUser(user);
	}
	
}
