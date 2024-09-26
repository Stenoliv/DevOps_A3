package com.arcada.devops.stenbaco.A3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FindFriendsListTest {
	 @Test
	    public void testGetFriendsMattArmstrong() {
	        // Positive test case: "matt armstrong"
	        List<String> expectedFriends = List.of(
	            "FRIENDS FOUND", "Chris Slick", "Mark Mccann", "Freddy Tavarish", "Mr Mansory", 
	            "Damon Fryer", "Dave Coulter", "Hanna Armstrong", "Tony Armstrong", "Matt Cameron", 
	            "Mr JWW", "Nico Leonard", "Jack Johnsson"
	        );

	        ArrayList<String> actualFriends = FindFriendsList.getFriends("matt armstrong");

	        assertEquals(expectedFriends, actualFriends);
	    }

	    @Test
	    public void testGetFriendsKarimBenzema() {
	        //Positive test case: "karim benzema"
	        List<String> expectedFriends = List.of(
	            "FRIENDS FOUND", "Toni Kroos", "Cristiano Ronaldo", "Luka Modric", "Sergio Ramos", 
	            "Gareth Bale", "Casemiro", "Daniel Carvajal", "Thiabut Courtoise", "Vinicius JR", 
	            "Rodrygo Goes", "James Rodriguez", "Raphael Varane", "Eder Militao", 
	            "Federico Valverde", "Lucas Vasquez", "Marcelo", "Isco", "Kylian Mbappe"
	        );

	        ArrayList<String> actualFriends = FindFriendsList.getFriends("karim benzema");

	        assertEquals(expectedFriends, actualFriends);
	    }

	    @Test
	    public void testGetFriendsInvalidUser() {
	        //Tests with unknown user
	        ArrayList<String> expectedFriends = new ArrayList<>();
	        expectedFriends.add("NO FRIENDS FOUND");

	        ArrayList<String> actualFriends = FindFriendsList.getFriends("unknown user");

	        assertEquals(expectedFriends, actualFriends);
	    }

	    @Test
	    public void testGetFriendsCaseInsensitive() {
	        //Tests case sensitivity
	        List<String> expectedFriends = List.of(
	            "FRIENDS FOUND", "Donald Duck", "Mark Cuban", "Mickey Mouse", "Mark Zukk", 
	            "Jesus Navas", "Cole Palmer", "Oscar Bobb", "Simon Mignolet", "Trevor Noah", 
	            "Horacio Pagani", "Sadio Mane", "Warren Buffet", "Jeff Bezos", "Damon Fryer", 
	            "Dave Coulter", "Linus Torvalds"
	        );

	        ArrayList<String> actualFriends = FindFriendsList.getFriends("OLIVER STENBACKA");

	        assertEquals(expectedFriends, actualFriends);
	    }
}
