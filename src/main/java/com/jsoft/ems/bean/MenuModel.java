package com.jsoft.ems.bean;

/**
 * @author Nasruddin khan 
 *
1:35:07 AM
 */
public class MenuModel {
	int menuId;
	String menuName;
	String menuURL;
	String menuIcon;
	String subMenuArrowIcon;
	public String getSubMenuArrowIcon() {
		return subMenuArrowIcon;
	}
	public void setSubMenuArrowIcon(String subMenuArrowIcon) {
		this.subMenuArrowIcon = subMenuArrowIcon;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuURL() {
		return menuURL;
	}
	public void setMenuURL(String menuURL) {
		this.menuURL = menuURL;
	}

	public String getMenuIcon() {
		return menuIcon;
	}
	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}
	@Override
	public String toString() {
		return "MenuModel [menuId=" + menuId + ", menuName=" + menuName + ", menuURL=" + menuURL + ", menuIcon=" + menuIcon
				+ "]";
	}
	 
}
