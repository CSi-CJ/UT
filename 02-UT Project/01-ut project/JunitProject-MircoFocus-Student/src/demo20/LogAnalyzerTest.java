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

/*	@Test(expected = IllegalArgumentException.class)
	public void testisValidLogFileName(){
		assertFalse(logAnalyzer.isValidLogFileName(" "));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testisValidLogFileName2(){
		assertFalse(logAnalyzer.isValidLogFileName(null));
	}

	@Test()
	public void testisValidLogFileName3(){
		assertFalse(logAnalyzer.isValidLogFileName("test.txt"));
	}

	@Test()
	public void testisValidLogFileName4(){
		assertFalse(logAnalyzer.isValidLogFileName("test.log")); // filename.length < 6
	}

	@Test()
	public void testisValidLogFileName5(){
		assertFalse(logAnalyzer.isValidLogFileName("abcdefghijklmnopqrstuvwxyz.log")); // filename.length > 24
	}

	@Test()
	public void testisValidLogFileName6(){
		assertTrue(logAnalyzer.isValidLogFileName("validationFilename.log")); // filename.length > 24
	}*/

	//测试方法名编写格式： 三段： 被测方法名__测试场景__预期期望值

	@Test(expected = IllegalArgumentException.class)
	public void isValidLogFileName_FilenameIsSpace_ThrowException(){
		assertFalse(logAnalyzer.isValidLogFileName(" "));
	}

	@Test(expected = IllegalArgumentException.class)
	public void isValidLogFileName_FilenameIsNUll_ThrowException(){
		assertFalse(logAnalyzer.isValidLogFileName(null));
	}

	@Test()
	public void isValidLogFileName_FilenameEndWithNotLog_ReturnFalse(){
		assertFalse(logAnalyzer.isValidLogFileName("test.txt"));
	}

	@Test()
	public void isValidLogFileName_FilenameLengthLess_ReturnFalse(){
		assertFalse(logAnalyzer.isValidLogFileName("test.log")); // filename.length < 6
	}

	@Test()
	public void isValidLogFileName_FilenameLengthMore_ReturnFalse(){
		assertFalse(logAnalyzer.isValidLogFileName("abcdefghijklmnopqrstuvwxyz.log")); // filename.length > 24
	}

	@Test()
	public void isValidLogFileName_FilenameOfQualified_ReturnTrue(){
		assertTrue(logAnalyzer.isValidLogFileName("validationFilename.log"));
	}

	@Test()
	public void isValidLogFileName_FilenameLengthBorder_ReturnFalse(){
		assertFalse(logAnalyzer.isValidLogFileName("abcdefghijklmnopqrstuvwxyz.log"));
	}

}
