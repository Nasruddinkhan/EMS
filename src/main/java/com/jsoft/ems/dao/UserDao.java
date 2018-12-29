package com.jsoft.ems.dao;

import java.util.List;

import com.jsoft.ems.model.RoleMaster;
import com.jsoft.ems.model.User;

public interface UserDao {
	public List<RoleMaster> getRoles();
	public List<User> getUsersList();
	public void saveEmployees(User user);
	public User getUsersList(Integer id);
	public int deleteUser(Integer id);
}
