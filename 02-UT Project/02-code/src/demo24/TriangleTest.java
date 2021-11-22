package demo24;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void comfirmTriangle_有效三角形_returnTrue() {
		assertEquals(1,Triangle.comfirmTriangle(2, 3, 4));
	} 
	 
}
