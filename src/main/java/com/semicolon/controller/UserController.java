package com.semicolon.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.semicolon.domain.User;
import com.semicolon.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public @ResponseBody Object validate(String username) {
		return "" + userService.isExisted(username);
	}

	@RequestMapping(value = { "/addUser" }, method = RequestMethod.GET)
	public String addUser(@ModelAttribute("newUser") User user, Model model) {

		return "signup";
	}

	@RequestMapping(value = { "/addUser" }, method = RequestMethod.POST)
	public String addUser(@Valid @ModelAttribute("newUser") User user, BindingResult result) {
		if (result.hasErrors()) {
			return "signup";
		} else {
			userService.addUser(user);

		}

		return "redirect:/dashboard";
	}

}
