package com.jsoft.ems.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jsoft.ems.dao.UserDao;
import com.jsoft.ems.model.RoleMaster;
import com.jsoft.ems.model.User;
/**
 * @author Nasruddin khan 
 *
1:33:36 AM
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<RoleMaster> getRoles() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from RoleMaster", RoleMaster.class).list();
	}

	@Override
	public List<User> getUsersList() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from User", User.class).list();
	}

	@Override
	public void saveEmployees(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@Override
	public User getUsersList(Integer id) {
		return (User)sessionFactory.getCurrentSession().createQuery("from User u where u.id=:id",User.class).setParameter("id", Long.valueOf(id)).uniqueResult();
	}

	@Override
	public int deleteUser(Integer id) {
		return 	sessionFactory.getCurrentSession().createQuery("delete User  where id=:id").setParameter("id", Long.valueOf(id)).executeUpdate();
	}

}
