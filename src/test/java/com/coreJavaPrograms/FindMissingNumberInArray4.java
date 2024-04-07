package com.coreJavaPrograms;

public class FindMissingNumberInArray4 {

	public static void main(String[] args) {
		//  Find a missing number in array
		
		int[] input = { 1, 2, 3, 4, 5, 6};
		System.out.println("Missing number in array is : " + findMissingNum(input, 7));

	}
	
	static int findMissingNum(int[] arr, int totalCount) {
		
		int expSum = totalCount * (totalCount+1)/2;
		int actSum = 0;
		
		for (int i : arr) {
			actSum = actSum + i;
		}
		
		return expSum - actSum;
	}

}
