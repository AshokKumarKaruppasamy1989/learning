package com.javaConversion;

public class convertLongtoString {

	public static void main(String[] args) {
		
		long l = 90945000001L;
		
		// valueOf() method
		
		String s = String.valueOf(l);
		
		// toString() method
		
		String s1 =	Long.toString(l);
		
		// Understanding string concatenation operator
		
		System.out.println(s);
		System.out.println(s1);
	}
}
