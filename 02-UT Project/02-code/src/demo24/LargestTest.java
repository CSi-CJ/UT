package demo24;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestTest {

	@Test
	public void testSimple() {
		assertEquals(" Failure Messages ",9, Largest.largest(new int[]{7,8,9}));		
	}
	
}     
