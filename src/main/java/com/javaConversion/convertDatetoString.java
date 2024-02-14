package com.javaConversion;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class convertDatetoString {

	public static void main(String[] args) throws Exception {

		// example1();
		example2();

	}

	public static void example1() throws Exception {

		Date date = Calendar.getInstance().getTime();

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		String sDate = dateFormat.format(date);

		System.out.println(sDate);

	}

	public static void example2() throws Exception {

		Date date = new Date();

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String sDate = formatter.format(date);
		System.out.println("Date format with dd/MM/yyyy: " + sDate);

		formatter = new SimpleDateFormat("dd-MMM-yyyy");
		sDate = formatter.format(date);
		System.out.println("Date format with dd-MMM-yyyy: " + sDate);

		formatter = new SimpleDateFormat("MM dd, yyyy");
		sDate = formatter.format(date);
		System.out.println("Date format with MM dd, yyyy: " + sDate);
		
		formatter = new SimpleDateFormat("E, MMM dd yyyy");
		sDate = formatter.format(date);
		System.out.println("Date format with E, MMM dd yyyy: " + sDate);
		
		formatter = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss z");
		sDate = formatter.format(date);
		System.out.println("Date format with E, MMM dd yyyy HH:mm:ss z: " + sDate);
		
		formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss zzzz");
		sDate = formatter.format(date);
		System.out.println("Date format with dd-MMM-yyyy HH:mm:ss zzzz: " + sDate);
	}
}