package com.coreJavaOOPSConcept1;

public class ClassAndObject {
	
	// Class is an entity which has properties in the form of variables and methods	
	// Class variable / Global variable
	
	int model;
	int wheel;

	public static void main(String[] args) {
		
		// Object 
		// new Car(); is called the object of car class
		// new keyword is used to create the object
		// a,b,c is the object reference variable
		
		ClassAndObject a = new ClassAndObject();
		ClassAndObject b = new ClassAndObject();
		ClassAndObject c = new ClassAndObject();
		
		a.model = 2015;
		a.wheel = 4;
		
		b.model = 2014;
		b.wheel = 4;
		
		c.model = 2013;
		c.wheel = 4;
		
		System.out.println("Before assigning the reference");
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		a = b;
		b = c;
		c = a;
		
		System.out.println("After assigning the reference");
		
		a.model = 10;
		System.out.println(a.model); // 10
		
		c.model = 20;
		System.out.println(a.model); // 20
		System.out.println(c.model); // 20

	}

}
