package com.test.java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no  of elements you want in array");
		int number = scanner.nextInt();
		int[] array=new int[number];
		System.out.println("Enter all the elements");

		for(int i=0;i<number;i++) {
			array[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the flag Number 1 or 2");
		//scanner.nextLine();
		int flag = scanner.nextInt();
 
		if(flag==1) {
			for(int i=0;i<array.length;i++) {
				if(array[i]%2==0) {
					sum =sum+array[i];
				}
				
			}
			System.out.println("Array is "+Arrays.toString(array));
			System.out.println("Sum of even Number is "+sum);
		}else if(flag==2) {
			for(int i=0;i<array.length;i++) {
				if(array[i]%2!=0) {
					sum = sum+array[i];
				}
			}
			System.out.println("Array is "+Arrays.toString(array));
			System.out.println("Sum of odd Number is "+sum);
		}
	}
}
