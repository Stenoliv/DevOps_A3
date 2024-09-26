package com.arcada.devops.stenbaco.A3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SearchForUsersTest {
	@Test 
	public void testSearchWithLink() {
		//test search function for user with link
		String link = "https://www.facebook.com/oliver.stenbacka?locale=fi_FI";
		String returnedUsername = Utils.recognizeFacebookLink(link);
		String expectedUsername = "oliver stenbacka";
		
		assertEquals(expectedUsername,returnedUsername);
	}
	@Test 
	public void testSearchWithIncorrectLink() {
		//test search function for user with incorrect link
		String link = "https://www.alibaba.com/oliver.stenbacka?locale=fi_FI";
		String returnedUsername = Utils.recognizeFacebookLink(link);
		String expectedOutcome = "error";
		
		assertEquals(expectedOutcome,returnedUsername);
	}
	@Test
	public void testSearchWithName() {
		//test search function for user with name
		String name = "matt.armstrong";
		String returnedUsername = Utils.recognizeUsername(name);
		String expectedUsername = "matt armstrong";
		
		assertEquals(expectedUsername, returnedUsername);
	}
	@Test
	public void testSearchWithIncorrectName() {
		//test search function for user with incorrect name
		String name = "facepookie.?/+";
		String returnedUsername = Utils.recognizeUsername(name);
		String expectedUsername = "facepookie ";
		
		assertEquals(expectedUsername, returnedUsername);
	}
}
