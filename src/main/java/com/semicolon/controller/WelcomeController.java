package com.semicolon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	
	@RequestMapping(value="/")
	public String welcome(){
		return "welcome";
	}
}
