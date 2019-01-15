package com.shieldingshell.datastream;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main  {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\ressources\\testwrite.txt");
		write(file);
		read(file);
	}

	public static void write(File file) throws IOException {
		try(FileOutputStream fop = new FileOutputStream(file);
				ObjectOutputStream oop = new ObjectOutputStream(fop)){
			Member member = new Member(12L, "John", "Doe", 45);
			Member member2 = new Member(11L, "Jane", "Doe", 45);
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
			oop.writeObject(member);
			oop.writeObject(member2);
		}
	}
	
	public static void read(File file){
		int counter = 0;
		
		try(FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Member member;
			
			while((member = (Member) ois.readObject()) !=null) {
				System.out.println("pointure " + member.getPointure());
				System.out.println("firstname " + member.getFirstName());
				System.out.println("lastname " + member.getLastName());
				System.out.println("age " + member.getAge());
				counter++;
			}
		}catch (IOException | ClassNotFoundException e) {
			if(e instanceof EOFException) {
				System.out.println("End of file, objects : " + counter);
			}else {
				e.printStackTrace();
			}
		}
	}
	
}
