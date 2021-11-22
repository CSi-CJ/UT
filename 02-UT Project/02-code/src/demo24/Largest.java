package demo24;

public class Largest {
	 /**
	 * Return the largest element in a list.
	 * @param list A list of integers
	 * @return The largest number in the given list
	 */    
	 public static int largest(int[] list){
		 int index, max=Integer.MIN_VALUE;
	 	 for (index = 1; index < list.length; index++) {
	 		if (list[index] > max) 
	 			 max = list[index]; 		
	 	 }
	 	 return max;
	 }
}   