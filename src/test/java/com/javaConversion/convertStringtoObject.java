package com.javaConversion;

public class convertStringtoObject {

	public static void main(String[] args) throws Exception {
		
		example1();
		example2();

	}
	
	public static void example1() {
		
		String s = "hello";
		Object obj = s;
		System.out.println(obj);		
	}
	
	public static void example2() throws Exception {
		
		Class c = Class.forName("java.lang.String");
		
		System.out.println("class name: " + c.getName());
		
		System.out.println("super class name: " + c.getSuperclass().getName());
		
	}
}
