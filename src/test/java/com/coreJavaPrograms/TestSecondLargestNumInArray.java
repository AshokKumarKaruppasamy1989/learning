package com.coreJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestSecondLargestNumInArray {

	public static void main(String[] args) {
		int[] input = {10,20,30,40,50,60,50,30};
		System.out.println("Second largest element in an array : " + findSecondLargest(input));
		
		Integer[] input1 = {10,20,30,40,50,60,50,30};
		System.out.println("Second largest element in an array : " + findSecondLargest(input1));

	}
	
	static int findSecondLargest(int[] num) {
		// 1. Declare a list integer and iterate the num value and add it to it
		List<Integer> list = new ArrayList<Integer>();
		for (int l: num) {
			list.add(l);
		}
		int SecMax = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		
		// 2. Using stream convert the int[] to list
		List<Integer> out = Arrays.stream(num).boxed().collect(Collectors.toList()); // using arrays
		List<Integer> out1 = IntStream.of(num).boxed().collect(Collectors.toList()); // using int stream
		int SecMax1 = out.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		return SecMax1;
	}
	
	static int findSecondLargest(Integer[] num) {
		List<Integer> list = Arrays.asList(num);
		int secmax = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		
		return secmax;
	}

}
