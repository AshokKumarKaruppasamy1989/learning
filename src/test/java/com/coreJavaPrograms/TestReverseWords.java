package com.coreJavaPrograms;

public class TestReverseWords {

	public static void main(String[] args) {
		String inp = " Welcome.to.Java.Programming ";
		System.out.println(reverseWords(inp));

	}

	static String reverseWords(String str) {

		String rev = "";
		str = str.trim();
		String[] words = str.split("\\.");

		StringBuilder sb = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]);
			sb.append(".");

		}

		return sb.toString().trim();

//		for (int i = spl.length -1 ; i >= 0; i--) {
//			rev += spl[i] + ".";
//		}	
//		
//		return rev.substring(0, rev.length()-1);
	}

}
