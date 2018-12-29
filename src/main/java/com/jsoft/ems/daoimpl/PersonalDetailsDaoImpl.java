/**
 * 
 */
package com.jsoft.ems.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsoft.ems.dao.PersonalDetailsDao;
import com.jsoft.ems.model.PersonalDetails;

/**
 * @author Nasruddin khan Waris
 *
12:47:01 AM
 */
@Repository("personalDetailsDao")
public class PersonalDetailsDaoImpl implements PersonalDetailsDao{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void savePersonalDetail(PersonalDetails details) {
		// TODO Auto-generated method stub
		System.out.println(details.getDateOfBirth() + "AAAAAAAAAAAAAAAAAAAA");
		sessionFactory.getCurrentSession().saveOrUpdate(details);
	}
	@Override
	public PersonalDetails getPersonalDetails(Long empId) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from PersonalDetails where empID = :empId", PersonalDetails.class).setParameter("empId",  empId ).uniqueResult();
	}

}
