package com.home.model.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InteractWithDataController {

	
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		model.addAttribute("myCafeName", "Lost in space Cafe");
		return "welcome-cafe";
	}
	
	@RequestMapping("/processOrder")
	public String placeOrder(Model model) {
		return "process-order";
	}
}
