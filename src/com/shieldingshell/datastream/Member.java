package com.shieldingshell.datastream;

import java.io.Serializable;

public class Member implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Long pointure;
	String firstName;
	String lastName;
	int age;

	public Member(Long pointure, String firstName, String lastName, int age) {
		super();
		this.pointure = pointure;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public Long getPointure() {
		return pointure;
	}
	public void setPointure(Long pointure) {
		this.pointure = pointure;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Member [pointure=" + pointure + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
