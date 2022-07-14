package com.user.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.registration.entity.UserData;
import com.user.registration.enums.Status;
import com.user.registration.repository.UserRepository;


@Service
public class UserRegisterService {

	@Autowired
	private UserRepository userRepo;
	
	public Status saveUser(UserData newUser) {
		List<UserData> users= userRepo.findAll();
		for (UserData user : users) {
			if (user.equals(newUser)) {
               System.out.println("User Already exists!");
              return Status.USER_ALREADY_EXISTS;
            }
        }
		userRepo.save(newUser);
        return Status.SUCCESS;
	}
	
}
