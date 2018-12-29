package com.jsoft.ems.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;

/**
 * @author Nasruddin khan 
 *
1:31:55 AM
 */
@MappedSuperclass
public class BaseBean {
	@Column(name ="CREATED_DATE")	
	@CreationTimestamp
    private LocalDateTime createdDate;
	
	@Column(name ="CREATEDBY")	
private String createdBy;
	
	@Column(name ="MODIFIED_DATE")	
private Date modifiedDate;
	
	@Column(name ="MODIFIEDBY")	
private String modifiedBy;

public BaseBean(){}


public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public Date getModifiedDate() {
	return modifiedDate;
}
public void setModifiedDate(Date modifiedDate) {
	this.modifiedDate = modifiedDate;
}
public String getModifiedBy() {
	return modifiedBy;
}
public void setModifiedBy(String modifiedby) {
	this.modifiedBy = modifiedby;
}


public LocalDateTime getCreatedDate() {
	return createdDate;
}


public void setCreatedDate(LocalDateTime createdDate) {
	this.createdDate = createdDate;
}
}
