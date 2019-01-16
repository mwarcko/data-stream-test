package com.shieldingshell.club;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Function {
	public void writeClub(File file, Club club) throws IOException {
		try (FileOutputStream fop = new FileOutputStream(file); ObjectOutputStream oop = new ObjectOutputStream(fop)) {
			if (!file.exists()) {
				file.createNewFile();
			}
			oop.writeObject(club);
		}
	}

	public Club readClub(File file) {
		Club club = new Club();
		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
			while ((club = (Club) ois.readObject()) != null) {
				System.out.println(club.getMembers());
			}
		} catch (IOException | ClassNotFoundException e) {
			if (e instanceof EOFException) {
				System.out.println("End of file");
			} else {
				e.printStackTrace();
			}
		}
		return club;
	}

	public String[] listDirectory(String currentDirectory) {
		File file = new File(currentDirectory);
		return file.list();
	}

}
