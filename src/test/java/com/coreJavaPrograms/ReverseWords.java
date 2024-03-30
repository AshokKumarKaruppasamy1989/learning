package com.coreJavaPrograms;

public class ReverseWords {

	public static void main(String[] args) {
		// Write a method that will take a string as an argument. The method will reverse the position of words and return it.
		
		String inp = " Welcome to   Java Programming ";
		System.out.println(reverseWords(inp));
		
		// Alternate
		
//		String rev = "";
//		
//		String[] str = inp.split(".");
//		
//		for (int i = str.length - 1; i >= 0; i--) {
//			rev += str[i] + ".";
//		}
//		
//		System.out.println(rev.substring(0, rev.length()-1));

	}
	
	
	static String reverseWords(String s) {
		
		String [] words = s.split(" +");
		
		StringBuilder str = new StringBuilder();
		
		for (int i = words.length-1; i >= 0; i--) {
			str.append(words[i]);
			str.append(" ");
		}
		return str.toString().trim();		
	}

}
