package com.test.java.practice;

public class Arrays {
	public static void main(String args[]) {
		
		int array[]= {10,2,3,4,5};
		
		for (int i=0; i<array.length-1;i++) {
			if(array[i]>array[i+1]) {
				System.out.println(array[i]);
			}
		}
	}

	 

	 
}
