package com.Spring.StandAloneCollection;

import java.util.List;

public class Person {
	
	@Override
	public String toString() {
		return "Person [friends=" + friends + "]";
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	private List <String> friends ;

}
