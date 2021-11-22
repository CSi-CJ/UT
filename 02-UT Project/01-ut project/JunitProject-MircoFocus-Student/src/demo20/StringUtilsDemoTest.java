package demo20;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.rules.ExpectedException;

import demo04.NoJobException;

public class StringUtilsDemoTest {
	

	@Test
	public void testcontains() {
		assertTrue(StringUtilsDemo.contains("ABCD", "AB"));
	}

	
	
	
	



	@Test
	  public void testIndexof5() {
		  try {
			  StringUtilsDemo.indexof(null, "cD");
			  fail();
			  } catch (IllegalArgumentException e) {
				  System.out.println(e.getMessage());
				  assertEquals("第一个参数不能是NULL", e.getMessage());
			  }
		 }


	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test(expected = IllegalArgumentException.class)
	public void	 FirstParamenterisNULL_ThrowException()
	{
		StringUtilsDemo.contains(null, "abc");
	}

	  @Test
	  public void FirstParamenterisNULL_ThrowException_MSGisOK() {
		  try {
			  	StringUtilsDemo.contains(null, "abc"); fail();
			  } catch (IllegalArgumentException e) {
				  System.out.println(e.getMessage());
				  assertEquals("第一个参数不能是NULL", e.getMessage());
			  }
		 }

	@Test
	public void testExpectedException() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			StringUtilsDemo.contains(null, "abc");
		});
	}

	@Test
	public void testCatchException() {
		Throwable throwable = assertThrows(IllegalArgumentException.class, () -> {
			StringUtilsDemo.contains(null, "abc");
		});

		assertEquals("第一个参数不能是NULL", throwable.getMessage());
	}
	@Test
	public void testindexOf5() throws IndexOutOfBoundsException {
		thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("第一个参数不能是NULL");

	    StringUtilsDemo.indexof(null, "cD");	; // execution will never get past this line
	}
}
