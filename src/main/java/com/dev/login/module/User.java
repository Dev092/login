package com.dev.login.module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_info")
public class User {
	@Id
	private String Email;
	private String firstName;
	private String LastName;
	private int age;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String email, String firstName, String lastName, int age) {
		super();
		Email = email;
		this.firstName = firstName;
		LastName = lastName;
		this.age = age;
	}
	
	public User() {}
	
	

}
