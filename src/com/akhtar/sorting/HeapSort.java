package com.akhtar.sorting;

import com.akhtar.utils.Utils;

/**
 * @author akhtar
 */

public class HeapSort {

	public static void main(String[] args) {
		int array[] = { 10, 5, 12, 7, 9, 17 };
		Utils.printArray(array);
		sort(array);
		Utils.printArray(array);
	}

	public static void sort(int array[]) {
		buildMaxHeap(array);
		Utils.printArray(array);
		int length = array.length;
		for (int i = length - 1; i >= 0; i--) {
			Utils.swapArray(array, i, 0);
			length = length - 1;
			maxHeapify(array, length, 0);
		}
	}

	private static void buildMaxHeap(int array[]) {
		int length = array.length;
		int target = length / 2 -1;
		for (int i = target; i >= 0; i--) {
			maxHeapify(array, length, i);
		}
	}

	private static void maxHeapify(int array[], int length, int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest = 0;
		if (left < length && array[left] > array[i])
			largest = left;
		else
			largest = i;
		if (right < length && array[right] > largest)
			largest = right;
		if (largest != i) {
			Utils.swapArray(array, largest, i);
			maxHeapify(array, length, largest);
		}

	}

}
