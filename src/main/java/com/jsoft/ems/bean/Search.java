package com.jsoft.ems.bean;

import java.io.Serializable;
/**
 * @author Nasruddin khan 
 *
1:35:10 AM
 */
public class Search implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String fromDate;
	private String toDate;
	private Integer userRole;
	
	public Integer getUserRole() {
		return userRole;
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}


}
