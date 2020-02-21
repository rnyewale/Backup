package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BrotherController {

	//@ResponseBody
	@RequestMapping("/cricketbat")
	public String getBat() {
		return "MRFCricketBat";
	}
}
