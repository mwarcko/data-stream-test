package com.shieldingshell.club;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class Club {

	String name;
	List<Member> members = new LinkedList<>();
	File dataFile;

	public Club(String name, List<Member> members, File dataFile) {
		super();
		this.name = name;
		this.members = members;
		this.dataFile = dataFile;
	}

	public final File getDataFile() {
		return dataFile;
	}

	public final void setDataFile(File dataFile) {
		this.dataFile = dataFile;
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
		return "Club [name=" + name + ", members=" + members + ", dataFile=" + dataFile + "]";
	}

}
