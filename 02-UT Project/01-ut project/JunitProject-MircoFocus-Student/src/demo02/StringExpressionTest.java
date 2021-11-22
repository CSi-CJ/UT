package demo02;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class StringExpressionTest {
	/*
	 * “20”    返回 20
	 * “1+2”    返回 3
        “1+2+3+4”  返回 10
        “100+101+200”    返回 401
         “”   返回 0
         null   返回 0
         
           不考虑含有非法数据，比如  1+b+3 
	 */
	

	  @Test
	  public void evaluatesExpression() { 
		//Arrange 
		StringExpression calculator = new StringExpression();
	    //Act 
		int sum = calculator.evaluate("0");
	    //Assert 
		assertEquals(0, sum);
	  }

	@Test
	public void evaluatesExpression_QualifiedString_returnValue() {
		//Arrange 
		StringExpression calculator = new StringExpression();
		//Act 
		int sum = calculator.evaluate("100");
		//Assert 
		assertEquals(100, sum);
	}

	@Test
	public void evaluatesExpression_QualifiedLongString_returnValue() {
		//Arrange 
		StringExpression calculator = new StringExpression();
		//Act 
		int sum = calculator.evaluate("1+2+3+6");
		//Assert 
		assertEquals(8, sum);
	}

	@Test
	public void evaluatesExpression_StringOfNull_returnZero() {
		//Arrange 
		StringExpression calculator = new StringExpression();
		//Act 
		int sum = calculator.evaluate(null);
		//Assert 
		assertEquals(0, sum);
	}

	@Test
	public void evaluatesExpression_StringOfSpace_returnZero() {
		//Arrange 
		StringExpression calculator = new StringExpression();
		//Act 
		int sum = calculator.evaluate("");
		//Assert 
		assertEquals(0, sum);
	}

	@Test
	public void evaluatesExpression_StringOfMutipSpace_returnZero() {
		//Arrange 
		StringExpression calculator = new StringExpression();
		//Act 
		int sum = calculator.evaluate("     ");
		//Assert 
		assertEquals(0, sum);
	}


	@Test
	public void evaluatesExpression_StringOfIllegl_returnZero() {
		//Arrange 
		StringExpression calculator = new StringExpression();
		//Act 
		int sum = calculator.evaluate("1+a+2");
		//Assert 
		assertEquals(0, sum);
	}

	@Test
	public void evaluatesExpression_IllegalStringOfNumber_returnZero() {
		//Arrange 
		StringExpression calculator = new StringExpression();
		//Act 
		int sum = calculator.evaluate("1+2   +  3");
		//Assert 
		assertEquals(0, sum);
	}
}
