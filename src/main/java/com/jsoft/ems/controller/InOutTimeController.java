package com.jsoft.ems.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsoft.ems.bean.Search;
import com.jsoft.ems.model.WorkRemark;
import com.jsoft.ems.service.LoginInOutService;
/**
 * @author Nasruddin khan 
 *
1:34:23 AM
 */
@Controller
@RequestMapping("InOutTime")
public class InOutTimeController {
	@Autowired
	private  LoginInOutService loginInOutService;
	@RequestMapping(value="inout", method=RequestMethod.GET)
	public ModelAndView showViewProfileForm(HttpSession session) {
		ModelAndView model = new ModelAndView("inout_time");
		Long empId = (Long)session.getAttribute("empID");
		model.addObject("loginDetails", loginInOutService.getTimeDetails(empId));
		return model;
	} 
	@RequestMapping(value="inTime", method=RequestMethod.GET)
	public String loginTime(HttpSession session) {
		Long empId = (Long)session.getAttribute("empID");
		System.out.println(empId);
		loginInOutService.checkLoginDetails(empId);
		return "forward:/InOutTime/inout.do";
	} 
	@RequestMapping(value="outTime", method=RequestMethod.GET)
	public String logoutTime(HttpSession session) {
		Long empId = (Long)session.getAttribute("empID");
		loginInOutService.checkLogOutDetails(empId);
		return "forward:/InOutTime/inout.do";
	}
	@RequestMapping(value="addworkRemark", method=RequestMethod.GET)
	public String addWorkRemark( ModelMap model , @ModelAttribute("workRemark") WorkRemark workRemark, HttpSession session ) {
		model.addAttribute("courseList", loginInOutService.getCourseList());
		return "add_work_status";
	} 
	@RequestMapping(value="workRemark", method= {RequestMethod.GET, RequestMethod.POST})
	public String showWorkRemark(@ModelAttribute("search") Search search, ModelMap model , @ModelAttribute("workRemark") WorkRemark workRemark, HttpSession session ) {
		Long empId = (Long)session.getAttribute("empID");
		System.out.println("empId ["+empId+"]");
		model.addAttribute("workRemarkList", loginInOutService.getRemarkList(empId));
		model.addAttribute("courseList", loginInOutService.getCourseList());
		return "work_remark";
	} 
	@RequestMapping(value = { "/workRemarkSave"}, method = RequestMethod.POST)
	public String saveWorkRemark(Model model , @ModelAttribute("workRemark") WorkRemark workRemark, HttpSession session ) {
		System.out.println("InOutTimeController.saveWorkRemark() ["+workRemark+"]");
		Long empId = (Long)session.getAttribute("empID");
		workRemark.setEmpID(empId);
		loginInOutService.saveWorkRemark(workRemark);
		return "forward:/InOutTime/workRemark.do";
	} 
	@RequestMapping(value = "/editWorkRemark/{workId}", method = RequestMethod.GET)
	public ModelAndView
	editWorkRemark( @PathVariable("workId") Long workId) {
		System.out.println("InOutTimeController.editWorkRemark() workId "+workId);
		ModelAndView model = new ModelAndView("add_work_status");
		WorkRemark workRemark = loginInOutService.getWorkRemark(workId);
		model.addObject("courseList", loginInOutService.getCourseList());
		model.addObject("workRemark", workRemark);
		
		//model.addObject(attributeName, attributeValue)
		return model;

	}

}
