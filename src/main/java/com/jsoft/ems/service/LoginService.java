package com.jsoft.ems.service;

import java.util.List;
import java.util.Map;

import com.jsoft.ems.bean.MenuModel;
import com.jsoft.ems.model.LoginInformation;
import com.jsoft.ems.model.User;

/**
 * @author Nasruddin khan 
 *
1:32:32 AM
 */
public interface LoginService{
	public User checkLogin(User user);
	public void saveLoginInformation(LoginInformation loginInformation);
	public void updateLogOutTime(String logOutTime);
	List<MenuModel> getMenu(String userRoleId);
	Map<Integer,List<MenuModel>> getSubMenu(List<MenuModel> menuModel);
}