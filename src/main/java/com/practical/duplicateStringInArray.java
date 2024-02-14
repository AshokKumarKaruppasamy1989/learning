package com.practical;

public class duplicateStringInArray {

	public static void main(String[] args) {

		String[] data = { "aab", "bcc", "cdd", "aab", "dee", "eff", "cdd", "fgg", "bcc" };

		for (int i = 0; i < data.length - 1; i++) {

			for (int j = i + 1; j < data.length; j++) {

				if ((data[i] == data[j]) && (i != j)) {

					System.out.println("Duplicate string : " + data[i]);

				}
			}
		}
	}
}
