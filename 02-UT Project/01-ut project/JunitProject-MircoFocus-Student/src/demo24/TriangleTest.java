package demo24;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void comfirmTriangle_ordinary_returnTrue() {
		assertEquals(1,Triangle.comfirmTriangle(2, 3, 4));
	}

	@Test
	public void comfirmTriangle_equilateral_returnTrue() {
		assertEquals(3,Triangle.comfirmTriangle(2, 2, 2));
	}

	@Test
	public void comfirmTriangle_isosceles_returnTrue() {
		assertEquals(2,Triangle.comfirmTriangle(2, 2, 3));
	}

	// ����֮�͵��ڵ����߻�������ֻ����ڵ�����
	@Test
	public void comfirmTriangle_less_returnZero() {
		assertEquals(0,Triangle.comfirmTriangle(2, 2, 4));
	}

	//����֮��С�ڵ����� ��������ֻ����ڵ�����
	@Test
	public void comfirmTriangle_sum_returnZero() {
		assertEquals(0,Triangle.comfirmTriangle(2, 2, 7));
	}


	@Test(expected = IllegalArgumentException.class)
	public void comfirmTriangle_isosceles_ThrowException() {
		assertEquals(0,Triangle.comfirmTriangle(-1, 2, 4));
	}

}
