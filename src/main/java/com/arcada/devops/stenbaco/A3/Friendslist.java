package com.arcada.devops.stenbaco.A3;
import java.util.ArrayList;

public class Friendslist {
	public static ArrayList<String> friends(String user){
		
		ArrayList<String>friendsFound = FindFriendsList.getFriends(user);
		
		if(friendsFound.get(0).equals("NO FRIENDS FOUND")) {
			return(friendsFound);
		}else if (friendsFound.get(0).equals("FRIENDS FOUND")) {
			friendsFound.remove(0);
			return(friendsFound);
		}
		else {
			ArrayList<String>error = new ArrayList<String>();
			error.add("Something unexpected happened");
					
			return(error);
		}
		
		
	}
}	
