import java.util.Arrays;

public class BubbleSort implements SortingAlgorithm {

	public void sort(int[] a) {
		int iterator = 0;
		boolean swapped = true;
		while (swapped == true) {
			int maxIndex = 0;
			swapped = false;
			for (int i = 1; i < a.length - iterator; i++) {
				//System.out.println(Arrays.toString(a));
				//System.out.println("a[maxIndex]: " + a[maxIndex]);
				//System.out.println("a[i]: " + a[i]);
				//System.out.println(a[maxIndex] > a[i]);
				if (a[maxIndex] > a[i]) {
					swap(a, maxIndex, i);
					maxIndex = i;
					swapped = true;
				} else {
					maxIndex++;
				}	
			} /* end for */
			//System.out.println(Arrays.toString(a));
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
