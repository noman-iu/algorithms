package com.akhtar.utils;

/**
 * @author akhtar
 */

public class Utils {

	public static void swapArray(int array[], int first, int second) {
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}

	public static void printArray(int array[]) {
		int count = 0;
		for (int i : array) {
			System.out.print(i);
			if (count++ < array.length - 1)
				System.out.print(",");
		}
		System.out.println();
	}

	public static void print2DArray(int array[][], int row, int col) {
		System.out.println("Matrix is -");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(array[i][j]);
				if(j+1 < col)
					System.out.print(" , ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
