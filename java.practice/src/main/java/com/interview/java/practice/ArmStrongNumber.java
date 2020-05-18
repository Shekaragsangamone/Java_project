package com.interview.java.practice;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main (String ... args) {
		 int remainder,sum=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		int temp = num;
		scanner.close();
		while(num>0) {
		remainder = num%10;
		sum = sum + remainder*remainder*remainder;
		num = num/10;
	}
	if (temp == sum) {
		System.out.println(+temp+ " is armstrongnumber");
	}else
		System.out.println(+temp+" is not a armstrongnumber");
		
	}
	

}
