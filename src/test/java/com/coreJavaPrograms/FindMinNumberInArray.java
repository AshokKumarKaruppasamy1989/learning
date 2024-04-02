package com.coreJavaPrograms;

public class FindMinNumberInArray {

	public static void main(String[] args) {
		// Find minimum number in the array
		
		Integer[] input = {22, 60, 1, 5, 0, -4, 800, -6};
		System.out.println("Minimum number is : " + findMinNumArray(input));

	}
	
	static int findMinNumArray(Integer[] num) {
		
		int minimum = num[0];
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] < minimum) {
				minimum = num[i];
			}
		}
		
		return minimum;
	}

}
