package com.jsoft.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Nasruddin khan 
 *
1:34:14 AM
 */
@Controller
@RequestMapping("/profile")
public class UserProfileController {

	@RequestMapping(value="view_profile", method=RequestMethod.GET)
	public String showViewProfileForm() {
		return "view_employee";
	} 
	
}
