package demo53;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

public class Demo2 {
	@Test
	public void testMockList() {
		// 你可以mock具体的类型,不仅只是接口
		LinkedList mockedList = mock(LinkedList.class);
		// 测试桩（ stubbing ）
		when(mockedList.get(0)).thenReturn("first");
		when(mockedList.get(1)).thenThrow(new RuntimeException());
		// 后面输出“first”
		System.out.println(mockedList.get(0));
		assertEquals("first", mockedList.get(0));

		// 因为get(999) 没有打桩，因此输出null
		System.out.println(mockedList.get(999));

		// 后面抛出异常
		System.out.println(mockedList.get(1));
	}

	// Demonstrates the return of multiple values
	@Test
	public void testMoreThanOneReturnValue() {
		Iterator i = mock(Iterator.class);

		when(i.next()).thenReturn("Mockito").thenReturn("rocks");

		String result = i.next() + " " + i.next();
		// assert
		assertEquals("Mockito rocks", result);
	}

	// this test demonstrates how to return values based on the input
	@Test
	public void testReturnValueDependentOnMethodParameter() {
		Comparable c = mock(Comparable.class);

		when(c.compareTo("Mockito")).thenReturn(1);
		when(c.compareTo("Eclipse")).thenReturn(2);

		// assert
		assertEquals(1, c.compareTo("Mockito"));
	}

	// this test demonstrates how to return values independent of the input value
	@Test
	public void testReturnValueInDependentOnMethodParameter() {
		Comparable c = mock(Comparable.class);

		when(c.compareTo(anyInt())).thenReturn(-1);
		// assert
		assertEquals(-1, c.compareTo(9));
	}
}
