package com.javaStringPrograms;

public class compareTwoStrings {
	
	public static void main(String[] args) {
		
		String src = "TEXT";
		String target = "text";
		
		if (src.equals(target)) {
			System.out.println("Both strings are equal");
		} else {
			System.out.println("Both strings are not equal");
		}
		
		if (src.equalsIgnoreCase(target)) {
			System.out.println("Both strings are equal");
		} else {
			System.out.println("Both strings are not equal");
		}
	}
}
