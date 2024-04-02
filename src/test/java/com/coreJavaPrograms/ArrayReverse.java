package com.coreJavaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {

	public static void main(String[] args) {
		// Write a method that will take an array as an argument and reverse it.

		String[] stringArr = {"Test", "Array", "Java"};
		Integer [] intArr = { 1, 2, 3, 4, 5 };
//		System.out.println("Original Array : " + Arrays.asList(intArr));
		reversedArray(stringArr);

	}

	public static void reversedArray(String[] arr) {

		String[] reverseArray = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			reverseArray[i] = arr[arr.length - i - 1];
		}

		System.out.println("Reversed String Array is : " + Arrays.toString(reverseArray));
		
	// Alternate
		
//		Collections.reverse(Arrays.asList(arr));
//		System.out.println("Reversed String Array is : " + Arrays.asList(arr));
	}

	public static void reversedArray(Integer [] arr) {

		Integer[] reverseArray = new Integer[arr.length];

		for (int i = 0; i < arr.length; i++) {
			reverseArray[i] = arr[arr.length - i - 1];
		}

		System.out.println("Reversed Integer Array is : " + Arrays.toString(reverseArray));
//		for (String i : reverseArray) {
//			System.out.println(i + " ");
//		}
		
		
		// Alternate
		
//		Collections.reverse(Arrays.asList(arr));
//		System.out.println("Reversed Integer Array is : " + Arrays.asList(arr));
	}

}
