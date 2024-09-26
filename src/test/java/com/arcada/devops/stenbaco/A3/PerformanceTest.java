package com.arcada.devops.stenbaco.A3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PerformanceTest {
	 
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
	    public void testPerformance() {
    		// to test the performance
	      	long timeFromStart = System.currentTimeMillis();
	      	String simulatedInput = "https://www.facebook.com/oliver.stenbacka?locale=fi_FI";  
	        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
	        long endTime = System.currentTimeMillis();
	        long timeTaken = endTime - timeFromStart;
	        
	        assertTrue(timeTaken < 1);
	      	
	    }
    }