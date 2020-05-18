package com.interview.java.practice;

import java.util.Scanner;

public class StringReverse {
	public static void main (String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String to be reversed");
		String name = scanner.nextLine();
		scanner.close();
		
		char[] chars = name.toCharArray();
		
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
				
		}
		
	}

}
