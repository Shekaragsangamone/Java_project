package com.test.java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysNameSort {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array");
		int number=scanner.nextInt();
		String array[] = new String[number];
		System.out.println("Enter all the elements");
		for(int i=0;i<number;i=i++) {
			scanner.nextLine();
			array[i]=scanner.nextLine();
		}
		System.out.println("Before Sorting"+Arrays.toString(array));
		System.out.println("After Sorting");
		Arrays.sort(array);
		for(String temp: array) {
			System.out.println(temp);
		}
	}
}