package demo43;

public class InsertSort {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 3, 5, 9, 16, 29, 47, 78, 89, 94 };
		int key = 47;
		int[] b = insertSort(a, key);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "  ");
		}
	}

	public static int[] insertSort(int[] unsorted, int key) {
		int len = unsorted.length;
		int[] sorted = new int[len + 1];
		for (int i = 0; i < len; i++) {
			// when key exists in edge of array
			if (key < unsorted[0]) {
				sorted[0] = key;
				System.arraycopy(unsorted, 0, sorted, 1, len);
			}
			if (key > unsorted[len - 1]) {
				sorted[sorted.length - 1] = key;
				System.arraycopy(unsorted, 0, sorted, 0, len);
			}
			// when key exists in mid of array
			if (key > unsorted[i]) {
				sorted[i] = unsorted[i];
			} else {
				sorted[i] = key;
				System.arraycopy(unsorted, i, sorted, i + 1, len - i);
				break;
			}
		}
		return sorted;
	}
}
