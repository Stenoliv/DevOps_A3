package com.arcada.devops.stenbaco.A3;
import java.util.ArrayList;

public class FindFriendsList {
	public static ArrayList<String> getFriends(String user){
		
		if(user.toLowerCase().equals("oliver stenbacka")) {
			ArrayList<String >friendsList = new ArrayList<String>();
			
			friendsList.add("FRIENDS FOUND");
			friendsList.add("Donald Duck");
			friendsList.add("Mark Cuban");
			friendsList.add("Mickey Mouse");
			friendsList.add("Mark Zukk");
			friendsList.add("Jesus Navas");
			friendsList.add("Cole Palmer");
			friendsList.add("Oscar Bobb");
			friendsList.add("Simon Mignolet");
			friendsList.add("Trevor Noah");
			friendsList.add("Horacio Pagani");
			friendsList.add("Sadio Mane");
			friendsList.add("Warren Buffet");
			friendsList.add("Jeff Bezos");
			friendsList.add("Damon Fryer");
			friendsList.add("Dave Coulter");
			friendsList.add("Linus Torvalds");
			
			return (friendsList);
			
		}else if (user.toLowerCase().equals("matt armstrong")) {
			ArrayList<String >friendsList = new ArrayList<String>();
			
			friendsList.add("FRIENDS FOUND");
			friendsList.add("Chris Slick");
			friendsList.add("Mark Mccann");
			friendsList.add("Freddy Tavarish");
			friendsList.add("Mr Mansory");
			friendsList.add("Damon Fryer");
			friendsList.add("Dave Coulter");
			friendsList.add("Hanna Armstrong");
			friendsList.add("Tony Armstrong");
			friendsList.add("Matt Cameron");
			friendsList.add("Mr JWW");
			friendsList.add("Nico Leonard");
			friendsList.add("Jack Johnsson");
			
			return (friendsList);
			
		}else if (user.toLowerCase().equals("karim benzema")) {
			ArrayList<String >friendsList = new ArrayList<String>();
			
			friendsList.add("FRIENDS FOUND");
			friendsList.add("Toni Kroos");
			friendsList.add("Cristiano Ronaldo");
			friendsList.add("Luka Modric");
			friendsList.add("Sergio Ramos");
			friendsList.add("Gareth Bale");
			friendsList.add("Casemiro");
			friendsList.add("Daniel Carvajal");
			friendsList.add("Thiabut Courtoise");
			friendsList.add("Vinicius JR");
			friendsList.add("Rodrygo Goes");
			friendsList.add("James Rodriguez");
			friendsList.add("Raphael Varane");
			friendsList.add("Eder Militao");
			friendsList.add("Federico Valverde");
			friendsList.add("Lucas Vasquez");
			friendsList.add("Marcelo");
			friendsList.add("Isco");
			friendsList.add("Kylian Mbappe");
			
			return (friendsList);
			
		}else {
			ArrayList<String >friendsList = new ArrayList<String>();
			friendsList.add("NO FRIENDS FOUND");
			
			return(friendsList);
		}
		
	}

}
