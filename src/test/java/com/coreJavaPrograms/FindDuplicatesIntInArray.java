package com.coreJavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesIntInArray {

	public static void main(String[] args) {
		// Find duplicates in int array
		
		int[] input = {1, 2, 6, 9, 0 , 2, 0};
		System.out.println("Duplicate integer is : " + findDuplicateIntArray(input));

	}
	
	static String findDuplicateIntArray(int[] arr) {
		
		List<Integer> unique = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == arr[j]) && (i != j)) {
					unique.add(arr[i]);
				}
			}
		}
		return unique.toString();
	}
}
