package com.jsoft.ems.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
/**
 * @author Nasruddin khan 
 *
1:31:45 AM
 */
@Entity
@Table(name="Login_Information")
public class LoginInformation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	@Column(name = "USER_ID")
	private String userId;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "PLATFORM")
	private String platform;
	@Column(name = "BROWSER")
	private String browser;
	@Column(name = "IP_ADDRESS")
	private String ipaddress;
	@CreationTimestamp
	@Column(name = "LOGIN_TIME")
	private LocalDateTime loginTime;
	@Column(name = "LOGOUT_TIME")
	private LocalDateTime logOutTime;
	@Column(name = "SESSION_ID")
	private String sessionId;
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	public LocalDateTime getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(LocalDateTime loginTime) {
		this.loginTime = loginTime;
	}
	public LocalDateTime getLogOutTime() {
		return logOutTime;
	}
	public void setLogOutTime(LocalDateTime logOutTime) {
		this.logOutTime = logOutTime;
	}
}
