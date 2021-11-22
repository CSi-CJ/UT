package demo43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchTest {

	@Test
	public void sqlSearch()
	{
		int[] arr= {1,5,8,6,11,25,36,42,15,85};
		int a=8;
		int b=0;
		
		int c=2;
		assertEquals(c,new Search().sqlSearch(a,arr,b));
		 
	}
	
	@Test
	public void binarySearch()
	{
		int[] arr= {1,5,6,8,11,15,25,36,42,85};
		assertEquals(3,new Search().binarySearch(8,arr,0));
	}

}
