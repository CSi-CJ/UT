package demo03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotNull;
import java.util.Arrays;

import org.junit.Test;

public class AssertTestsCase1 {
  @Test
  public void testAssertArrayEquals() {
    byte[] expected = "trial".getBytes();
    byte[] actual = "trial".getBytes();
    assertArrayEquals("failure - byte arrays not same", expected, actual);
  }

	@Test
	public void testAssertDoubleEquality() {
		double expected  = 10.001;
		double actual    = 10.0;
		double precision = 0.00001;
		assertEquals(expected, actual, precision);
	}
	
  @Test
  public void testAssertEquals() {
    assertEquals("failure - strings are not equal", "text", "text");
  }

  @Test
  public void testAssertFalse() {
     assertFalse("failure - should be false", true);
  }

  @Test
  public void testAssertTrue() {
     assertTrue("failure - should be true", true);
  }
  @Test
  public void testAssertNotNull() {
     assertNotNull("should not be null", new Object());
  }

  @Test
  public void testAssertNotSame() {
     assertNotSame("should not be same Object", new Object(), new Object());
  }

  @Test
  public void testAssertNull() {
     assertNull("should be null", null);
  }

  @Test
  public void testAssertSame() {
    Integer aNumber = Integer.valueOf(768);
     assertSame("should be same", aNumber, aNumber);
  }

}
