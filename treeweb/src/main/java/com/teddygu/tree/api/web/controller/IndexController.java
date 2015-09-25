package com.teddygu.tree.api.web.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.teddygu.tree.api.web.dto.SignInDto;
import com.teddygu.tree.api.web.dto.SignUpDto;

@Controller
public class IndexController {
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

	@Autowired
	private SignUpDto singUpDto;

	@Autowired
	private SignInDto singInDto;

	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String initialPage() {
		logger.debug("initialPage");
		return "index";
	}

	@RequestMapping(value = "/signUp", method=RequestMethod.POST)
	public String signUpPage(Model model) {
        model.addAttribute("signUp", singUpDto);
		System.out.println("signUp page");
		return "signUp";
	}

	@RequestMapping(value = "/signIn", method=RequestMethod.POST)
	public String signInPage(Model model) {
        model.addAttribute("signIn", singInDto);
		System.out.println("signIn page");
		return "signIn";
	}

	@RequestMapping(value="/welcome", method=RequestMethod.POST)
	public String welcome(Model model){
		System.out.println("wolcome page");
		Date today = new Date();
		model.addAttribute("today", today);
		return "welcome";
	}
}
