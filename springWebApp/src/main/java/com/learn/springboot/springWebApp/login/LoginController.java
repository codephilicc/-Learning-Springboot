package com.learn.springboot.springWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private loginAuthenticationService authservice;
	
	
	
	public LoginController(loginAuthenticationService authservice) {
		super();
		this.authservice = authservice;
	}

	@RequestMapping(value="login",method=RequestMethod.GET )
	public String gotoLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST )
	public String gotoWelcomePage(@RequestParam String name,@RequestParam String password,ModelMap model) {
		
		if(authservice.authenticate(name,password)) {
		
		model.put("name",name);
		return "welcome";
	 } 
		model.put("errormsg","invalid credentials! please try again.");
		return "login";
	}
	
}
