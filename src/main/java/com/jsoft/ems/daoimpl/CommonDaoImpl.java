package com.jsoft.ems.daoimpl;

import java.sql.Clob;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsoft.ems.bean.UploadForm;
import com.jsoft.ems.dao.CommonDao;

/**
 * @author Nasruddin khan 
 *
1:28:58 AM
 */
@Repository("commonDao")
public class CommonDaoImpl implements CommonDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public int updateProfilePhoto(UploadForm form) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
	//	Clob clob = createClob(session, form.getEncodeString());
		Query query = session.createSQLQuery("update users set photo  = :photo , encodeStr = :encodeStr where id = :eid");
		query.setBinary("photo", form.getBytes());
		query.setInteger("eid", form.getEmpId());
		query.setString("encodeStr", form.getEncodeString());
		return query.executeUpdate();
	}
	public Clob createClob(org.hibernate.Session s, String encodeString) {
	    return s.getLobHelper().createClob(encodeString);
	}
}
