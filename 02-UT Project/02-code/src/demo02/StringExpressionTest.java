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
}
