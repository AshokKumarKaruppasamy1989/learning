package com.coreJavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondMaxMinNumInArray {

	public static void main(String[] args) {
		// Find the second largest number in the array
		
		List<Integer> list = Arrays.asList(1, 60, 5, 0, 9, 70, 23);
		
		int secMax = list.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().get();
		System.out.println("Second largest number in the Array : " + secMax);
		
		//with out limiting the number
//		int secMax1 = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
//		System.out.println("Second largest number in the Array : " + secMax1);

		int secMin = list.stream().sorted().skip(1).findFirst().get();
		System.out.println("Second lowest number in the Array : " + secMin);
	}

}
