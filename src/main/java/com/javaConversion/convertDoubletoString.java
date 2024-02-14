package com.javaConversion;

public class convertDoubletoString {

	public static void main(String[] args) {
		
		double d = 12.3;
		
		// valueOf() method
		
		String s = String.valueOf(d);
		
		// toString() method
		
		String s1 =	Double.toString(d);
		
		// Understanding string concatenation operator
		
		System.out.println(s);
		System.out.println(s1);
	}
}
