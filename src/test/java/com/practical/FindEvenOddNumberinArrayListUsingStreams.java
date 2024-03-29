package com.practical;

import java.util.Arrays;
import java.util.List;

public class FindEvenOddNumberinArrayListUsingStreams {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 15, 2, 7, 22, 97, 0);
		
		System.out.println("Even Number");
		list.stream().filter(e -> e%2 == 0).forEach(System.out::println);
		
		System.out.println("Odd Number");
		list.stream().filter(o -> o%2 != 0).forEach(System.out::println);

	}

}
