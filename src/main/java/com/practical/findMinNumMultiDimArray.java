package com.practical;

public class findMinNumMultiDimArray {

	public static void main(String[] args) {

		int[][] data = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9, 0} };
		System.out.println("Minimum Number is : " + getMinValue(data));

	}

	public static int getMinValue(int[][] number) {

		int minValue = number[0][0];

		for (int j = 0; j < number.length; j++) {
			for (int i = 0; i < number[j].length; i++) {

				if (number[j][i] < minValue) {
					minValue = number[j][i];
				}
			}
		}
		return minValue;
	}
}
