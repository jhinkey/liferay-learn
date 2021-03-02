package com.acme.b4k8.model;

public class Member {

	public Member(String emailAddress, String name) {
		_emailAddress = emailAddress;
		_name = name;
	}

	public String getEmailAddress() {
		return _emailAddress;
	}

	public String getName() {
		return _name;
	}

	private final String _emailAddress;
	private final String _name;

}