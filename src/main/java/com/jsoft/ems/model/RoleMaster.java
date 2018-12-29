package com.jsoft.ems.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author Nasruddin khan 
 *
1:31:28 AM
 */
@Entity
@Table(name="ROLE_MASTER")
public class RoleMaster  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private Integer ROLE_ID;
	private String ROLE_NAME;
	private String CREATED_BY;
	private String CREATED_DATE;
	private String MODIFIED_BY;
	private String MODIFIED_DATE;

	public String getROLE_NAME() {
		return ROLE_NAME;
	}
	public void setROLE_NAME(String rOLE_NAME) {
		ROLE_NAME = rOLE_NAME;
	}
	public String getCREATED_BY() {
		return CREATED_BY;
	}
	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}
	public String getCREATED_DATE() {
		return CREATED_DATE;
	}
	public void setCREATED_DATE(String cREATED_DATE) {
		CREATED_DATE = cREATED_DATE;
	}
	public String getMODIFIED_BY() {
		return MODIFIED_BY;
	}
	public void setMODIFIED_BY(String mODIFIED_BY) {
		MODIFIED_BY = mODIFIED_BY;
	}
	public String getMODIFIED_DATE() {
		return MODIFIED_DATE;
	}
	public void setMODIFIED_DATE(String mODIFIED_DATE) {
		MODIFIED_DATE = mODIFIED_DATE;
	}
	@Override
	public String toString() {
		return "ROLE_MASTER [ROLE_ID=" + ROLE_ID + ", ROLE_NAME=" + ROLE_NAME + ", CREATED_BY=" + CREATED_BY
				+ ", CREATED_DATE=" + CREATED_DATE + ", MODIFIED_BY=" + MODIFIED_BY + ", MODIFIED_DATE=" + MODIFIED_DATE
				+ "]";
	}
	public Integer getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(Integer rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}



}
