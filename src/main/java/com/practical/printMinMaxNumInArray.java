package com.practical;

public class printMinMaxNumInArray {

	public static void main(String[] args) {

		int[] data = { 1, 7, -3, 47, 0, 69, -1, 3, -9 };
		System.out.println("Minimum number is : " + getMinValue(data));
		System.out.println("Maximum number is : " + getMaxValue(data));

	}

	public static int getMaxValue(int[] number) {

		int maxValue = number[0];

		for (int i = 0; i < number.length; i++) {

			if (number[i] > maxValue) {
				maxValue = number[i];
			}
		}
		return maxValue;
	}

	public static int getMinValue(int[] number) {

		int minValue = number[0];

		for (int i = 0; i < number.length; i++) {
			if (number[i] < minValue) {
				minValue = number[i];
			}
		}
		return minValue;
	}
}
