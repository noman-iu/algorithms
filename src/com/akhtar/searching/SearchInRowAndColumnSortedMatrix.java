package com.akhtar.searching;

/**
 * @author akhtar
 */

public class SearchInRowAndColumnSortedMatrix {

	public static void main(String[] args) {
		int matrix[][] = 
				{ 
				{ 10, 20, 30, 40 }, 
				{ 15, 25, 35, 45 }, 
				{ 27, 29, 37, 48 }, 
				{ 32, 33, 39, 50 } 
				};
		System.out.println(search(matrix, 23,4,4));
	}

	public static boolean search(int matrix[][], int key , int row , int col) {
		int j = 0;
		for (int i = col-1; i >= 0; i--) {
			if(j > row-1)
				break;
			if (matrix[j][i] == key) {
				return true;
			} else if (matrix[j][i] < key) {
				j++;
				i = col-1;
			}
		}
		return false;

	}

}
