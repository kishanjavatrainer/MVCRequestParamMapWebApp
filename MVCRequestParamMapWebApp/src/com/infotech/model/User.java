package com.infotech.model;

public class User {

	private String name;
	private int age;
	private String email;
	private String country;
	public User(String name, int age, String email, String country) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getCountry() {
		return country;
	}
}
