package com.javaConversion;

public class convertIntegertoString {

	public static void main(String[] args) {
		
		int i = 200;
		
		// valueOf() method
		
		String s = String.valueOf(i);
		
		// toString() method
		
		String s1 = Integer.toString(i);
		
		// Understanding string concatenation operator
		
		System.out.println(i + 100);
		System.out.println(s + 100);
		
		System.out.println(s1 + 100);

	}
}
