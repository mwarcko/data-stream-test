package com.shieldingshell.club;

import java.io.Serializable;

public class Member implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private Integer age;
	private Long licence;
	private Club club;

	public Member(String firstName, String lastName, Integer age, Long licence, Club club) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.licence = licence;
		this.club = club;
	}

	public final Club getClub() {
		return club;
	}

	public final void setClub(Club club) {
		this.club = club;
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
				+ ", club=" + club.getName() + "]";
	}

}
