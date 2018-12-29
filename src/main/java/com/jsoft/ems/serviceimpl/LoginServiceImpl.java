package com.jsoft.ems.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsoft.ems.bean.MenuModel;
import com.jsoft.ems.dao.LoginDAO;
import com.jsoft.ems.model.LoginInformation;
import com.jsoft.ems.model.User;
import com.jsoft.ems.service.LoginService;
import com.jsoft.ems.util.CommonUtils;

/**
 * @author Nasruddin khan 
 *
1:32:58 AM
 */
@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {

	 @Autowired
	 private LoginDAO loginDAO;
	  
      
       public User checkLogin(User user){
            System.out.println(" loginDAO ["+user+"]");
              return loginDAO.checkLogin(user);
       }


	@Override
	public void saveLoginInformation(LoginInformation loginInformation) {
		// TODO Auto-generated method stub
		loginDAO.saveLoginInformation(loginInformation);
	}


	@Override
	public void updateLogOutTime(String logOutTime) {
		loginDAO.updateLogOutTime(logOutTime, CommonUtils.getCurrentDateTime());
	}


	@Override
	public List<MenuModel> getMenu(String userRoleId) {
		// TODO Auto-generated method stub
		return loginDAO.getMenu(userRoleId);
	}


	@Override
	public Map<Integer,List<MenuModel>> getSubMenu(List<MenuModel> menuModel) {
		// TODO Auto-generated method stub
		return loginDAO.getSubMenu(menuModel);
	}
}