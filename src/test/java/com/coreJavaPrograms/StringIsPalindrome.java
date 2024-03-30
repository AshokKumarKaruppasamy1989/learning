package com.coreJavaPrograms;

public class StringIsPalindrome {

	public static void main(String[] args) {
		// String palindrome

		isPalindrome("race");

	}

	static void isPalindrome(String s) {

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		if (s.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not a Palindrome");
		}
	}

}
