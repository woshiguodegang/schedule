package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stock")
public class HTMLController {
	
	@GetMapping("/login")
	public String login()
	{
		return "Login";
	}

}
