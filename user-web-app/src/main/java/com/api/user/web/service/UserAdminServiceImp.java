package com.api.user.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.user.web.dao.UserAdminDao;
import com.api.user.web.model.UsersAdmin;

@Service
public class UserAdminServiceImp {
	
	@Autowired
	private UserAdminDao userAdminDao;
	
	public UsersAdmin addNewUserAdmin(UsersAdmin usersAdmin) {
		return userAdminDao.save(usersAdmin);
	}
	
	public List<UsersAdmin> getAllUsers(){
		return userAdminDao.findAll();
	}

}
