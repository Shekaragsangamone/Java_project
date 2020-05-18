package com.interview.java.practice;

import java.util.Scanner;

public class LeapYear {
	public static void main (String args[]) {
		boolean leap = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any year ");
		int year = scanner.nextInt();
		scanner.close();

		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400==0) {
					leap =true;

				}else
					leap = false;

			}else
				leap = true;

		}else 
			leap = false;
		if(leap) 
			System.out.println(+year+" is a leap year");
		else
			System.out.println(+year+ " is not a leap year");

	}

}
