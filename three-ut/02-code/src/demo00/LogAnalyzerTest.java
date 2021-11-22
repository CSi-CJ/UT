package demo00;

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
	
	@Test(expected = IllegalArgumentException.class)
	public void isValidLogFileName_FileNameIsEmpty2_ThrowsException() {
		logAnalyzer.isValidLogFileName("    ");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void isValidLogFileName_FileNameIsNUll_ThrowsException() {
		logAnalyzer.isValidLogFileName(null);
	} 
	

	 
	@Test(expected = IllegalArgumentException.class)
	public void isValidLogFileName_FileNameIsEmpty_ThrowsException() {
		logAnalyzer.isValidLogFileName("");
	}
	
	@Test 
	public void isValidFilename_validFileLowerCased_returnTrue(){
		assertTrue(logAnalyzer.isValidLogFileName("emfilename.log"));
	}	
	
	@Test 
	public void isValidFilename_NotLog_returnFalse(){
		assertFalse(logAnalyzer.isValidLogFileName("emfilename.bak"));
	}	
	
	@Test
	public void isValidFilename_validFileUpperCased_returnTrue(){
		assertTrue(logAnalyzer.isValidLogFileName("mfilename.LOG"));
	}
	
	@Test
	public void isValidFilename__tooShortFilename_returnFalse(){
		assertFalse(logAnalyzer.isValidLogFileName("name.Log"));
	}
	
	@Test
	public void isValidFilename__tooLongFilename_returnFalse(){
		assertFalse(logAnalyzer.isValidLogFileName("namenamenamenamename.Log"));
	}
	
	@Test
	public void isValidFilename_FileNameisOK_returnTrue(){
		assertTrue(logAnalyzer.isValidLogFileName("mfilename.log"));
	}

}
