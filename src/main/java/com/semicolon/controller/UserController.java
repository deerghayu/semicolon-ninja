package com.semicolon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.semicolon.domain.User;
import com.semicolon.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = { "/addUser" }, method = RequestMethod.GET)
	public String addUser(@ModelAttribute("newUser") User user, Model model) {

		return "signup";
	}

	@RequestMapping(value = { "/addUser" }, method = RequestMethod.POST)
	public String addUser(@ModelAttribute("newUser") User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "signup";
		} else {
			userService.addUser(user);

		}

		return "dashboard";
	}

}
