package com.javaConversion;

public class convertStringtoInteger {

	public static void main(String[] args) {
		
		String s = "200";
		
		String str = "hello";
		
		// parseInt() method
		
		int i = Integer.parseInt(s);
		
		// valudOf() metjod
		
		Integer j = Integer.valueOf(s);
		
		// Number format exception case
		
		Integer k = Integer.valueOf(str);
		
		// Understanding string concatenation operator
		
		System.out.println(s + 100);
		System.out.println(i + 100);
		System.out.println(j + 200);
		
		
		/* System.out.println(k); */

	}
}
