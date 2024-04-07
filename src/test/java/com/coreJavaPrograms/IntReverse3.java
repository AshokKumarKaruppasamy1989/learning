package com.coreJavaPrograms;

public class IntReverse3 {

	public static void main(String[] args) {
		// Reverse the integer
		
		int input = 12345;
		System.out.println("Reverse int is : " + reverseInt(input));
		System.out.println("Reverse int is : " + reverseIntUisngStringBuilder(input));

	}
	
	static int reverseInt(int num) {
		
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			rev = (rev * 10) + digit;
			num = num / 10;
		}
		return rev;
	}
	
	static String reverseIntUisngStringBuilder(int num) {
		
		StringBuilder SB = new StringBuilder(String.valueOf(num));
		return SB.reverse().toString();
	}

}
