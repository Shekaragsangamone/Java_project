package com.java.summer.practice;

import java.util.Scanner;

public class Number {
	public static void main (String []args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scanner.nextInt();

		if(number%2==0) {
			System.out.println(+number+" is even number");
		}else
			System.out.println(+number+" is odd number");

	}

}
