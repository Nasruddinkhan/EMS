/**
 * 
 */
package com.jsoft.ems.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsoft.ems.dao.PersonalDetailsDao;
import com.jsoft.ems.model.PersonalDetails;
import com.jsoft.ems.service.PersonalDetailsService;

/**
 * @author Nasruddin khan Waris
 *
12:59:02 AM
 */
@Service("personalDetailsService")
@Transactional
public class PersonalDetailsServiceImpl implements PersonalDetailsService {

	@Autowired
	private PersonalDetailsDao personalDetailsDao;
	@Override
	public void savePersonalDetail(PersonalDetails details) {
		// TODO Auto-generated method stub
		 personalDetailsDao.savePersonalDetail(details);
	}
	@Override
	public PersonalDetails getPersonalDetails(Long empId) {
		// TODO Auto-generated method stub
		return personalDetailsDao.getPersonalDetails(empId);
	}

}
