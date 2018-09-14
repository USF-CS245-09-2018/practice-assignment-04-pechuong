public class BubbleSort implements SortingAlgorithm {

	void sort(int[] a) {
		int maxIndex = 0;
		int iterator = 0;
		boolean swapped = true;
		while (swapped == true) {
			swapped = false;
			for (int i = 1; i < a.length - iterator; i++) {
				if (a[i] > a[maxIndex]) {
					swap(a, i, maxIndex);
					swapped = true;
				}	
			} /* end for */
			if (!swapped) {
				return;
			}
			iterator++;
		} /* end while */
	} /* end sort */
	
	static void swap(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}

}
