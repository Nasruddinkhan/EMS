package com.jsoft.ems.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.jsoft.ems.bean.MenuModel;
import com.jsoft.ems.model.LoginInformation;
import com.jsoft.ems.model.User;

public interface LoginDAO {
	User checkLogin(User user);
	void saveLoginInformation(LoginInformation loginInformation);
	void updateLogOutTime(String logOutTime, Timestamp timestamp);
	List<MenuModel> getMenu(String userRoleId);
	Map<Integer,List<MenuModel>>  getSubMenu(List<MenuModel> menuModel);
}
