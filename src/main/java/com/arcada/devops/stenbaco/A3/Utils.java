package com.arcada.devops.stenbaco.A3;


public class Utils {
	public static String getUserFromLink(String user) {
		
		String regex= "[/?]";
		String[]username = user.split(regex);
		
		try {
			String modifiedUsername = username[3].replace('.', ' ');
			return(modifiedUsername);
			}
		catch(ArrayIndexOutOfBoundsException e) {
			return("error");
		}
		
	}
	
	public static String recognizeFacebookLink(String user) {
		
		String regex= "[/]";
		String[]username = user.split(regex);
		
		try {
			if(username[2].equals("www.facebook.com")) {
				return (getUserFromLink(user));
			}else return ("error");
			
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			return ("error");
		}
		
		
	}
	
	public static String recognizeUsername(String user) {
		String modifiedUser = user.replaceAll("[^a-zA-Z0-9 ]", " ").replaceAll("\\s+", " ");
		return(modifiedUser);
	}
}
