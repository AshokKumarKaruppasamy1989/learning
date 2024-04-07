package com.coreJavaPrograms;

public class StringReverseProgram1 {

	public static void main(String[] args) {
		// Reverse a string
		
		String input = "Selenium";
		System.out.println("Reverse string is : " + reverseString(input));
		System.out.println("Reverse string is : " + reverseStringUsingStringBuilder(input));

	}
	
	static String reverseString(String str) {
		
		String rev = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}
	
	static String reverseStringUsingStringBuilder(String str) {
		
		StringBuilder SB = new StringBuilder(str);
		
		return SB.reverse().toString();
	}

}
