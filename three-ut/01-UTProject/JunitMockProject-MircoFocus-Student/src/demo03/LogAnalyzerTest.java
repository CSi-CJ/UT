package demo03;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LogAnalyzerTest {


	@Test
	public void testIsValidLogFileName() {
		LogAnalyzer log = new LogAnalyzer();
		log.setManager(new Stub(false));

		boolean result = log.isValidLogFileName("shortfile.slf");
		assertTrue(result);
	}

}
