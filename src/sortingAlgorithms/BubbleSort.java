package sortingAlgorithms;

public class BubbleSort {
	public static boolean isSorted(Array a) {
		for (int i = 0; i < a.getSize() - 1; i++) {
			if (a.getElem(i) > a.getElem(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public void sort(Array a) {
		for (int i = 0; i < a.getSize(); i++) {
			for (int j = i+1; j < a.getSize(); j++) {
				if (a.getElem(i) > a.getElem(j)) {
					swap(a.getArray(),i,j);
				}
			}
		}
	}

	private static final void swap(int a[], int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
