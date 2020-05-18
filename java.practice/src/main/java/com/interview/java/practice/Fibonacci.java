package com.interview.java.practice;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String []args) {
		int thirdNumber = 0 , count =10;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first Number ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter second Number ");
		int secondNumber = scanner.nextInt();

		scanner.close();
		System.out.print(+firstNumber+" "+secondNumber);
		for(int i=2;i<10;i++) {
			thirdNumber = firstNumber+secondNumber;
			System.out.print(" "+thirdNumber);
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}


	}

}
