package demo01;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class LogAnalyzerTest {

	@Test
	public void testIsValidLogFileName() {
		LogAnalyzer log = new LogAnalyzer();

		boolean result = log.isValidLogFileName("shortfile.slf");
		assertTrue(result);
	}

}
