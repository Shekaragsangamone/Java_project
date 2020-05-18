package com.interview.java.practice;

import java.util.Scanner;

public class Polindrome {
	public static void main (String []args) {
		String reverse = "",original="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number or String");
		original = scanner.nextLine();
		scanner.close();
		int n = original.length();
		for(int i=n-1;i>-1;i--) {
			reverse = reverse+original.charAt(i);
		}
		if(original.equalsIgnoreCase(reverse))
			System.out.println(original+" is polindrome");
		else
			System.out.println(original+" is not a polindrome");

	}
}
