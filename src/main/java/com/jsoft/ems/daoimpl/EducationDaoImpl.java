package com.jsoft.ems.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsoft.ems.dao.EducationDao;
import com.jsoft.ems.model.EMSCode;
import com.jsoft.ems.model.EducationBean;

@Repository("educationDao")
public class EducationDaoImpl implements EducationDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<EMSCode> getCourseType() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from EMSCode where CODE_NAME = :codeName ", EMSCode.class).setParameter("codeName", "COURSETYPE").list();
	}
	@Override
	public List<EMSCode> getcourseTitleList() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from EMSCode where CODE_NAME = :codeName ", EMSCode.class).setParameter("codeName", "COURSETITLE").list();
	}
	@Override
	public int saveEducationData(EducationBean bean) {
		sessionFactory.getCurrentSession().saveOrUpdate(bean);
		return 0;
	}
	@Override
	public List<EducationBean> getEducationList(Long empId) {
		System.out.println("EducationDaoImpl.getEducationList() ["+empId+"]");
		List<EducationBean> lstGetEducationDetails= sessionFactory.getCurrentSession().createQuery("from EducationBean where emp_id = :empId", EducationBean.class).setParameter("empId",  empId ).list();
		return lstGetEducationDetails;
	}

}
