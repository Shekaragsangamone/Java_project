package com.interview.java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the String ");
		String values = scanner.nextLine();
		scanner.close();
		String [] array =values.split(",");

		System.out.println("array is :"+Arrays.toString(array));		 
		String largest = array[0];
		String secondLargest = array[0];
		int n = array.length;
		System.out.println(n);
		for (int i=0;i<array.length;i++) {
			if(Integer.parseInt(array[i])>Integer.parseInt(largest)) {
				//largest = array[i];
				secondLargest = largest;
				largest = array[i];
			}else if(Integer.parseInt(array[i])>Integer.parseInt(secondLargest)) {
				secondLargest = array[i];
			}


		}
		System.out.println("Second largest number in an array is :"+secondLargest);
	}
}