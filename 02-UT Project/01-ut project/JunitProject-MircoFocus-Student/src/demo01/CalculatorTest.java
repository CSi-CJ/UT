
package demo01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  
	@Test
	public void testAdd() {
		//Setup
		Calculator calculator = new Calculator();
		//Exercise 
		double result = calculator.add(10, 50);
		//Inspection
		assertEquals(60, result);
		//Tear down   do nothing
	}

	@Test
	public void testAdd2() {
		//Setup
		Calculator calculator = new Calculator();
		//Exercise
		double result = calculator.add(-10, -50);
		//Inspection
		assertEquals(-60, result);
		//Tear down   do nothing
	}

	@Test
	public void testAdd3() {
		//Setup
		Calculator calculator = new Calculator();
		//Exercise
		double result = calculator.add(10, -50);
		//Inspection
		assertEquals(-40, result);
		//Tear down   do nothing
	}

	@Test
	public void testAdd4() {
		//Setup
		Calculator calculator = new Calculator();
		//Exercise
		double result = calculator.add(0, -50);
		//Inspection
		assertEquals(-50, result);
		//Tear down   do nothing
	}

	@Test
	public void testAdd5() {
		//Setup
		Calculator calculator = new Calculator();
		//Exercise
		double result = calculator.add(0, 50);
		//Inspection
		assertEquals(50, result);
		//Tear down   do nothing
	}
}
