package com.test.java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMultiplication {
	
	public static void main (String args[]) {
		int m=0,j=0,k=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number of elements you want in array");
		int numbers = scanner.nextInt();
		
		int [] arr=new int[numbers];
		System.out.println("Enter all the elements");
		for(int i=0;i<numbers;i++) {
			 arr[i]=scanner.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				m=3*arr[i];
			}else if(arr[i]%21==0 && arr[i]%7==0) {
				k=arr[i]*9;
			}
			
			else if(arr[i]%7==0) {
				j=arr[i]*5;
			}
		}
		
		System.out.println("mul "+m+" "+j+" "+k);
		
	}

}
