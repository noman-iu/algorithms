package com.akhtar.searching;

/**
 * @author akhtar
 */

public class BinarySearchInSortedMatrix {

	public static void main(String[] args) {
		int matrix[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		System.out.println(BinarySearchInSortedMatrix.binarySearch(matrix, 3, 4, 16));

	}
	
	public static boolean binarySearch(int matrix[][] , int row , int col , int key) {
		int mid;
		int start = 0;
		int r,c;
		int end = row*col - 1;
		int value;
		while (start <= end) {
			mid = start + (end - start)/2;
			r = mid / col;
			c = mid % col;
			value = matrix[r][c];

			if(value == key) {
				return true;
			}
			if(value > key) {
				end = mid - 1; 
			}
			else {
				start = mid + 1;
			}
		}
		return false;
	}

}
