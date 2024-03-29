package com.javaNumberPrograms;

import java.util.Random;
import java.util.Scanner;

public class generateRandomNumbers {

	public static void main(String[] args) {
		//example1();
		example2();

	}

	public static void example1() {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Enter the maximum range:");
		int maxRange = s.nextInt();

		for (int i = 1; i <= 5; i++) {
			System.out.println(rand.nextInt(maxRange));
		}

		s.close();
	}

	public static void example2() {
	
		Random rand = new Random();

		int minRange = 100, maxRange = 500;

		int value = rand.nextInt(maxRange - minRange) + minRange;
		System.out.println(value);

	}
}
