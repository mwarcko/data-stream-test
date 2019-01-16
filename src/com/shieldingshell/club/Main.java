package com.shieldingshell.club;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final String PREFIXE = "C:\\ressources\\club";
		boolean exit = false;
		Function fct = new Function();
		Scanner sc = new Scanner(System.in);
		while (!exit) {
			System.out.println("What do you want to do (createmember, delmember, lstall, lstclub, exit, help) ?");
			String choice = sc.nextLine();
			switch (choice) {
			case "help":
				System.out.println("==============HELP=============");
				System.out.println("createmember to create a member");
				System.out.println("delmember to delete a member");
				System.out.println("lstall to list the clubs");
				System.out.println("lstclub to list the members of a club");
				System.out.println("exit to quit");
				System.out.println("help to display this");
				System.out.println("==============HELP=============");
				break;
			case "lstall":
				String[] list = fct.listDirectory(PREFIXE);
				for (String club : list) {
					System.out.println(club);
				}
				break;
			case "delemember":
				
				break;
			case "createmember":
				boolean exitCreateMember = false;
				do {
					System.out.println("First Name ?");
					String firstName = sc.nextLine();
					System.out.println("Last Name ?");
					String lastName = sc.nextLine();
					System.out.println("Age ?");
					Integer age = sc.nextInt();
					System.out.println("Licence number ?");
					Long licence = sc.nextLong();
					System.out.println("Club ?");
					String clubName = sc.nextLine();
					clubName = sc.nextLine();
					File file = new File(PREFIXE + "\\" + clubName);
					Club club = new Club();
					// check if club already exist
					if (!file.exists()) {
						try {
							file.createNewFile();
							club = new Club(clubName, new LinkedList<>());
						} catch (IOException e) {
							e.printStackTrace();
						}
					} else {
						club = fct.readClub(file);
					}
					List<Member> members = club.getMembers();
					Member member = new Member(firstName, lastName, age, licence, club);
					members.add(member);
					club.setMembers(members);
					try {
						fct.writeClub(file, club);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Do you want to continue adding members ? (Y/n)");
					String response = sc.nextLine();
					if(response.equals("n") || response.equals("N")) {
						exitCreateMember=true;
					}
				} while (!exitCreateMember);

				break;
			case "lstclub":
				System.out.println("What club to consult ?");
				String clubNameToList = sc.nextLine();
				File fileClub = new File(PREFIXE + "\\" + clubNameToList);
				fct.readClub(fileClub);
				break;
			case "exit":
				System.out.println("bye bye");
				exit = true;
				break;
			default:
				System.out.println("unknow option");
			}
		}

		sc.close();
	}

}
