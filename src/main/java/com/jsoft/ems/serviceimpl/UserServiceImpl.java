package com.jsoft.ems.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsoft.ems.dao.UserDao;
import com.jsoft.ems.model.RoleMaster;
import com.jsoft.ems.model.User;
import com.jsoft.ems.service.UserService;
import com.jsoft.ems.util.CommonUtils;

/**
 * @author Nasruddin khan 
 *
1:33:04 AM
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Override
	public List<RoleMaster> getRoles() {
		// TODO Auto-generated method stub
		return userDao.getRoles();
	}
	@Override
	public List<User> getUsersList() {
		// TODO Auto-generated method stub
		return userDao.getUsersList();
	}
	@Override
	public void saveEmployees(User user) {
		// TODO Auto-generated method stub
		String encodeValue = (String) CommonUtils.checkNull(user.getEncodeStr());
		if(encodeValue.length() == 0) {
			user.setEncodeStr(CommonUtils.base64Encoding(CommonUtils.createDynamicImage(user.getFirstName())));
			if(null == user.getPhoto()) {
				String encodeStr[] = encodeValue.split(",");
				byte[] bytes =CommonUtils.Base64ToBytes(encodeValue.substring(encodeStr[0].length()));
				user.setPhoto(bytes);
			}
		}else {
			String encodeStr[] = encodeValue.split(",");
			byte[] bytes =CommonUtils.Base64ToBytes(encodeValue.substring(encodeStr[0].length()));
			user.setPhoto(bytes);
		}
		userDao.saveEmployees(user);
	}
	@Override
	public User getUsersList(Integer id) {
		// TODO Auto-generated method stub
		return userDao.getUsersList(id);
	}
	@Override
	public int deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}

}
