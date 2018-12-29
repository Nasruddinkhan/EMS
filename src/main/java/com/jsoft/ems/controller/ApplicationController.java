/**
 * 
 */
package com.jsoft.ems.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsoft.ems.model.EMSCode;
import com.jsoft.ems.model.EducationBean;
import com.jsoft.ems.model.PersonalDetails;
import com.jsoft.ems.model.PresentAddress;
import com.jsoft.ems.model.User;
import com.jsoft.ems.service.AddressServices;
import com.jsoft.ems.service.EducationService;
import com.jsoft.ems.service.PersonalDetailsService;
/**
 * @author Nasruddin khan Waris
 *
19:01:14
 */
@Controller
@RequestMapping("application")
public class ApplicationController {

	@Autowired
	PersonalDetailsService 	personalDetailsService;
	@Autowired
	EducationService educationService;
	@Autowired
	AddressServices  addressServices;
	@RequestMapping(value="education", method= {RequestMethod.POST,RequestMethod.GET})
	public String showEducationDetails(@ModelAttribute("code") EMSCode code, ModelMap modelMap, @ModelAttribute("educationBean") EducationBean educationBean, HttpSession session) {
		modelMap.addAttribute("courseTypeList", educationService.getCourseType());
		modelMap.addAttribute("courseTittleList", educationService.getcourseTitleList());
		
		String courseTitleStr = "";
		List<EducationBean> educationBeans = educationService.getEducationList((Long)session.getAttribute("empID"));
		modelMap.addAttribute("detailEducationlist",educationBeans);
		for(EducationBean bean : educationBeans) {
			if(educationBeans != null && educationBeans.size()>0) {
				courseTitleStr +=bean.getCourseTitle()+":";
			}
		}
		System.out.println(courseTitleStr.substring(0, courseTitleStr.length()-1));
		modelMap.addAttribute("courseTitleStr",courseTitleStr.substring(0, courseTitleStr.length()-1));
		return "add_education";
		}
		
	
	@RequestMapping(value="saveEducation" ,method=RequestMethod.POST)
	public String saveEducationDetails(@ModelAttribute("educationBean") EducationBean educationBean,BindingResult result,HttpSession session) {
		educationBean.setEmp_id((Long)session.getAttribute("empID"));
		educationService.saveEducationData(educationBean);
		return "redirect:/application/education.do";
	}
	@RequestMapping("break")
	public String showBreakDetails() {
		return "add_break";
	}
	@RequestMapping("work")
	public String showWorkDetails() {
		return "add_work";
	}
	@RequestMapping("declaration")
	public String showDeclarationDetails() {
		return "add_declaration";
	}
	@RequestMapping("personal")
	public ModelAndView showPersonalPage(@ModelAttribute("personal")PersonalDetails personal ,  BindingResult result, HttpSession session) {
		Long empId = (Long)session.getAttribute("empID");
		ModelAndView modelAndView = new ModelAndView("add_personal");
		 personal = personalDetailsService.getPersonalDetails(empId);
		 if(personal != null) {
			 User user=	(User)session.getAttribute("users");
			 personal.setAadharNumber(user.getAadhaarNo());
			 personal.setPanNumber(user.getPanNo());
			 personal.setEmail(user.getEmail());
			 System.out.println("ApplicationController.showPersonalPage() ["+personal+"]");
		 }
		return modelAndView;
	}
	@RequestMapping("address")
	public String showAddressPage(@ModelAttribute("address")PresentAddress presentAddress ,  BindingResult result,   ModelMap modelMap, HttpSession session) {
		Long empId = (Long)session.getAttribute("empID");
		List<PresentAddress> addrresList = addressServices.getAddressDetails(empId);
		System.out.println("ApplicationController.showAddressPage()["+addrresList);
		modelMap.addAttribute("addrresList", addrresList);
		String addressTitleStr =  "";
		if(addrresList != null && addrresList.size()>0) {
			for(PresentAddress bean : addrresList) {
				addressTitleStr +=bean.getStatus()+":";
			}
			System.out.println(addressTitleStr.substring(0, addressTitleStr.length()-1));
			modelMap.addAttribute("addrTitleStr",addressTitleStr.substring(0, addressTitleStr.length()-1));
		}
		return "add_address";
	}
	@RequestMapping(value = { "/save_address"}  , method= {RequestMethod.POST})
	public String saveAddressDetails(@ModelAttribute("address")PresentAddress presentAddress ,  BindingResult result, HttpSession session) {
		System.out.println("ApplicationController.saveAddressDetails()"+presentAddress);
		presentAddress.setEmpId((Long)session.getAttribute("empID"));
		addressServices.saveAddressDetails(presentAddress);
		return "redirect:/application/address.do";
	}
	
	
/*	@RequestMapping("address")
	public String saveAddressDtl(@ModelAttribute("address")PresentAddress presentAddress ,  BindingResult result) {
		return "add_address";
	}*/
	
	@RequestMapping(value = { "/save_personal"}  , method= {RequestMethod.POST})
	public String savePersonalDetails(@ModelAttribute("personal")PersonalDetails personal ,BindingResult result,  HttpSession session) {
		System.out.println("personal ["+personal+"]");
		personalDetailsService.savePersonalDetail(personal);
		return "add_personal";
	}
}

