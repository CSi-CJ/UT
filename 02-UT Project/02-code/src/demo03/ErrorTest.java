
package demo03;

import org.junit.Test;

public class ErrorTest {

	@Test
	public void error() {
		String stringToDecode = "abc";
		Integer.parseInt(stringToDecode);
	}

	
	@Test
	public void error2() {
		testThrowArithmeticException(1,0);
	}
	
	
	public static void testThrowArithmeticException(int numA,int numB){
        try {
            int result = numA/numB;
        }catch (ArithmeticException e){
            throw new ArithmeticException("The numB not allowed to '0'!!");
        }
    }
}
