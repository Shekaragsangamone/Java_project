package com.java.summer.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
	public static void main (String []args) {
		int sum=0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many elements you want in an array");
		int num = scanner.nextInt();
		int array[] = new int[num];
		System.out.println("Enter the elements");
		for(int i=0;i<num;i++){
			array[i] = scanner.nextInt();
		}
		for(int i : array) {
			sum=sum+i;

		}
		System.out.println("array is"+Arrays.toString(array));
		System.out.println("sum of array is "+sum);

	}
}
