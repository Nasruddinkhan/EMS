package com.jsoft.ems.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jsoft.ems.bean.MenuModel;
import com.jsoft.ems.bean.UploadForm;
import com.jsoft.ems.model.LoginInformation;
import com.jsoft.ems.model.User;
import com.jsoft.ems.service.LoginService;

/**
 * @author Nasruddin khan 
 *
1:34:18 AM
 */
@Controller
@RequestMapping("login")
public class LoginController {
	@Autowired(required = true)
	LoginService loginService;
	
	@RequestMapping( method=RequestMethod.GET)
	public String showLoginForm(Model model) {
		model.addAttribute("user", new User());
		return "emp_login";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String checkUsers(@ModelAttribute("user") @Valid User user, BindingResult result,
			Map model, HttpServletRequest request) {
		if (result.hasErrors()) {
			return "emp_login";
		}
		User users = loginService.checkLogin(user);
		System.out.println(users);
		if( null != users && 0 != users.getId()) {
			LoginInformation loginInformation = null;
			HttpSession session = request.getSession();
			loginInformation = new LoginInformation();
			String sslId = (String) request.getAttribute(
	                "javax.servlet.request.ssl_session");
			System.out.println("sslId ["+sslId+"]");
			loginInformation.setSessionId(session.getId());
			loginInformation.setUserId(user.getLoginId());
			loginInformation.setUserName(user.getUserName());
			loginInformation.setIpaddress(request.getRemoteAddr());
			loginInformation.setBrowser(request.getHeader("User-Agent"));
			loginService.saveLoginInformation(loginInformation);
			String roleId = users.getRoles();
			List<MenuModel> menuModel = loginService.getMenu(roleId);
			Map<Integer,List<MenuModel>> subMenuModel =loginService.getSubMenu(menuModel);
			session.setAttribute("users", users);
			session.setAttribute("empID", users.getId());
			session.setAttribute("menuModel", menuModel);
			session.setAttribute("subMenuModel", subMenuModel);
			session.setAttribute("loginInformation", loginInformation);
			session.setAttribute("loginTime", new Date());
			session.setMaxInactiveInterval(5*60);
			model.put("form", new UploadForm());
		} else {
			model.put("Error", "Wrong password, Try again or click Forget password to reset it");
			model.put("emp_login", user);
			
			return "emp_login";
		}
		return "home";
	}
	

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		loginService.updateLogOutTime(request.getSession().getId());
		request.getSession().invalidate();
		return "logout";
	}
	
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String registerEmp(@ModelAttribute("user") @Valid User user, BindingResult result) {
		return "register";
	}
}
