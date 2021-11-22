package demo20;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
public class LogAnalyzerTestCase {
	  @Test
	    public void testisValidLogFileName() {
			LogAnalyzer logAnalyzer = new LogAnalyzer();
			
			assertTrue(logAnalyzer.isValidLogFileName(""));
	        System.out.println("@Test - testEmpty");
	        assertTrue(logAnalyzer.isValidLogFileName());
	        assertTrue(logAnalyzer.isValidLogFileName("test.log"));
	        
	        assertTrue(logAnalyzer.isValidLogFileName("test.Log"));
	        
	        
	    }

}
*/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LogAnalyzerTest {
    LogAnalyzer logAnalyzer=null;
	 
	@Before
	public void setup(){
		logAnalyzer=new LogAnalyzer();
	}
	@After 
	public void tearDown(){
		logAnalyzer=null;
	}
}
