package com.jsoft.ems.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Nasruddin khan 
 *
1:31:37 AM
 */
@Entity
@Table(name="MENU_SUB_MENU_MASTER")
public class MenuSubMenu extends BaseBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int MENU_ID;
	private int SUB_MENU_ID;
	private String MENU_NAME;
	private String MENU_URL;
	private String MENU_ICON;
	@Column(name = "SUB_MENU_ICON")
	private String subMenuArrowIcon;
	@ManyToOne
	@JoinColumn(name = "ROLE_ID")
	private RoleMaster roleMaster;
	private int MENU_ORDER;
	private String JS_EVENT;
	public String getMENU_ICON() {
		return MENU_ICON;
	}
	public void setMENU_ICON(String mENU_ICON) {
		MENU_ICON = mENU_ICON;
	}
	public String getJS_EVENT() {
		return JS_EVENT;
	}
	public void setJS_EVENT(String jS_EVENT) {
		JS_EVENT = jS_EVENT;
	}
	public int getMENU_ID() {
		return MENU_ID;
	}
	public void setMENU_ID(int mENU_ID) {
		MENU_ID = mENU_ID;
	}
	public int getSUB_MENU_ID() {
		return SUB_MENU_ID;
	}
	public void setSUB_MENU_ID(int sUB_MENU_ID) {
		SUB_MENU_ID = sUB_MENU_ID;
	}
	public String getMENU_NAME() {
		return MENU_NAME;
	}
	public void setMENU_NAME(String mENU_NAME) {
		MENU_NAME = mENU_NAME;
	}
	public String getMENU_URL() {
		return MENU_URL;
	}
	public void setMENU_URL(String mENU_URL) {
		MENU_URL = mENU_URL;
	}
	public RoleMaster getRoleMaster() {
		return roleMaster;
	}
	public void setRoleMaster(RoleMaster roleMaster) {
		this.roleMaster = roleMaster;
	}
	public int getMENU_ORDER() {
		return MENU_ORDER;
	}
	public void setMENU_ORDER(int mENU_ORDER) {
		MENU_ORDER = mENU_ORDER;
	}
	@Override
	public String toString() {
		return "MenuSubMenu [MENU_ID=" + MENU_ID + ", MENU_NAME=" + MENU_NAME + ", MENU_ORDER=" + MENU_ORDER
				+ ", MENU_URL=" + MENU_URL + ", roleMaster=" + roleMaster + ", SUB_MENU_ID=" + SUB_MENU_ID + "]";
	}
}
