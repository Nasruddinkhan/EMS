/**
 * 
 */
package com.jsoft.ems.friends;

import java.util.List;

/**
 * @author Nassruddin Khan
 *
 */
public class FriendsModel {
	private List<String> friends;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "FriendsModel [friends=" + friends + "]";
	}
}
