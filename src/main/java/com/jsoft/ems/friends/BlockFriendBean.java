/**
 * 
 */
package com.jsoft.ems.friends;

import java.io.Serializable;

/**
 * @author Nassruddin Khan
 *
 */
public class BlockFriendBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String requestor;
	private String target;
	public String getRequestor() {
		return requestor;
	}
	public void setRequestor(String requestor) {
		this.requestor = requestor;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}

}
