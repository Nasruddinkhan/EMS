/**
 * 
 */
package com.jsoft.ems.dao;

import com.jsoft.ems.model.PersonalDetails;

/**
 * @author Nasruddin khan Waris
 *
12:42:03 AM
 */
public interface PersonalDetailsDao {

	public void savePersonalDetail(PersonalDetails details);
	public PersonalDetails getPersonalDetails(Long empId);
}
