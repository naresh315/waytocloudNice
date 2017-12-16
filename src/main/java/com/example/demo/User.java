package com.example.demo;

public class User {
    public String lastName;
    public String name;
	public User(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
