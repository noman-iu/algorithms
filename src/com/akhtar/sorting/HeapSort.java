package com.akhtar.sorting;
/**
 * @author akhtar
 */

public class HeapSort {
	
	public static void main(String[] args) {
		int array[] = {10,5,12,7,9,17};
		Utils.print(array);
		sort(array);
		Utils.print(array);
		
	}
	
	public static void sort(int array[]) {
		buildMaxHeap(array);
		Utils.print(array);
		int length = array.length - 1;
		for (int i = length; i >= 0; i--) {
			Utils.swapArray(array, i, 0);
			maxHeapify(array, length-- ,0);
		}
	}
	
	private static void buildMaxHeap(int array[]) {
		int length = array.length;
		int target = length / 2 + 1;
		for(int i = target; i >=0 ; i--) {
			maxHeapify(array, length , i);
		}
	}
	
	private static void maxHeapify(int array[] , int length , int i) {
		int left = 2*i+1;
		int right = 2*i+2;
		int largest = 0;
		if(left < length && array[left] > array[i]) 
			largest = left;
		else 
			largest = i;
		if(right < length && array[right] > largest)
			largest = right;
		if(largest != i) {
			Utils.swapArray(array, largest, i);
			maxHeapify(array, length, largest);
		}
		
	}
	
	
	

}
