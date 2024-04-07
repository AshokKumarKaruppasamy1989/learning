package com.coreJavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNum1toN {

	public static void main(String[] args) {
		// Find the prime number 1 to N

		int limit = 100;
		List<Integer> primenumbers = new ArrayList<>();

		for (int numberToCheck = 2; numberToCheck <= limit; numberToCheck++) {
			
			boolean isPrime = true;
			for (int factor = 2; factor <= numberToCheck / 2; factor++) {
				if (numberToCheck % factor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primenumbers.add(numberToCheck);
			}
		}
		System.out.println("Primes numbers 1 to " + limit + " are : " + primenumbers);

	}

}
