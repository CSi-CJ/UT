package demo20;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MemoryCalculatorTest {
	private MemoryCalculator calc;
	
	@Before 
	public void setUp() throws Exception {
		calc = new MemoryCalculator();
	}  
       
	@After
	public void tearDown() throws Exception {
		calc=null;
	}
     
	@Test
	public final void test_Sum_NoAddCalls_DefaultsToZero() {
		int lastSum = calc.sum();
        assertEquals(0,lastSum);
	}

	@Test
	public final void test_Add_CalledOnce_SavesNumberForSum() {
		calc.subtraction(1);
        int lastSum = calc.sum();
        assertEquals(-1,lastSum);
	}

	@Test
	public final void test_Add_Called_SavesNumberForSum() {
		calc.add(1);
		calc.add(2);
		int lastSum = calc.sum();
		assertEquals(3,lastSum);
	}
	@Test
	public final void test_Sum_AfterCall_ResetsToZero() {
		calc.add(1);
		calc.add(2);
		calc.sum();
        int lastSum = calc.sum();
        assertEquals(0,lastSum);
	}

// ----------------Sub-----------------
	@Test
	public final void test_Subtraction_CalledOnce_SavesNumberForSum() {
		calc.add(1);
		int lastSum = calc.sum();
		assertEquals(1,lastSum);
	}


	@Test
	public final void test_Subtraction_Called_SavesNumberForSum() {
		calc.subtraction(1);
		calc.add(2);
		int lastSum = calc.sum();
		assertEquals(1,lastSum);
	}


	@Test
	public final void test_Subtraction_AfterCall_ResetsToZero() {
		calc.subtraction(1);
		calc.add(2);
		calc.sum();
		int lastSum = calc.sum();
		assertEquals(0,lastSum);
	}

	// ----------------Mutip-----------------

	@Test
	public final void test_Mutip_CalledOnce_SavesNumberForSum() {
		calc.add(1);
		calc.multiply2();
		int lastSum = calc.sum();
		assertEquals(2,lastSum);
	}


	@Test
	public final void test_Mutip_Called_SavesNumberForSum() {
		calc.subtraction(1);
		calc.add(3);
		calc.multiply2();
		int lastSum = calc.sum();
		assertEquals(4,lastSum);
	}


	@Test
	public final void test_Mutip_AfterCall_ResetsToZero() {
		calc.subtraction(5);
		calc.add(2);
		calc.multiply2();
		calc.sum();
		int lastSum = calc.sum();
		assertEquals(0,lastSum);
	}
}
