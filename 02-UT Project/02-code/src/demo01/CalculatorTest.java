
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
}
