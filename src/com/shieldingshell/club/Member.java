package com.shieldingshell.club;

public class Member {
	
	String firstName;
	String lastName;
	Integer age;
	Long licence;

	public Member(String firstName, String lastName, Integer age, Long licence) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.licence = licence;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Long getLicence() {
		return licence;
	}
	public void setLicence(Long licence) {
		this.licence = licence;
	}
	@Override
	public String toString() {
		return "Member [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", licence=" + licence
				+ "]";
	}
	
	
}
