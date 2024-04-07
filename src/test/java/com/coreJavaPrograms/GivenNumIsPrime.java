package com.coreJavaPrograms;

public class GivenNumIsPrime {

	public static void main(String[] args) {
		// Check whether the given number is prime or not

		int input = 20;
		if (findGivenNumIsPrime(input)) {
			System.out.println(input + " is Prime");
		} else {
			System.out.println(input + " is not a Prime");
		}

	}

	static boolean findGivenNumIsPrime(int num) {

		boolean isPrime = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
//				break;
			}
		}

		return isPrime;
	}

}
