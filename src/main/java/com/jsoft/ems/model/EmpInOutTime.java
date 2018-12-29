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
 */
@Entity
@Table(name = "EmpInOutTime")
//@DynamicUpdate
public class EmpInOutTime extends BaseBean implements Serializable {
/**
	 * 
	 */
	
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "ID")
private Long id;
@Column(name = "DATE")
private String date;
@Column(name = "IN_TIME")
private String inTime;
@Column(name = "OUT_TIME")
private String outTime;
@Column(name = "HOURS")
private String hours;
@Column(name = "LATE_MARK")
private String lateMark;
@Column(name = "REMARK")
private String remark;
@Column(name = "EMP_ID")
private Long empID;
@Column(name = "LOGIN_ATTEMT")
private int loginCtr;
@Column(name = "LOGOUT_ATTEMT")
private int logoutCtr;
@Column(name = "LOGIN_TIME")
private String loginTime;
@Column(name = "LOGOUT_TIME")
private String logOutTime;
@Column(name = "DAY")
private String day;
@Column(name = "STATUS")
private String status;

public EmpInOutTime() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @return the id
 */
public Long getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}
/**
 * @return the date
 */
public String getDate() {
	return date;
}
/**
 * @param date the date to set
 */
public void setDate(String date) {
	this.date = date;
}
/**
 * @return the inTime
 */
public String getInTime() {
	return inTime;
}
/**
 * @param inTime the inTime to set
 */
public void setInTime(String inTime) {
	this.inTime = inTime;
}
/**
 * @return the outTime
 */
public String getOutTime() {
	return outTime;
}
/**
 * @param outTime the outTime to set
 */
public void setOutTime(String outTime) {
	this.outTime = outTime;
}
/**
 * @return the hours
 */
public String getHours() {
	return hours;
}
/**
 * @param hours the hours to set
 */
public void setHours(String hours) {
	this.hours = hours;
}
/**
 * @return the lateMark
 */
public String getLateMark() {
	return lateMark;
}
/**
 * @param lateMark the lateMark to set
 */
public void setLateMark(String lateMark) {
	this.lateMark = lateMark;
}
/**
 * @return the remark
 */
public String getRemark() {
	return remark;
}
/**
 * @param remark the remark to set
 */
public void setRemark(String remark) {
	this.remark = remark;
}
/**
 * @return the empID
 */
public Long getEmpID() {
	return empID;
}
/**
 * @param empID the empID to set
 */
public void setEmpID(Long empID) {
	this.empID = empID;
}
/**
 * @return the loginCtr
 */
public int getLoginCtr() {
	return loginCtr;
}
/**
 * @param loginCtr the loginCtr to set
 */
public void setLoginCtr(int loginCtr) {
	this.loginCtr = loginCtr;
}
/**
 * @return the logoutCtr
 */
public int getLogoutCtr() {
	return logoutCtr;
}
/**
 * @param logoutCtr the logoutCtr to set
 */
public void setLogoutCtr(int logoutCtr) {
	this.logoutCtr = logoutCtr;
}
/**
 * @return the loginTime
 */
public String getLoginTime() {
	return loginTime;
}
/**
 * @param loginTime the loginTime to set
 */
public void setLoginTime(String loginTime) {
	this.loginTime = loginTime;
}
/**
 * @return the logOutTime
 */
public String getLogOutTime() {
	return logOutTime;
}
/**
 * @param logOutTime the logOutTime to set
 */
public void setLogOutTime(String logOutTime) {
	this.logOutTime = logOutTime;
}
/**
 * @return the day
 */
public String getDay() {
	return day;
}
/**
 * @param day the day to set
 */
public void setDay(String day) {
	this.day = day;
}
/**
 * @return the status
 */
public String getStatus() {
	return status;
}
/**
 * @param status the status to set
 */
public void setStatus(String status) {
	this.status = status;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "EmpInOutTime [id=" + id + ", date=" + date + ", inTime=" + inTime + ", outTime=" + outTime + ", hours="
			+ hours + ", lateMark=" + lateMark + ", remark=" + remark + ", empID=" + empID + ", loginCtr=" + loginCtr
			+ ", logoutCtr=" + logoutCtr + ", loginTime=" + loginTime + ", logOutTime=" + logOutTime + ", day=" + day
			+ ", status=" + status + "]";
}

}
