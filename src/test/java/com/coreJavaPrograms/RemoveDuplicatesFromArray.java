package com.coreJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

import com.javaStringPrograms.concatenateTwoStrings;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// Remove duplicates from Array
		
		int[] input = {1, 9, 1, 0, 2, 9};
//		System.out.println("String with out duplicates : " + removeDuplicates(input));
		removeDuplicatesUsingSet(input);
		

	}
	
	// Sorting the array and removing the duplicates
	// By using sort method the Time complexity of the program increases from O(n) to O(nlogn).
	// output will be in sorted
	
	static String removeDuplicates(int[] num) {
		
		List<Integer> unique = new ArrayList<Integer>();
		Arrays.sort(num);
		
		for (int i = 0 ; i < num.length; i++) {
				if ((i < num.length - 1) && (num[i] == num[i+1])) {
					continue;
				} else {
					unique.add(num[i]);
			}
		}
		return unique.toString();
	}
	
	// Alternate
	// output will not be sorted
	
	static void removeDuplicatesUsingSet(int[] num) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}
		
		System.out.println("String with out duplicates : " + set);
	}

}
