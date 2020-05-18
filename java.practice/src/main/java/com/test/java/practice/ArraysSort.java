package com.test.java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSort {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String value = scanner.nextLine();
		//scanner.nextLine();
		
		String array[]= value.split("2");
		
		System.out.println("Array"+Arrays.toString(array));
		
		
		
		
	}

}
