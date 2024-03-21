package com.coreJavaOOPSConcept1;

public class Functions {
	
	// Functions and methods are same

	public static void main(String[] args) {
		
		Functions fun = new Functions();
		fun.test();
		int val = fun.test1();
		System.out.println(val);
		String str = fun.test2();
		System.out.println(str);
		int div = fun.test3(10, 10);
		System.out.println(div);
		
		// main method is void - it never returns a value

	}
	
	// non static methods
	// 1. no input, no output method
	// return type - void (doesn't return any value) Null will be returned
	// test() - method name
	
	public void test() {
		System.out.println("test method");
	}
	
	// 2. no input, some output method
	// return type - integer (int keyword is used to return the value)
	
	public int test1() {
		System.out.println("test1 method");
		int i = 10;
		int j = 20;
		int k = i + j;
		
		return k;		
	}
	
	// return type - String (String keyword is used to return the value)
	
	public String test2() {
		System.out.println("test2 method");
		String s = "Selenium";
		
		return s;
	}
	
	// 3. some input, some output method
	// return type - integer (int keyword is used to return the value)	
	
	public int test3(int x, int y) {
		System.out.println("test3 method");
		int z = x/y;
		
		return z;
	}

}
