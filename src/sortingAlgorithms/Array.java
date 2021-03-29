package sortingAlgorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {
	private int[] array;
	private int size;

	public Array(int size) {
		this.array = new int[size];
		this.size = size;
	}

	public void add(int item) {
		this.array[size++] = item;
	}

	public int[] getArray() {
		return array;
	}

	public int getSize() {
		return size;
	}

	public int getElem(int i) {
		return array[i];
	}

	public void fillAscending() {
		for (int i = 0;  i < size; i++)
			this.array[i] = i;
	}

	public void fillDescending() {
		for (int i = 0;  i < size; i++)
			this.array[size-i-1] = i;
	}

	public void fillRandom() {
		Integer[] arr = new Integer[size];
		fillAscending();

		for (int i = 0;  i < size; i++)
			arr[i] = array[i];

		List<Integer> intList = Arrays.asList(arr);
		Collections.shuffle(intList);

		for (int i = 0;  i < size; i++)
			array[i] = arr[i];
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}
}
