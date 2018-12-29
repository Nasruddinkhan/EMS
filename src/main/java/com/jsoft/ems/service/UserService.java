package com.jsoft.ems.service;

import java.util.List;

import com.jsoft.ems.model.RoleMaster;
import com.jsoft.ems.model.User;
/**
 * @author Nasruddin khan 
 *
1:32:37 AM
 */
public interface UserService {
	public List<RoleMaster> getRoles();
	public List<User> getUsersList();
	public void saveEmployees(User user);
	public User getUsersList(Integer id);
	public int deleteUser(Integer id);
}
