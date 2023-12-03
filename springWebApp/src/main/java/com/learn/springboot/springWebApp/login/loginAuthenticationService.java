package com.learn.springboot.springWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class loginAuthenticationService {

	public Boolean authenticate(String username, String password) {

		boolean isValidUserName = username.equalsIgnoreCase("springboot");
		boolean isValidPassword = password.equalsIgnoreCase("spring");

		return isValidUserName && isValidPassword;

	}
}
