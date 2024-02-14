package com.javaStringPrograms;

import java.util.Scanner;

public class checkWhetherGivenStringIsPalindrome {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String str = s.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();		
		String rev = sb.toString();
		
		if (str.equals(rev)) {
			System.out.println("Palindrome string");
		} else {
			System.out.println("Not Palindrome string");
		}		
		
		s.close();

	}
}
