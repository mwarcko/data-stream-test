package com.shieldingshell.club;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Club implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private List<Member> members = new LinkedList<>();

	public Club() {
	}
	
	public Club(String name, List<Member> members) {
		super();
		this.name = name;
		this.members = members;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final List<Member> getMembers() {
		return members;
	}

	public final void setMembers(List<Member> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "Club [name=" + name + ", members=" + members + "]";
	}

}
