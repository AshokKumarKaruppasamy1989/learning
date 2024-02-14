package com.practical;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashMapIterate {

	public static void main(String[] args) {

		HashMap<String, String> capitalCities = new HashMap<String, String>();

		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");

		/*
		 * for (Entry<String, String> set : capitalCities.entrySet()) {
		 * 
		 * System.out.println(set.getKey() + " = " + set.getValue());
		 * 
		 * }
		 */
		
		/*
		 * System.out.println(capitalCities.get("USA"));
		 * 
		 * System.out.println("\nKey:"); for (String i : capitalCities.keySet()) {
		 * System.out.println(i); }
		 * 
		 * System.out.println("\nValue:"); for (String i : capitalCities.values()) {
		 * System.out.println(i); }
		 */
		
		for (String i : capitalCities.keySet()) {
			System.out.println("Key : " + i + " & Value : " + capitalCities.get(i));
		}
	}
}
