package demo02;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseUtilTest {

	/*
	 * 一个测试方法只测一件事
     每一个测试方法必须严格遵循 3A原则
     每一个测试方案只有一个断言
	 */
	@Test
	void testReverse() {
		//Arrange 
		ReverseUtil reverseUtil=new  ReverseUtil();
		//Act 
		int value=reverseUtil.reverse(1234);
		//Assert 
		assertEquals(4321, value);
	}
}
