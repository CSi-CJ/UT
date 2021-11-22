package demo43;

public class Search {
	
	public int sqlSearch(int a, int[] arr, int b) // 顺序查找
	{
		int i;
		for (i = 0; i < arr.length; i++) {
			if (a == arr[i]) {
				b = i;
				break;
			} 
		}
		return b;
	}

	public int binarySearch(int a, int[] arr, int b) // 二分查找法（"arr"为排序[升序]过后的数组）
	{
		int low = 0;
		int high = arr.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == a) {
				b = mid;
				break;
			} else if (arr[mid] < a)
				low = mid + 1;
			else if (arr[mid] > a)
				high = mid - 1;

		}
		return b;
	}
}
