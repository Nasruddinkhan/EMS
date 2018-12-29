package com.jsoft.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * @author Nasruddin khan 
 *
1:34:37 AM
 */
@Controller
@RequestMapping("/app")
public class AppController {

	@RequestMapping(value = { "/home"}, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "home";
	}

}