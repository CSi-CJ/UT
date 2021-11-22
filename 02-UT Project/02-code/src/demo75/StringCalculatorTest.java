package demo75;

import static org.junit.Assert.*;

import org.junit.Test;


public class StringCalculatorTest {
	
	@Test
	public final void testAdd_StringIsNull_return_zero() {				
		assertEquals(0,StringCalculator.add(null));
	}
}
