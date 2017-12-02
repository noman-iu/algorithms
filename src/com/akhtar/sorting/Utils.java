package com.akhtar.sorting;

/**
 * @author akhtar
 */

public class Utils {

	public static void swapArray(int array[] , int first , int second) {
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}
	
	public static void print(int array[]) {
		int count = 0;
		for (int i : array) {
			System.out.print(i);
			if(count++ < array.length - 1)
				System.out.print(",");
		}
		System.out.println();
	}
}
