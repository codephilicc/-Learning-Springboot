package com.jpa.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestContoller {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a=30;
		int  b =40;
		return "this is just testing sum of a and b "+(a+b);
		
	}
	
}
