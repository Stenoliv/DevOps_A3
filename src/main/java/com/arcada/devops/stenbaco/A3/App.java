package com.arcada.devops.stenbaco.A3;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	boolean run = true;
    	
    	UI.startAppDialogue();
    	while (run == true) {
    		
    		UI.runApp();
    		run = UI.exitApp();
    		
    		
    	}
        
    }
}
