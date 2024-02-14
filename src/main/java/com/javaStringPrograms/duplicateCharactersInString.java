package com.javaStringPrograms;

public class duplicateCharactersInString {

	public static void main(String[] args) {
		String str = "radar";
		int count = 0;
		
		char[] inp = str.toCharArray();
		
		System.out.println("Duplicate characters are: ");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j ++) {
				if (inp[i] == inp[j]) {
					System.out.println(inp[j]);
					count++;
					break;
				}
			}
		}
		System.out.println("Count of duplicate characters are : " + count);

	}

}
