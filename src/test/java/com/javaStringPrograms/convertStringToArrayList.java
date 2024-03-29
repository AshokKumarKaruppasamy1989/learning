package com.javaStringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertStringToArrayList {

	public static void main(String[] args) {
		String strings = "10,20,30,40,50,60,70,80,90";
		
		String str[] = strings.split(",");
		
		List<String> array = new ArrayList<String>();		
		array = Arrays.asList(str);
		
		for (String s: array) {
			System.out.println(s);
		}
	}
}
