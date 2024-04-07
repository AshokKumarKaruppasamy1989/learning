package com.coreJavaPrograms;

public class StringBuilderStringReverse {

	public static void main(String[] args) {
		// Write a method that will take one string as an argument and will return the
		// reverse version of this string.

		// StringBuilder in Java represents a mutable sequence of characters. Since the
		// String Class in Java creates an immutable sequence of characters, the
		// StringBuilder class provides an alternative to String Class

		String input = "cat";

		StringBuilder rev = new StringBuilder(input);

		// append
		rev.append("s");
		System.out.println("Appended String : " + rev.toString());

		// create a StringBuilder object using StringBuilder(CharSequence) constructor
		StringBuilder str = new StringBuilder("AAABBBCCC");
		System.out.println("Character Sequence : " + str);

		// create a StringBuilder object using StringBuilder(capacity) constructor
		StringBuilder cap = new StringBuilder(10);
		System.out.println("Capacity : " + cap.capacity());

		// create a StringBuilder object using StringBuilder(String) constructor
		StringBuilder str2 = new StringBuilder(str.toString());

		// print string
		System.out.println("String : " + str2.toString());

		// reverse
		rev.reverse();
		System.out.println("Reversed String : " + rev.toString());
		
		//insert
		str2.insert(0, "aaa");
		System.out.println("Modified String : " + str2.toString());

	}

}
