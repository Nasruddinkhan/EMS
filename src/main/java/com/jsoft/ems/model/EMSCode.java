package com.jsoft.ems.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MST_EMS_CODE")
public class EMSCode extends BaseBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 90645278426270457L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable= false)
	private Integer CODE_ID;
	private String  CODE_TYPE;
	private String  CODE_DESCRIPTION;
	private String  COMMENT;
	private String  CODE_NAME;
	public String getCODE_NAME() {
		return CODE_NAME;
	}
	public void setCODE_NAME(String cODE_NAME) {
		CODE_NAME = cODE_NAME;
	}
	public Integer getCODE_ID() {
		return CODE_ID;
	}
	public void setCODE_ID(Integer cODE_ID) {
		CODE_ID = cODE_ID;
	}
	public String getCODE_TYPE() {
		return CODE_TYPE;
	}
	public void setCODE_TYPE(String cODE_TYPE) {
		CODE_TYPE = cODE_TYPE;
	}
	public String getCODE_DESCRIPTION() {
		return CODE_DESCRIPTION;
	}
	public void setCODE_DESCRIPTION(String cODE_DESCRIPTION) {
		CODE_DESCRIPTION = cODE_DESCRIPTION;
	}
	public String getCOMMENT() {
		return COMMENT;
	}
	public void setCOMMENT(String cOMMENT) {
		COMMENT = cOMMENT;
	}


}
