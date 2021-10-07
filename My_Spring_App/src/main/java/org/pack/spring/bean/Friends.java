package org.pack.spring.bean;

import java.util.Map;

public class Friends {

	private Map<Integer,Person> friendList;

	public Map<Integer, Person> getFriendList() {
		return friendList;
	}

	public void setFriendList(Map<Integer, Person> friendList) {
		this.friendList = friendList;
	}

	@Override
	public String toString() {
		return "Friends [friendList=" + friendList + "]";
	}
	
}
