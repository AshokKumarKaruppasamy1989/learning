package com.coreJavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// Remove Duplicates from Sorted Array
		
		int[] nums = {0,0,0,1,1,2,3,3,4,5};
		removeDuplicates(nums);

	}

	static void removeDuplicates(int[] num) {
		int count = 0;
		
		List<Integer> unique = new ArrayList<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			if ((i  < num.length -1) && num[i] == num[i+ 1])  {
				continue;
			} else {
//				num[count] = num[i];
				unique.add(num[i]);
				count++;
			}
		}
		System.out.println("Removed duplicates from array : " +  unique.toString());
		System.out.println("Count of unique numbers : " + count);
	}
}
