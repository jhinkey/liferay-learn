package com.acme.b4k8.model;

public class Person {

	public Person(String name, String emailAddress) {
		_name = name;
		_emailAddress = emailAddress;
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