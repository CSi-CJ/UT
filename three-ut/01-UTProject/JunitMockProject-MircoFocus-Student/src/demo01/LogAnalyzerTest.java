package demo01;

import static org.junit.Assert.*;

import org.junit.Test;

import demo01.LogAnalyzer;

public class LogAnalyzerTest {
	class EnableTest extends LogAnalyzer{
		private boolean isBoolean;

		public EnableTest(boolean isBoolean){
			this.isBoolean = isBoolean;
		}

		@Override
		protected boolean isSupportedExtension(String fileName) {
			return isBoolean;
		}
	}

	@Test
	public void testIsValidLogFileName() {
		LogAnalyzer log = new LogAnalyzer();

		boolean result = log.isValidLogFileName("shortfile.slf");
		assertTrue(result);
	}

}
