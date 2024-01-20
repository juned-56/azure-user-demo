package com.api.user.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.user.web.model.UsersAdmin;

public interface UserAdminDao extends JpaRepository<UsersAdmin, Integer>{

}
