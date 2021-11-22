package demo75;

import static org.junit.Assert.*;

import org.junit.Test;S


public class StringCalculatorTest {

  @Test
  public final void testAdd_StringIsNull_return_zero() {
    assertEquals(0, StringCalculator.add(null));
  }

  @Test()
  public void testAdd_StringIsSpace_return_zero() {
    assertEquals(0, StringCalculator.add(" "));
  }

  //	IllegalArgumentException
  @Test(expected = IllegalArgumentException.class)
  public void testAdd_StringIllegalNum_ThrowsException() {
    assertEquals(12, StringCalculator.add("1,2,3,six"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAdd_StringNegativeNum_ThrowsException() {
    assertEquals(1, StringCalculator.add("1,2,3,-5"));
  }

  @Test()
  public void testAdd_StringQualifiedNumMoreThan_ReturnZero() {
    assertEquals(600, StringCalculator.add("100,200,300,6000"));
  }

  @Test()
  public void testAdd_StringQualifiedNum_ReturnSum() {
    assertEquals(12, StringCalculator.add("1,2,3,6"));
  }
}
