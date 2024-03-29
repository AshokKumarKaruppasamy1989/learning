package com.practical;

public class findMaxNumMultiDimArray {

	public static void main(String[] args) {

		int[][] data = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };
		System.out.println("Maximum Number is : " + getMaxValue(data));

	}

	public static int getMaxValue(int[][] number) {
		int maxValue = number[0][0];
		for (int j = 0; j < number.length; j++) {
			System.out.println(j);
			for (int i = 0; i < number[j].length; i++) {
				System.out.println(i);
				if (number[j][i] > maxValue) {
					maxValue = number[j][i];
				}
			}
		}
		return maxValue;
	}
}
