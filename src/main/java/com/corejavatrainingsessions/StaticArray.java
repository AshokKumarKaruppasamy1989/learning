package com.corejavatrainingsessions;

public class StaticArray {

	public static void main(String[] args) {
		// array - to store similar data type values in a array variable
		
		// one dimensional arrays ( integer, double, char, boolean, String)
		// Disadvantage of static array 
		// 1. size is fixed --> To overcome this problem we use collections (ArrayList, HashTable, etc..) which is also called dynamic array
		// 2. store similar data types --> To overcome this problem we use Object Array
		
		// integer array
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[1]);
		System.out.println(i[3]);
		
//		System.out.println(i[4]); // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		
		// Get the size/length of the array
		System.out.println(i.length);
		
		// Print all the values in array - use for loop to iterate all the values in array
		
		for (int j = 0; j <i.length; j++) {
			System.out.println(i[j]);
		}
		
		
		// double array
		
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 23.55;
		d[2] = 45.88;
		
		System.out.println(d[1]);
		
		// char array
		
		char c[] = new char[3];
		c[0] = 'e';
		c[1] = 2;
		c[2] = '#';
		
		System.out.println(c[2]);
		
		// boolean array
		
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		System.out.println(b[1]);
		
		// string array
		
		String s[] = new String[3];
		s[0] = "hello";
		s[1] = "world";
		s[2] = "selenium";
		
		System.out.println(s.length);
		
		// object array - object is a super class of all class
		// It is used to store all data type values
		
		Object obj[] = new Object[6];
		obj[0] = "Tom"; // String
		obj[1] = 25; // integer
		obj[2] = 12.33; // double
		obj[3] = "01/01/1990"; 
		obj[4] = 'M'; // char
		obj[5] = true; //boolean
		
		System.out.println(obj[1]);
		System.out.println(obj.length);
		
		
	}

}
