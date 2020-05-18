package com.interview.java.practice;

import java.util.Scanner;

public class Reverse {

	public static void main(String []args) {
		String reverse="";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String to be reversed");
		String input = scanner.nextLine();
		scanner.close();
		int n=input.length();

		for(int i=n-1;i>-1;i--) {
			reverse =reverse + input.charAt(i);

		}
		System.out.println("Reversed String is :"+reverse);
	}

}
