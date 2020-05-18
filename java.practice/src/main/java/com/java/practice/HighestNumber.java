package com.java.practice;

public class HighestNumber {


	
	public static void main(String args[]) {
		int array[]= {-1,-2,-3};
		check(array);

	}

	static void check(int arrayElement[]) {
		int maximum=-127;
		
		for(int i=0;i<arrayElement.length;i++) {

			int arrayEle = arrayElement[i];
			if(arrayEle > maximum) {
				maximum = arrayEle;
			}
		}
		System.out.println("The Highest number is "+maximum);
	}
}