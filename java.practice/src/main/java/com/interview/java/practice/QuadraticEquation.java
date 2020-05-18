package com.interview.java.practice;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main (String args[]) {
		double firstRoot=0.0;double secondRoot=0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		double a = scanner.nextDouble();
		System.out.println("Enter the value of b :");
		double b = scanner.nextDouble();
		System.out.println("Enter the value of c :");
		double c = scanner.nextDouble();
		
		double sum = b*b-4*a*c;
		double sqrt = Math.sqrt(sum);
		
		if(sum > 0) {
		firstRoot= (-b+sqrt)/(2*a);
		 secondRoot = (-b-sqrt)/(2*a);
	
		}/*else if(sum==0) {
			
			firstRoot1= +(-b+sqrt)/(2*a);
		}*/

		System.out.println("Roots are "+firstRoot +" and "+secondRoot);
		//System.out.println("Roots are "+firstRoot1);
	}

}
