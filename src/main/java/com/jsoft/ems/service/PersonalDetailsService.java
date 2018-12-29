/**
 * 
 */
package com.jsoft.ems.service;

import com.jsoft.ems.model.PersonalDetails;

/**
 * @author Nasruddin khan Waris
 *
12:56:38 AM
 */
public interface PersonalDetailsService {
	public void savePersonalDetail(PersonalDetails details);
	public PersonalDetails getPersonalDetails(Long empId);
}
