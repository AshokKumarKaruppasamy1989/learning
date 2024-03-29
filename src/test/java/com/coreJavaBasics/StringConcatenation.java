package com.coreJavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c = 10.22;
		double d = 15.22;
		
		//Traverse from left to right
		
		// + is a concatenation operator
		
		System.out.println(a+b); //100+200 = 300
		System.out.println(x+y); //Hello+World
		System.out.println(a+b+x+y); //100+200+Hello+World = 300HelloWorld
		System.out.println(x+y+a+b); //Hello+World+100+200 = HelloWorld100200
		System.out.println(x+y+(a+b)); //Hello+World+(100+200) = HelloWorld300
		System.out.println(a+b+x+y+a+x+b+y); //100+200+Hello+World+100+Hello+200+World = 300HelloWorld100Hello200World
		System.out.println(c+d); //10.22+15.22 = 25.44
		System.out.println(x+y+c+d); //Hello+World+10.22+15.22 = HelloWorld10.2215.22
		
//		println - is used to print on the console with a new line
//		print - is used to print on the console
		System.out.print("Hello Selenium");
		System.out.println("Hello Testing");
	}

}
