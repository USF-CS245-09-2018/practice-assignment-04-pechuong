public class InsertionSort implements SortingAlgorithm {
	
	void sort(int[] a) {
		int numSorted = 1;
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			for (int j = i; j > numSorted; j--) {
				if (a[j] <= temp) {
					shiftRight(a, j);
				} else {
					a[j + 1] = temp;
					break;
				}	
			}	
		}	
	}	
	
	static void shiftRight(int[] a, int j) {
		a[j + 1] = a[j];
	}
}
