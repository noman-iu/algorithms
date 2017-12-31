package com.akhtar.practice;

/**
 * @author akhtar
 */

/*
 * Given an array of length n and containing element from 0 - n
 * WAP to print the all duplicate element in minimum possible complexity
 * input = {10,7,2,5,2,8,6,7,10}
 * output = {10,2,7}
*/
public class FindDuplicateInArray {

	public static void main(String[] args) {
		
	}
	
	public static void printDuplicate(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if(Math.abs(array[i]) > 0) {
				
			}
			else {
				System.out.println(array[i]);
			}
		}
	}
}
