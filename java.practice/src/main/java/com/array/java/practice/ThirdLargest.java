package com.array.java.practice;

import java.util.Arrays;

public class ThirdLargest {
	public static void main (String []args) {
		int [] array = {21,54,23,65,56,89};
		int n= array.length;
		for(int i=0;i<n;i++)
			for(int j=0;j<n-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}
				
			}
		System.out.println("Array is :"+Arrays.toString(array));		
		System.out.println("Third largest number is :"+array[n-3]);
	}

}
