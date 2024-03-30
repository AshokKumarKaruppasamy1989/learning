package com.coreJavaPrograms;

import org.openqa.selenium.devtools.v115.emulation.model.DisplayFeature;

public class NumberIsPalindrome {

	public static void main(String[] args) {
		// Number palindrome
		// A palindrome is a word, phrase, number, or sequence of words that reads the
		// same backward as forward.

		System.out.println(isPalindrome(454));

	}

	static boolean isPalindrome(int x) {

		int temp = x;
		int rev = 0;
		while (x > 0) {
			int digit = x % 10;
			rev = (rev * 10) + digit;
			x = x / 10;
		}

		if (temp == rev) {
			return true;
		}

		return false;

	}

}
