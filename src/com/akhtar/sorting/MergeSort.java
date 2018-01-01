package com.akhtar.sorting;

import com.akhtar.utils.Utils;

/**
 * @author akhtar
 */

public class MergeSort {

	public static void main(String[] args) {
		int array[] = { 12, 11, 13, 5, 6, 7 };
		Utils.printArray(array);
		mergeSort(array, 0,5);
		Utils.printArray(array);
	}

	public static void mergeSort(int array[], int p, int r) {

		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(array, p, q);
			mergeSort(array, q + 1, r);
			merge(array, p, q, r);
		}

	}

	private static void merge(int array[], int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int L[] = new int[n1+1];
		int R[] = new int[n2+1];
		for (int i = 0; i < n1; i++) {
			L[i] = array[p + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = array[q + j + 1];
		}
		L[n1] = 999999999;
		R[n2] = 999999999;
		int i = 0;
		int j = 0;
		for (int k = p; k <= r; k++) {
			if (L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			} 
			else {
				array[k] = R[j];
				j++;
			}
		}

	}
}
