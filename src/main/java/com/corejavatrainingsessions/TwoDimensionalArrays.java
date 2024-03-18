package com.corejavatrainingsessions;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// 2D Array - Rows X Columns
		
		String s[][] = new String[3][4];
		
		System.out.println(s.length); // 3 - Total number of rows
		System.out.println(s[0].length); // 4 - Total number of coulmns
		
		s[0][0] = "A";
		s[0][1] = "B";
		s[0][2] = "C";
		s[0][3] = "D";
		
		s[1][0] = "A1";
		s[1][1] = "B1";
		s[1][2] = "C1";
		s[1][3] = "D1";
		
		s[2][0] = "A2";
		s[2][1] = "B2";
		s[2][2] = "C2";
		s[2][3] = "D2";
		
//		System.out.println(s[0][1]); // B
//		System.out.println(s[1][2]); // C1
//		System.out.println(s[2][0]); // A2
		
		// Print all the values in 2D array
		// row = 0, col = 0 to 3
		// row = 1, col = 0 to 3
		// row = 2, col = 0 to 3
		
		for (int row = 0; row < s.length; row++) {
			for (int column = 0; column < s[0].length; column++) {
				System.out.println(s[row][column]);
			}
		}
	}
}
