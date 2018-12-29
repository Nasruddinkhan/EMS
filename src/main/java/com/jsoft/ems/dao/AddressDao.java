/**
 * 
 */
package com.jsoft.ems.dao;

import java.util.List;

import com.jsoft.ems.model.PresentAddress;

/**
 * @author Nassruddin Khan
 *
 */
public interface AddressDao {
	void saveAddressDetails(PresentAddress address);

	/**
	 * @param empId
	 * @return
	 */
	List<PresentAddress> getAddressDetails(Long empId);
}
