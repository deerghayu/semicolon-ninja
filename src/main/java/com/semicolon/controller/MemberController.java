package com.semicolon.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.semicolon.domain.Member;
import com.semicolon.domain.Movie;
import com.semicolon.domain.Role;
import com.semicolon.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/members")
	public String addMovies(@ModelAttribute("member") Member member, Model model){
		
		List<Role> roles = Arrays.asList(Role.values());
		model.addAttribute("roles", roles);
		return "member/addMember";
	}
	
	@RequestMapping(value="members/add", method=RequestMethod.POST)
	public String saveMovie(@ModelAttribute("movie") Member member, RedirectAttributes redirectAttribute){
		 
		memberService.addMember(member);
		redirectAttribute.addFlashAttribute(member);
		return "redirect:/member/details";
	}
	
	@RequestMapping(value="member/details")
	public String viewMovie(Model model){
		
		return "member/memberDetails";
	}
}
