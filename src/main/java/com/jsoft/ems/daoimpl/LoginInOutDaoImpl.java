package com.jsoft.ems.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsoft.ems.dao.LoginInOutDao;
import com.jsoft.ems.model.CourseMaster;
import com.jsoft.ems.model.EmpInOutTime;
import com.jsoft.ems.model.WorkRemark;
/**
 * @author Nasruddin khan 
 *
1:33:44 AM
 */
@Repository("LoginInOutDao")
public class LoginInOutDaoImpl implements LoginInOutDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<EmpInOutTime> getTimeDetails(Long empId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query  query =session.createQuery("from EmpInOutTime e where e.empID = :empID order by e.createdDate desc ",EmpInOutTime.class);
		query.setParameter("empID", empId);
		query.setFirstResult(0);
		query.setMaxResults(10);
		return  query.getResultList();
	}
	@Override
	public EmpInOutTime checkLoginDetails(Long empID, String curDate) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(EmpInOutTime.class);
		criteria.add(Restrictions.eq("empID", empID));
		criteria.add(Restrictions.eq("date", curDate));
		EmpInOutTime empInOutTime  = (EmpInOutTime) criteria.uniqueResult();
		return  empInOutTime;
	}
	@Override
	public void saveInTimeDetails(EmpInOutTime empInOutTime) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(empInOutTime);
	}
	@Override
	public void saveWorkRemark(WorkRemark workRemark) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(workRemark);
	}
	@Override
	public List<WorkRemark> getRemarkList(Long empId) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from WorkRemark e where e.empID = :empID order by e.createdDate desc",WorkRemark.class).setParameter("empID", empId).list();
	}
	/* (non-Javadoc)
	 * @see com.jsoft.ems.dao.LoginInOutDao#getCourseList()
	 */
	@Override
	public List<CourseMaster> getCourseList() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from CourseMaster", CourseMaster.class).list();

	}
	/* (non-Javadoc)
	 * @see com.jsoft.ems.dao.LoginInOutDao#getWorkRemark(java.lang.Long)
	 */
	@Override
	public WorkRemark getWorkRemark(Long workId) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from WorkRemark  where workId = :workId ", WorkRemark.class).setParameter("workId", workId.intValue()).uniqueResult();
	}
}
