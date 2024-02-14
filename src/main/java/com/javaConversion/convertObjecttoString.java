package com.javaConversion;


class Emp {}

public class convertObjecttoString {

	public static void main(String[] args) throws Exception {

		//example1();
		//example2();
		example3();

	}

	public static void example1() throws Exception {

		Emp e = new Emp();

		String s = e.toString();
		String s1 = String.valueOf(e);

		System.out.println(s);
		System.out.println(s1);

	}
	
	public static void example2() throws Exception {
		
		String s = "hello";
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		String rev = sb.toString();
		
		System.out.println("String is: " + s);
		System.out.println("Reverse string is: " + rev);
	}
	
	public static void example3() throws Exception {
		
		String s = "radar";
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		String rev = sb.toString();
		
		if (rev.equals(s)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not Palindrome String");
		}
	}
}
