package com.interview.java.practice;

import java.util.Scanner;

public class PrimeNumber {
	static boolean isPrime=true;
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		scanner.close();
		for(int i=2;i<num/2;i++) {
			int temp = num%i;
			if(temp == 0) {
				isPrime=false;
			}
			
		}
		if(isPrime==true)
			System.out.println(+num+" is prime Number");
		else
			System.out.println(+num+" is not a prime number");
	}
	
}
