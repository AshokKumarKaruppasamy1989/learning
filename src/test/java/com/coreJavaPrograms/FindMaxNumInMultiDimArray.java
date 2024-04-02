package com.coreJavaPrograms;

public class FindMaxNumInMultiDimArray {
	
	public static void main(String[] args) {
		// Find maximum number in multi dimensional array
		
		Integer[][] input = {{20, 5, 0}, {440, -3, 2}, {7, 15, 79}};
		System.out.println("Maximum number in multi dimensional array is : " + findMaxNumMultiArray(input));
	}
	
	static int findMaxNumMultiArray(Integer[][] num) {
		
		Integer Maximum = num[0][0];
		
		for (int j = 0; j < num.length; j++) {
			for (int i = 0; i < num[j].length; i++) {
				if(num[j][i] > Maximum) {
					Maximum = num[j][i];
				}
			}
		}
		
		return Maximum;
	}

}
