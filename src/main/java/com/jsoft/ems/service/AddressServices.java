package com.jsoft.ems.service;

import java.util.List;

import com.jsoft.ems.model.PresentAddress;

public interface AddressServices {
	void saveAddressDetails(PresentAddress address);

	/**
	 * @param empId
	 * @return
	 */
	List<PresentAddress> getAddressDetails(Long empId);
}
