package com.api.user.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.user.web.model.UsersAdmin;
import com.api.user.web.service.UserAdminServiceImp;

@RequestMapping("/user")
@RestController
public class UserAdminController {

	@Autowired
	private UserAdminServiceImp adminServiceImp;
	
	@PostMapping("/addUser") //url: http://localhost:8081/user/addUser
	public UsersAdmin addNewUser(@RequestBody UsersAdmin usersAdmin) {
		return adminServiceImp.addNewUserAdmin(usersAdmin);
	}
	
	@GetMapping("/getAllUsers")  //url: http://localhost:8081/user/getAllUsers
	public List<UsersAdmin> getAllUser(){
		return adminServiceImp.getAllUsers();
	}
}
