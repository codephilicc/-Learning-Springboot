package com.learn.springboot.springWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

//	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("login")
	public String gotoLoginPage() {
//		model.put("name",name);
//		
//		logger.debug("Request param is {}", name);
//		logger.info("I want this printed at info level");
//		logger.warn("I want this printed at warn level");
//		System.out.println("Request param is "+name);
		return "login";
	}
	
}
