package com.api.user.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api.user.web.service.UserAdminServiceImp;

@Configuration
public class Config {

	@Bean
	public UserAdminServiceImp adminServiceImp() {
		return new UserAdminServiceImp();
	}
}
