package com.coreJavaPrograms;

import java.util.Arrays;

public class TestArrayReverse {

	public static void main(String[] args) {
		String[] input = {"aaa", "bbb", "ccc", "zzz"};
		Integer[] input1 = {123, 456, 789};
		System.out.println(reverseArray(input1));

	}

	static String reverseArray(String[] arr) {
		
		String[] rev = new String[arr.length];
		
		for(int i = arr.length - 1; i >= 0; i--) {
			rev[i] = arr[arr.length -i -1];
		}
		
		return Arrays.toString(rev);
	}
	
	static String reverseArray(Integer[] arr) {
		Integer[] rev = new Integer[arr.length];
		
		for (int i = arr.length - 1; i >= 0; i--) {
			rev[i] = arr[arr.length -i -1];
		}
		return Arrays.toString(rev);
	}
}
