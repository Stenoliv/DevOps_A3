package com.arcada.devops.stenbaco.A3;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
	
	public static void printFriendsList(ArrayList<String>friends) {
		for(String i : friends) {
			System.out.println(i);
		}
		
	
	}
	public static void startAppDialogue() {
		
		System.out.println("Welcome to facebook friendlist finder!");
		
	}
	
	public static void runApp() {
		System.out.println("Please choose the way you want to search for a person!(l with link / n with name)");
		Scanner input = new Scanner(System.in); 
		boolean run = true;
		
		 while (run) {
	            String typeOfSearch = input.nextLine().toLowerCase();

	            switch (typeOfSearch) {
	                case "l":
	                    // Link search
	                    friendToSearchByLink();
	                    run = false; 
	                    break;

	                case "n":
	                    // Name search
	                    friendToSearchByName();
	                    run = false; 
	                    break;

	                default:
	                    // Handle invalid input
	                    System.out.println("Invalid input. Please enter 'l' for link search or 'n' for name search:");
	                    break;
	            }
	        }
	}
	
	public static boolean exitApp() {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to exit the app?(y/n)");
		
		while (true) {
			String exitRun = input.nextLine().toLowerCase();
			
			switch (exitRun) {
			case "y":
				return(false);
				
			case "n": 
				return(true);
				
			default:
	            // Handle invalid input
	            System.out.println("Invalid input please input (y/n)");
	            break;
					
			}
		}
		
		
		
	}
	public static void friendToSearchByLink() {
		Scanner input = new Scanner(System.in);
		System.out.println("give the link to the Facebook page");
		String user = input.nextLine();
		String response = Utils.recognizeFacebookLink(user);
		
		if(!response.equals("error")) {
			ArrayList<String> userInfo= Friendslist.friends(response);
			printFriendsList(userInfo);
		}else {
			System.out.println("Invalid Facebook profile link");
		}
		
		
	}
	
	public static void friendToSearchByName() {
		Scanner input = new Scanner(System.in);
		System.out.println("give the name to the person whose Facebook friends you looking for");
		String user = input.nextLine();

		ArrayList<String> userInfo = Friendslist.friends(Utils.recognizeUsername(user));
		printFriendsList(userInfo);
		
		
	}
		
}
