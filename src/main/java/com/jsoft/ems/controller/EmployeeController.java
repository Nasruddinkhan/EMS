package com.jsoft.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsoft.ems.bean.Search;
import com.jsoft.ems.model.RoleMaster;
import com.jsoft.ems.model.User;
import com.jsoft.ems.service.UserService;
import com.jsoft.ems.util.CommonUtils;

/**
 * @author Nasruddin khan 
 *
1:34:32 AM
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired UserService userService;
	@RequestMapping(value = { "/showEmpForm"}, method = { RequestMethod.GET, RequestMethod.POST})
	public String homePage(@ModelAttribute("search") Search search, ModelMap model  ) {
		List<RoleMaster> roleList =userService.getRoles();
		List<User> userList = userService.getUsersList();
		model.addAttribute("roleList",roleList);
		model.addAttribute("userList",userList);
		return "employee";
	}

	@RequestMapping(value = { "/showAddEmpPage"}, method = RequestMethod.GET)
	public String addEmployee( Model model) {
		List<RoleMaster> roleList =userService.getRoles();
		model.addAttribute("roleList",roleList);
		System.out.println(new User());
		model.addAttribute("user", new User());
		return "add_employee";
	}
	@RequestMapping(value = { "/save"}, method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("user") User user, Model model, BindingResult bindingResult) {
		System.out.println("user.getId()  ["+user+"]");
		if (null == user.getId() || 0 == user.getId()){
			user.setStatus(user.getStatus() == null?"N":user.getStatus());
			user.setUserName(user.getFirstName()+" "+user.getFatherName()+" "+user.getLastName());
			user.setLoginId(user.getEmail());
			user.setRoles(user.getRoles()==null?"3":user.getRoles());
			user.setPassword(CommonUtils.genrateRandomPassword());
		}else {
			user.setStatus(user.getStatus() == null?"N":user.getStatus());
			user.setUserName(user.getFirstName()+" "+user.getFatherName()+" "+user.getLastName());
		}
		userService.saveEmployees(user);
		return "forward:/employee/showEmpForm.do";
	}
	@RequestMapping(value = "/editEmployeeById/{id}", method = RequestMethod.GET)
	public ModelAndView editEmployeeDetails(@ModelAttribute("search") Search search,@PathVariable("id") Integer id, @ModelAttribute("user") User user) {
		System.out.println("id ["+id+"]");
		User users = userService.getUsersList(id);
		ModelAndView model = new ModelAndView("add_employee");
		System.out.println("EmployeeController.editEmployeeDetails() user ["+users+"]");
		List<RoleMaster> roleList =userService.getRoles();
		List<User> userList = userService.getUsersList();
		model.addObject("user",users);
		model.addObject("roleList",roleList);
		model.addObject("userList",userList);
		return model;
	}
	@RequestMapping(value = "/deleteEmployeeById/{id}", method = RequestMethod.GET)
	public String deleteEmployeeDetails(@PathVariable("id") Integer id, @ModelAttribute("user") User user) {
		System.out.println("id ["+id+"]");
		int row = userService.deleteUser(id);
		System.out.println("row ["+row+"]");
		return "forward:/employee/showEmpForm.do";
	}
	
}
