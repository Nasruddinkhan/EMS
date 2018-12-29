/**
 * 
 */
package com.jsoft.ems.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsoft.ems.dao.AddressDao;
import com.jsoft.ems.model.PresentAddress;
import com.jsoft.ems.service.AddressServices;

/**
 * @author Nassruddin Khan
 *
 */
@Transactional
@Service("addressServices")
public class AddressServicesImpl implements AddressServices {

	@Autowired
	AddressDao addressDao;
	/* (non-Javadoc)
	 * @see com.jsoft.ems.service.AddressServices#saveAddressDetails(com.jsoft.ems.model.PresentAddress)
	 */
	@Override
	public void saveAddressDetails(PresentAddress address) {
		// TODO Auto-generated method stub
		addressDao.saveAddressDetails(address);
	}
	/* (non-Javadoc)
	 * @see com.jsoft.ems.service.AddressServices#getAddressDetails(java.lang.Long)
	 */
	@Override
	public List<PresentAddress> getAddressDetails(Long empId) {
		// TODO Auto-generated method stub
		return addressDao.getAddressDetails(empId);
	}

}
