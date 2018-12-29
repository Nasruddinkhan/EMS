package com.jsoft.ems.daoimpl;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jsoft.ems.bean.MenuModel;
import com.jsoft.ems.dao.LoginDAO;
import com.jsoft.ems.model.LoginInformation;
import com.jsoft.ems.model.User;
import com.jsoft.ems.util.CommonUtils;

/**
 * @author Nasruddin khan 
 *
1:29:15 AM
 */

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {
	//Changes for oracle connection
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User checkLogin(User user) {
		Session session = sessionFactory.openSession();
		System.out.println("LoginDAOImpl.checkLogin()");
		String SQL_QUERY = "from User where upper(loginId)=:loginId and password=:password";
		User uniqueResult =null;
		try {
			uniqueResult = (User)  session.createQuery(SQL_QUERY,User.class).setParameter("loginId", user.getLoginId().toUpperCase().trim()).setParameter("password",  user.getPassword()).uniqueResult();
		} catch (Exception e) {
			System.out.println("LoginDAOImpl.checkLogin() Exception["+e.getMessage()+"]");
			uniqueResult = new User();
		} finally {
			session.close();
		}
		return uniqueResult;
	}
	@Override
	public void saveLoginInformation(LoginInformation loginInformation) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(loginInformation);
	}
	@Override
	public void updateLogOutTime(String logOutTime, Timestamp logutTime) {
		sessionFactory.getCurrentSession().createQuery("update LoginInformation l set l.logOutTime = :newLogOutTime where sessionId = :newSessionId ").setParameter("newLogOutTime",LocalDateTime.now()).
		setParameter("newSessionId", logOutTime).executeUpdate();
	}
	@Override
	public List<MenuModel> getMenu(String userRoleId) {
		// TODO Auto-generated method stub
	
		System.out.println("userRoleId ["+userRoleId+"]");
		List<MenuModel>  menuList  = new ArrayList<MenuModel>();
		MenuModel menuModel = null;
		Session session = sessionFactory.getCurrentSession();
		String hqlUpdate = "select MENU_ID, MENU_NAME, MENU_URL, MENU_ICON, SUB_MENU_ICON from menu_sub_menu_master where role_id = :newUserRole and sub_menu_id = 0 order by  MENU_ORDER";
		Query query = session.createSQLQuery(hqlUpdate);
		query.setString("newUserRole", userRoleId);
		query.list();
		List<Object[]>  list = query.list();
		System.out.println(list);
		if(list != null && list.size() > 0){
			for (Object[] row: list) {
				menuModel = new MenuModel();
				menuModel.setMenuId(Integer.parseInt(row[0].toString()));
				menuModel.setMenuName(row[1].toString());
				menuModel.setMenuURL(row[2].toString());
				menuModel.setMenuIcon(row[3].toString());
				menuModel.setSubMenuArrowIcon(CommonUtils.checkNull(row[4]).toString());
				menuList.add(menuModel);
			}
		}
		return menuList;
	}
	@Override
	public Map<Integer,List<MenuModel>> getSubMenu(List<MenuModel> menuModel) {
		// TODO Auto-generated method stub
		List<MenuModel>  menuList  = null;
		MenuModel subMenuModel = null;
		Map<Integer,List<MenuModel>>  subMenuMap = new HashMap<Integer, List<MenuModel>> ();
		Session session = sessionFactory.getCurrentSession();
		for(MenuModel model : menuModel) {
			menuList  = new ArrayList<MenuModel>();
			int submenu = model.getMenuId();
			System.out.println(submenu);
			String hqlUpdate = "select MENU_ID, MENU_NAME, MENU_URL, MENU_ICON from menu_sub_menu_master where SUB_MENU_ID = :newMenuId and sub_menu_id != 0 order by  MENU_ORDER";
			Query query = session.createSQLQuery(hqlUpdate);
			query.setInteger("newMenuId",submenu);
			query.list();
			List<Object[]>  list = query.list();
			System.out.println(list);
			if(list != null && list.size() > 0){
				for (Object[] row: list) {
					subMenuModel = new MenuModel();
					subMenuModel.setMenuId(Integer.parseInt(row[0].toString()));
					subMenuModel.setMenuName(row[1].toString());
					subMenuModel.setMenuURL(row[2].toString());
					subMenuModel.setMenuIcon(row[3].toString());
					menuList.add(subMenuModel);
				}
				subMenuMap.put(submenu, menuList);
			}
		}
		return subMenuMap;
	}

}