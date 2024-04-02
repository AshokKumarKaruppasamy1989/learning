package com.coreJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicatesStringInArray {

	public static void main(String[] args) {
		// Find duplicates in a String array

		String[] input = { "aaa", "bbb", "ccc", "ddd", "eee", "aaa", "fff", "bbb"};
		System.out.println("Duplicate string is : " + findDuplicates(input));

	}

	static String findDuplicates(String[] arr) {
		
		ArrayList<String> unique = new ArrayList<>();

		for (int i = 0; i < arr.length -1 ; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == arr[j]) && (i != j)) {
					unique.add(arr[i]);
				}
			}
		}
		return unique.toString();
	}
}
