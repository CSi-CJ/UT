package demo43;

public class Search {
	
	public int sqlSearch(int a, int[] arr, int b) // ˳�����
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

	public int binarySearch(int a, int[] arr, int b) // ���ֲ��ҷ���"arr"Ϊ����[����]��������飩
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
