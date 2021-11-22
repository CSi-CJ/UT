package demo24;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestTest {

	@Test
	public void testSimple() {
		assertEquals(" Failure Messages ",11, Largest.largest(new int[]{11,8,9}));
	}

	@Test
	public void testSimple2() {
		assertEquals(" Failure Messages ",-1, Largest.largest(new int[]{-1,-2,-3}));
	}

	@Test
	public void testSimple3() {
		assertEquals(" Failure Messages ",1, Largest.largest(new int[]{-1,0,1}));
	}

	@Test
	public void testSimple5() {
		assertEquals(" Failure Messages ",-2147483648, Largest.largest(new int[]{}));
	}

	@Test
	public void testSimple4() {
		assertEquals(" Failure Messages ",2147483647, Largest.largest(new int[]{-2147483648,0,2147483647}));
	}
}     
