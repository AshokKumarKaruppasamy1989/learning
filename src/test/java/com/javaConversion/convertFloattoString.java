package com.javaConversion;

public class convertFloattoString {

	public static void main(String[] args) {
		
		float f = 12.3F;
		
		// valueOf() method
		
		String s = String.valueOf(f);
		
		// toString() method
		
		String s1 =	Float.toString(f);
		
		// Understanding string concatenation operator
		
		System.out.println(s);
		System.out.println(s1);
	}
}
