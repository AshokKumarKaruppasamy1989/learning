package com.coreJavaPrograms;

public class SwapTwoStringWithoutTempVar {

	public static void main(String[] args) {
		// Swap values of two variables without direct reassignment and without creating any extra variables
		
		String A = "Hello";
		String B = "World";
		
		System.out.println("Before Swapping : ");
		System.out.println("The value of A is : " + A);
		System.out.println("The value of B is : " + B);
		
		// 1. Append String A and B in A variable

		A = A + B;
		
		// 2. Store the String A in String B
		
		B = A.substring(0, A.length()-B.length());
		
		// 3. Store the String B in String A
		
		A = A.substring(B.length());
		
		System.out.println("After Swapping : ");
		System.out.println("The value of A is : " + A);
		System.out.println("The value of B is : " + B);
		
	}

}
