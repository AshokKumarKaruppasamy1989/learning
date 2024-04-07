package com.coreJavaPrograms;

public class RemoveJunkSpecialCharacters2 {

	public static void main(String[] args) {
		// Remove the junk or special characters
		
		String str = "@#$$ Test*(&& Selenium";
		
		// Regular expressions
		
		str = str.replaceAll(("[^a-zA-Z0-9]"), "");
		System.out.println(str);

	}

}
