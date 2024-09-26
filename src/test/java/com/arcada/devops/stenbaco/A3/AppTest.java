package com.arcada.devops.stenbaco.A3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {
	 
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	    @BeforeEach
	    public void setUp() {
	        System.setOut(new PrintStream(outputStreamCaptor)); 
	    }

	    @AfterEach
	    public void tearDown() {
	        System.setOut(System.out);  
	    }

    @Test
	    public void testExitApp_Yes() {
    	// to test exiting the program
	        String simulatedInput = "y\n";  
	        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

	        boolean continueApp = UI.exitApp();
	        assertFalse(continueApp);  
	    }
    @Test
    public void testExitApp_No() {
    	// to test input to not exit the program
        String simulatedInput = "n\n";  
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        boolean continueApp = UI.exitApp();
        assertTrue(continueApp);  
    }

    @Test
    public void testExitApp_InvalidInput() {
    	// to test invalid input when prompted about exiting the program
        String simulatedInput = "invalidInput\nn\n"; 
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        boolean continueApp = UI.exitApp();
        
        String expectedOutput = "Do you want to exit the app?(y/n)\r\n"
        		+ "Invalid input please input (y/n)\r\n"
        		+ "";
        assertEquals(expectedOutput, outputStreamCaptor.toString());  
        assertTrue(continueApp);  
    }
    
}
