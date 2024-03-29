package com.practical;

public class checkStringIsNumeric {

	public static void main(String[] args) {
		// Check given string is numeric

		String str = "123.AA";
		boolean numeric = true;

		try {
			Double num = Double.parseDouble(str);

		} catch (NumberFormatException e) {
			numeric = false;
		}

		if (numeric) {
			System.out.println(str + " is a number");
		} else {
			System.out.println(str + " is not a number");
		}
	}

}
