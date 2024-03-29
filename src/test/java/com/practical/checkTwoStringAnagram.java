package com.practical;

import java.util.Arrays;

public class checkTwoStringAnagram {

	public static void main(String[] args) {
		// check two strings are anagram

		String str = "race";
		String str1 = "care";

		str = str.toLowerCase();
		str1 = str1.toLowerCase();

		if (str.length() == str1.length()) {

			char[] sortStr = str.toCharArray();
			Arrays.sort(sortStr);
//					System.out.println(sortStr);

			char[] sortStr1 = str1.toCharArray();
			Arrays.sort(sortStr1);
//					System.out.println(sortStr1);

			if (Arrays.equals(sortStr, sortStr1)) {
				System.out.println("Its a anagram");
			}

		} else {
			System.out.println("Its not a anagram");
		}

	}

}
