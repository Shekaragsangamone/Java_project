package com.interview.java.practice;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main (String args[]) {
		int temp = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter second number");
		int secondNumber = scanner.nextInt();
		scanner.close();
		System.out.println("Before swaping :"+firstNumber+ " "+secondNumber);
		
		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("After swaping :"+firstNumber+ " "+secondNumber);
		
	}
}
