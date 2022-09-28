package com.dumma.dummi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyController {
	
	@RequestMapping("/")
	public String home() {
		return "<a href='home.html'>Homepage</a>";
	}

	@RequestMapping("/home")
	public ModelAndView homePage() {
		return new ModelAndView("home");
	}

	@RequestMapping("/login")
	public ModelAndView loginPage() {
		return new ModelAndView("login");
	}
	
	
}
