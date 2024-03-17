package com.corejavatrainingsessions;

public class ComparisonOperators {

	public static void main(String[] args) {
		// <, >, <=, >=, ==, !=, &, || Comparison operators

		int a = 10;
		int b = 20;

		// id-else keywords are mentioned in small case

		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		int c = 40;
		int d = 40;

		if (c == d) {
			System.out.println("c and d are equal");
		} else {
			System.out.println("c and d are not equal");
		}

		// write a logic to find out the highest number

		int i = 100;
		int j = 200;
		int k = 300;

		// nested if

		if (i > j & i > k) {
			System.out.println("i is the greatest");
		} else if (j > k) {
			System.out.println("j is the greatest");
		} else {
			System.out.println("k is the greatest");
		}
		
		int a1 = 10;
		int b1 = 20;
		int c1 = 10;
		
		if (a1 == b1 || a1 == c1) {
			System.out.println("a1 is equal to either b1 or c1");
		}
	}
}
