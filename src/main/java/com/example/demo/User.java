package com.example.demo;

public class User {
    public String lastName;
    public String name;
     public String country;	
	public User(String name, String lastName, String country){
		this.name = name;
		this.lastName = lastName;
		this.country = country;
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
        public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
