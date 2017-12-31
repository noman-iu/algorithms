package com.akhtar.practice;

import java.util.HashMap;

/**
 * @author akhtar
 */

public class PairsWithPositiveNegativeValues {

	public static void main(String[] args) {
		int array[] = { 4, 8, 9, -4, 1, -1, -8, -9 };
		PairsWithPositiveNegativeValues.printPair(array);
	}

	public static void printPair(int array[]) {
		HashMap<Integer, Integer> map =  new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if(array[i] <0 && map.containsKey(Math.abs(array[i]))) {
				System.out.println(Math.abs(array[i]) + " "+ array[i]);
			}
			map.put(Math.abs(array[i]), 1);
		}
	}

}
