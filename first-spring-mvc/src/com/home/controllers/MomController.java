package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {

	@ResponseBody 
	@RequestMapping(method = RequestMethod.GET, value =  ("/sugar"))
	public String getSugar() {
		return "Ok...! here is your sugar Enjoy :)";
	}
}
