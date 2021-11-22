package demo43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InsertSortTest {

	 @Test
	    public void testLT() {
	        int[] a={3,5,9,16,29,47,78,89,94};
	        int key=-5;
	        int[] result={-5,3,5,9,16,29,47,78,89,94};
	        int[] b=InsertSort.insertSort(a,key);
	        for(int i=0;i<result.length;i++){
	            assertEquals(result[i],b[i]);
	        }
	    }

}
