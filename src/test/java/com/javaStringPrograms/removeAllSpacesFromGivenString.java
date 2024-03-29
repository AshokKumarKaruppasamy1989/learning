package com.javaStringPrograms;

import java.util.Scanner;

public class removeAllSpacesFromGivenString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string:");
		
		String str = s.nextLine();
		
		System.out.println(str);
		
		str = str.replaceAll("\\s", "");
		
		System.out.println("Text after removing space : " + str);
		
		s.close();

	}

}
