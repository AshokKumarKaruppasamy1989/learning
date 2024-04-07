package com.coreJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicatesElementInArray5 {

	public static void main(String[] args) {
		// Find duplicates in a String array

		String[] input = { "aaa", "bbb", "ccc", "ddd", "eee", "aaa", "fff", "bbb"};
//		System.out.println("Duplicate element is : " + findDuplicates(input));
//		System.out.println("Duplicate element is : " + findDuplicatesUsingSet(input));
		findDuplicatesUsingMap(input);

	}

	static String findDuplicates(String[] arr) {
		
		ArrayList<String> unique = new ArrayList<>();

		// 1. compare each element - Time complexity O(n*n) When use nested for loop (worst solution to implement)
		for (int i = 0; i < arr.length -1 ; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					unique.add(arr[i]);
				}
			}
		}
		return unique.toString();
	}
	
	// 2. Using HashSet - Time complexity O(n)
	static String findDuplicatesUsingSet(String[] arr) {
		
		Set<String> unique = new HashSet<String>();
		Set<String> duplicate = new HashSet<String>();
		for (String temp: arr) {
			if (unique.add(temp) == false) {
				duplicate.add(temp);
			}
		}
		return duplicate.toString();
	}
	
	// 3. Using HashMap - Time Complexity O(2n)
	static void findDuplicatesUsingMap(String[] arr) {
		
		Map<String, Integer> unique = new HashMap<String, Integer>();
		for (String temp : arr) {
			Integer count = unique.get(temp);
			if (count == null) {
				unique.put(temp, 1);
			} else {
				unique.put(temp, ++count);
			}
		}
		
		//Get the value from the map
		
		Set<Entry<String, Integer>> entry = unique.entrySet();
		for(Entry<String, Integer> set : entry) {
			if(set.getValue()>1) {
				System.out.println("Duplicate element is : " + set.getKey());
			}
		}
	}
}
