package com.javaStringPrograms;

import java.util.Scanner;

public class getUserInputAndPrintOnScreen {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = s.nextLine();
		
		System.out.println("You enetered string: " + str);
		
		System.out.println("\nEnter the Integer:");
		int i = s.nextInt();
		
		System.out.println("You enetered integer: " + i);
		
		System.out.println("\nEnter the Float:");
		float f = s.nextFloat();
		
		System.out.println("You enetered float: " + f);
		
		s.close();
	}
}
