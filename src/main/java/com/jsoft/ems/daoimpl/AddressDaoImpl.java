/**
 * 
 */
package com.jsoft.ems.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsoft.ems.dao.AddressDao;
import com.jsoft.ems.model.PresentAddress;

/**
 * @author Nassruddin Khan
 *
 */
@Repository("addressDao")
public class AddressDaoImpl implements AddressDao {
	@Autowired
	private SessionFactory sessionFactory;
	/* (non-Javadoc)
	 * @see com.jsoft.ems.dao.AddressDao#saveAddressDetails(com.jsoft.ems.model.PresentAddress)
	 */
	@Override
	public void saveAddressDetails(PresentAddress address) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(address);
	}
	/* (non-Javadoc)
	 * @see com.jsoft.ems.dao.AddressDao#getAddressDetails(java.lang.Long)
	 */
	@Override
	public List<PresentAddress> getAddressDetails(Long empId) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from PresentAddress where empId = :empId", PresentAddress.class).setParameter("empId",  empId ).list();
	}

}
